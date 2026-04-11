package com.spring26.section2.group19.ecoresort.ahana;

public class ExtraCharges {
    private String item;
    private int bill;

    public ExtraCharges(String item, int bill) {
        this.item = item;
        this.bill = bill;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "ExtraCharges{" +
                "item='" + item + '\'' +
                ", bill=" + bill +
                '}';
    }
}
