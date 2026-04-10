package com.spring26.section2.group19.ecoresort.Security_Officer.Model;

import java.io.Serializable;

public class Incident implements Serializable {

    private String type;
    private String description;
    private String severity;
    private String date;

    public Incident(String type, String description, String severity, String date) {
        this.type = type;
        this.description = description;
        this.severity = severity;
        this.date = date;
    }

    public String getType() { return type; }
    public String getDescription() { return description; }
    public String getSeverity() { return severity; }
    public String getDate() { return date; }
}