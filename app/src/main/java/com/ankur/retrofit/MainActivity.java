package com.ankur.retrofit;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    public List<PromoInfo> info;
    private String token = "2563a3592c33d37f7f5583b5525fea2fc09177b65ebb6e5e9f9ee4adc1a53e07";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<MyPromo> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //progress bar
        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("Loading....");
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                progressDialog.dismiss();
            }
        }).start();
        progressDialog.show();





        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("https://test-api.obhai.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<PromoData> call = api.getPromoData(token);

        call.enqueue(new Callback<PromoData>() {
            @Override
            public void onResponse(Call<PromoData> call, Response<PromoData> response) {
                Log.d("blahhjhgu", "onResponse: "+response.body());
                if(!response.isSuccessful()){
                    textViewResult.setText("Code: "+response.code());
                    return;
                }

                recyclerView = findViewById(R.id.recyclerId);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                listItems = new ArrayList<>();

                PromoData promos = response.body();
                info = promos.getPromoInfo();
                for(int i=0; i<info.size(); i++){
                    MyPromo listItem = new MyPromo(
                            "Coupon Number: "+info.get(i).getNoOfCoupon(),
                            "Vehicle Type: "+info.get(i).getVehicleType(),
                            "Promo Code: "+info.get(i).getPromoCode(),
                            "Promo ID: "+info.get(i).getPromoId(),
                            "Expiration Date: "+info.get(i).getExpiryDate(),
                            "Is Default: "+info.get(i).getIsDefault(),
                            "blah blah",
                            "Description: "+info.get(i).getDescription()

                    );

                    listItems.add(listItem);

                }
                adapter = new MyListAdapter(listItems, MainActivity.this);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<PromoData> call, Throwable t) {
                textViewResult.setText(t.getMessage());

            }
        });



    }
}
