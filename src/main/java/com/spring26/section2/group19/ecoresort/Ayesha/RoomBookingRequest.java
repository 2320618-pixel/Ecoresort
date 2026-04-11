package com.spring26.section2.group19.ecoresort.Ayesha;

public class RoomBookingRequest {
    private String bookingID;
    private String phone;
    private String roomType;
    private int numberOfGuests;
    private String checkIn;
    private String checkOut;
    private String specialRequest;

    public RoomBookingRequest(String bookingID, String phone, String roomType, int numberOfGuests, String checkIn, String checkOut, String specialRequest) {
        this.bookingID = bookingID;
        this.phone = phone;
        this.roomType = roomType;
        this.numberOfGuests = numberOfGuests;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.specialRequest = specialRequest;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    @Override
    public String toString() {
        return "RoomBookingRequest{" +
                "bookingID='" + bookingID + '\'' +
                ", phone='" + phone + '\'' +
                ", roomType='" + roomType + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                ", specialRequest='" + specialRequest + '\'' +
                '}';
    }
}
