package com.spring26.section2.group19.ecoresort.Security_Officer.Model;

public class SecurityReport {
    private String id;
    private String name;
    private String phone;
    private String purpose;
    private String entryTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        return "SecurityReport{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", purpose='" + purpose + '\'' +
                ", entryTime='" + entryTime + '\'' +
                '}';
    }

    public SecurityReport(String id, String name, String phone, String purpose, String entryTime) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.purpose = purpose;
        this.entryTime = entryTime;




    }
}
