package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager.Model;

import java.io.Serializable;

public class RestaurantOrder implements Serializable {

    private String id;
    private String item;
    private int quantity;
    private String status;

    public RestaurantOrder(String id, String item, int quantity, String status) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.status = status;
    }

    public String getId() { return id; }
    public String getItem() { return item; }
    public int getQuantity() { return quantity; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }
}