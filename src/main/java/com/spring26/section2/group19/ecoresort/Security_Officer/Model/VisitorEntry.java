package com.spring26.section2.group19.ecoresort.Security_Officer.Model;

import java.io.Serializable;

public class VisitorEntry implements Serializable {

    private String name;
    private String id;
    private String purpose;
    private String date;

    public VisitorEntry(String name, String id, String purpose, String date) {
        this.name = name;
        this.id = id;
        this.purpose = purpose;
        this.date = date;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getPurpose() { return purpose; }
    public String getDate() { return date; }
}