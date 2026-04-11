package com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.ResortManagement;

public class RoomPricing {
    private String roomType;
    private double price;

    public RoomPricing(String roomType, double price) {
        this.roomType = roomType;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomPricing{" +
                "roomType='" + roomType + '\'' +
                ", price=" + price +
                '}';
    }
}