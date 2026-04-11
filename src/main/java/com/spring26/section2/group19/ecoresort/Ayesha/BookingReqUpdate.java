package com.spring26.section2.group19.ecoresort.Ayesha;

public class BookingReqUpdate {
    private String date;
    private int numberOfGuests;
    private String requirements;
    private String status;

    public BookingReqUpdate(String date, int numberOfGuests, String requirements, String status) {
        this.date = date;
        this.numberOfGuests = numberOfGuests;
        this.requirements = requirements;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookingReqUpdate{" +
                "date='" + date + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                ", requirements='" + requirements + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
