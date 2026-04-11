package com.spring26.section2.group19.ecoresort.Ayesha;

public class ServiceAssignment {
    public String bookingID;
    public String serviceType;
    public String priority;
    public String note;

    public ServiceAssignment(String bookingID, String serviceType, String priority, String note) {
        this.bookingID = bookingID;
        this.serviceType = serviceType;
        this.priority = priority;
        this.note = note;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ServiceAssignment{" +
                "bookingID='" + bookingID + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", priority='" + priority + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
