package com.spring26.section2.group19.ecoresort.Ayesha;

public class TransportRequest {
    private String bookingID;
    private String transportType;
    private String travelDate;
    private String timeSlot;
    private String pickupLocation;
    private String dropOffLocation;
    private String note;
    private String status;

    public TransportRequest(String bookingID, String transportType, String travelDate, String timeSlot, String pickupLocation, String dropOffLocation, String note, String status) {
        this.bookingID = bookingID;
        this.transportType = transportType;
        this.travelDate = travelDate;
        this.timeSlot = timeSlot;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.note = note;
        this.status = status;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TransportRequest{" +
                "bookingID='" + bookingID + '\'' +
                ", transportType='" + transportType + '\'' +
                ", travelDate='" + travelDate + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", note='" + note + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
