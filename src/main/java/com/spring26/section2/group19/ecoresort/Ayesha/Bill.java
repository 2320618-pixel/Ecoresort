package com.spring26.section2.group19.ecoresort.Ayesha;

public class Bill {
    private String bookingID;
    private String itemType;
    private int days;
    private double pricePerDay;
    private double discount;
    private double totalAmount;
    private String checkOutDate;
    private String billDetails;

    public Bill(String checkOutDate, String bookingID, String itemType, int days, double pricePerDay, double discount, double totalAmount, String billDetails) {
        this.checkOutDate = checkOutDate;
        this.bookingID = bookingID;
        this.itemType = itemType;
        this.days = days;
        this.pricePerDay = pricePerDay;
        this.discount = discount;
        this.totalAmount = totalAmount;
        this.billDetails = billDetails;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(String billDetails) {
        this.billDetails = billDetails;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bookingID='" + bookingID + '\'' +
                ", itemType='" + itemType + '\'' +
                ", days=" + days +
                ", pricePerDay=" + pricePerDay +
                ", discount=" + discount +
                ", totalAmount=" + totalAmount +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", billDetails='" + billDetails + '\'' +
                '}';
    }
}
