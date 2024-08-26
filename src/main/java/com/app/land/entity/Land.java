package com.app.land.entity;

public class Land {

    private int landId;         /* 토지번호*/
    private String landAddress; /* 지번*/
    private int landSize;       /* 면적*/
    private int landPrice;      /* 평당 가격*/
    private int landTotalPrice; /* 공시 지가*/

    void setLandAddress(String landAddress) {
        this.landAddress = landAddress;
    }
    public String getLandAddress() {
        return landAddress;
    }

    void setLandSize(int landSize) {
        this.landSize = landSize;
    }
    public int getLandSize() {
        return landSize;
    }

    void setLandPrice(int landPrice) {
        this.landPrice = landPrice;
    }
    public int getLandPrice() {
        return landPrice;
    }

    void setLandTotalPrice(int landTotalPrice) {
        this.landTotalPrice = landPrice * landSize;
    }

    public int getLandTotalPrice() {
        return landTotalPrice;
    }
}
