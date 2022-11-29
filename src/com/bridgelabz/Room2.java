package com.bridgelabz;

public class Room2 extends Hotel {
    private String nonAc;
    private float price;
    private String bed;

    public Room2(String nonAc, float price, String bed) {
        this.nonAc = nonAc;
        this.price = price;
        this.bed = bed;
    }

    public String getNonAc() {
        return nonAc;
    }

    public void setNonAc(String nonAc) {
        this.nonAc = nonAc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }
}
