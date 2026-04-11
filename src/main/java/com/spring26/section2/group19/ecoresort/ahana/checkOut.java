package com.spring26.section2.group19.ecoresort.ahana;

public class checkOut {
    private String charges;
    private String item;
    private int total;

    public checkOut(String charges, String item, int total) {
        this.charges = charges;
        this.item = item;
        this.total = total;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "checkOut{" +
                "charges='" + charges + '\'' +
                ", item='" + item + '\'' +
                ", total=" + total +
                '}';
    }
}
