package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager.Model;

import java.io.Serializable;

public class RoomServiceRequest implements Serializable {

    private String room;
    private String guest;
    private String item;
    private String status;

    public RoomServiceRequest(String room, String guest, String item, String status) {
        this.room = room;
        this.guest = guest;
        this.item = item;
        this.status = status;
    }

    public String getRoom() { return room; }
    public String getGuest() { return guest; }
    public String getItem() { return item; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }
}