package com.spring26.section2.group19.ecoresort.ahana;

public class rooms {
    private String rooms;
    private String type;
    private int capacity;
    private int price;

    public rooms(String rooms, String type, int capacity, int price) {
        this.rooms = rooms;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "rooms{" +
                "rooms='" + rooms + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
