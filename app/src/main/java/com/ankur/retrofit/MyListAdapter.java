package com.ankur.retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private List<MyPromo> listItems;
    private Context context;

    public MyListAdapter(List<MyPromo> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int postion) {
        MyPromo listItem = listItems.get(postion);
        holder.textViewCouponNum.setText(listItem.getNoOfCoupon());
        holder.textViewVehicleType.setText(listItem.getVehicleType());
        holder.textViewPromoCode.setText(listItem.getPromoCode());
        holder.textViewPromoID.setText(listItem.getPromoId());
        holder.textViewExpiryDate.setText(listItem.getExpiryDate());
        holder.textViewIsDefault.setText(listItem.getPromoId());
        holder.textViewPromoImage.setText(listItem.getPromoId());
        holder.textViewDescription.setText(listItem.getDescription());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewCouponNum;
        public TextView textViewVehicleType;
        public TextView textViewPromoCode;
        public TextView textViewPromoID;
        public TextView textViewExpiryDate;
        public TextView textViewIsDefault;
        public TextView textViewPromoImage;
        public TextView textViewDescription;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCouponNum = itemView.findViewById(R.id.couponNum);
            textViewVehicleType = itemView.findViewById(R.id.vehicleType);
            textViewPromoCode = itemView.findViewById(R.id.promoCode);
            textViewPromoID = itemView.findViewById(R.id.promoID);
            textViewExpiryDate = itemView.findViewById(R.id.expiryDate);
            textViewIsDefault = itemView.findViewById(R.id.isDefault);
            textViewPromoImage = itemView.findViewById(R.id.promoImage);
            textViewDescription = itemView.findViewById(R.id.description);
        }
    }
}

