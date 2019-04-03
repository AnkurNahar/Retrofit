package com.ankur.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromoInfo {


    @SerializedName("no_of_coupon")
    @Expose
    private int noOfCoupon;

    @SerializedName("vehicle_type")
    @Expose
    private int vehicleType;

    @SerializedName("promo_code")
    @Expose
    private String promoCode;

    @SerializedName("promo_id")
    @Expose
    private int promoId;

    @SerializedName("expiry_date")
    @Expose
    private String expiryDate;

    @SerializedName("is_default")
    @Expose
    private int isDefault;

    @SerializedName("promo_image")
    @Expose
    private String promoImage;

    @SerializedName("description")
    @Expose
    private String description;

    public PromoInfo(int noOfCoupon, int vehicleType, String promoCode, int promoId, String expiryDate, int isDefault, String promoImage, String description) {
        this.noOfCoupon = noOfCoupon;
        this.vehicleType = vehicleType;
        this.promoCode = promoCode;
        this.promoId = promoId;
        this.expiryDate = expiryDate;
        this.isDefault = isDefault;
        this.promoImage = promoImage;
        this.description = description;
    }

    public int getNoOfCoupon() {
        return noOfCoupon;
    }

    public int getVehicleType() {
        return vehicleType;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public int getPromoId() {
        return promoId;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public String getPromoImage() {
        return promoImage;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "PromoInfo{" +
                "noOfCoupon=" + noOfCoupon +
                ", vehicleType=" + vehicleType +
                ", promoCode='" + promoCode + '\'' +
                ", promoId=" + promoId +
                ", expiryDate='" + expiryDate + '\'' +
                ", isDefault=" + isDefault +
                ", promoImage='" + promoImage + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}