package com.ankur.retrofit;

public class MyPromo {


    private String noOfCoupon;
    private String vehicleType;
    private String promoCode;
    private String promoId;
    private String expiryDate;
    private String isDefault;
    private String promoImage;
    private String description;

    public MyPromo(String noOfCoupon, String vehicleType, String promoCode, String promoId, String expiryDate, String isDefault, String promoImage, String description) {
        this.noOfCoupon = noOfCoupon;
        this.vehicleType = vehicleType;
        this.promoCode = promoCode;
        this.promoId = promoId;
        this.expiryDate = expiryDate;
        this.isDefault = isDefault;
        this.promoImage = promoImage;
        this.description = description;
    }

    public String getNoOfCoupon() {
        return noOfCoupon;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public String getPromoId() {
        return promoId;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public String getPromoImage() {
        return promoImage;
    }

    public String getDescription() {
        return description;
    }
}
