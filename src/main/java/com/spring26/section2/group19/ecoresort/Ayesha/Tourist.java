package com.spring26.section2.group19.ecoresort.Ayesha;

import java.time.LocalDate;

import java.io.Serializable;

public class Tourist implements Serializable {
    private String name;
    private String phone;
    private String nid;
    private String gender;
    private LocalDate date;
    private String address;


    public Tourist(String name, String phone, String nid, String gender, LocalDate date, String address) {
        this.name = name;
        this.phone = phone;
        this.nid = nid;
        this.gender = gender;
        this.date = date;
        this.address = address;
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

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", nid='" + nid + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                '}';
    }
}
