package com.spring26.section2.group19.ecoresort;

public class booking {
    private int booking;
    private String name;
    private String password;

    public booking(int booking, String name, String password) {
        this.booking = booking;
        this.name = name;
        this.password = password;
    }

    public int getBooking() {
        return booking;
    }

    public void setBooking(int booking) {
        this.booking = booking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "booking{" +
                "booking=" + booking +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
