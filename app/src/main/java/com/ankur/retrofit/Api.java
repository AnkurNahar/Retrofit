package com.ankur.retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface Api {

    @FormUrlEncoded
    @POST("/get_all_promotion")
    Call<PromoData> getPromoData(@Field("access_token") String authToken);
}
