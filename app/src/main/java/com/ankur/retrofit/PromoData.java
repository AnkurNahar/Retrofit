package com.ankur.retrofit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromoData {

    @SerializedName("log")
    @Expose
    private String log;

    @SerializedName("flag")
    @Expose
    private int flag;

    @SerializedName("promo_data")
    @Expose
    private List<PromoInfo> promoInfo;

    public String getLog() {
        return log;
    }

    public int getFlag() {
        return flag;
    }

    public List<PromoInfo> getPromoInfo() {
        return promoInfo;
    }


    @Override
    public String toString() {
        return "PromoData{" +
                "log='" + log + '\'' +
                ", flag=" + flag +
                ", promoInfo=" + promoInfo +
                '}';
    }
}
