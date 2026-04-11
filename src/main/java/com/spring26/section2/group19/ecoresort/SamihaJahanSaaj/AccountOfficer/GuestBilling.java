package com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.AccountOfficer;

public class GuestBilling {
    private String guestId;
    private String guestName;
    private double balance;

    public GuestBilling(String guestId, String guestName, double balance) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.balance = balance;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "GuestBilling{" +
                "guestId='" + guestId + '\'' +
                ", guestName='" + guestName + '\'' +
                ", balance=" + balance +
                '}';
    }
}