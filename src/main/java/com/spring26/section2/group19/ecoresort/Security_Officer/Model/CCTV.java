package com.spring26.section2.group19.ecoresort.Security_Officer.Model;

import java.io.Serializable;

public class CCTV implements Serializable {

    private String id;
    private String location;
    private String status;

    public CCTV(String id, String location, String status) {
        this.id = id;
        this.location = location;
        this.status = status;
    }

    public String getId() { return id; }
    public String getLocation() { return location; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }
}