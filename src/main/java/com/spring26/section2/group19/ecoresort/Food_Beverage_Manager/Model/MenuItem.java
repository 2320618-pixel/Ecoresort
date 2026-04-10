package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager.Model;

import java.io.Serializable;

public class MenuItem implements Serializable {

    private String name;
    private String category;
    private double price;
    private String availability;

    public MenuItem(String name, String category, double price, String availability) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.availability = availability;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public String getAvailability() { return availability; }
}