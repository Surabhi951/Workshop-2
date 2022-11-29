package com.bridgelabz;

public class Room1 extends Hotel{
    private String ac;
    private float price;
    private String bed;

    public Room1(String ac, float price, String bed) {
        this.ac = ac;
        this.price = price;
        this.bed = bed;
    }


    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
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
