package com.spring26.section2.group19.ecoresort.ahana;

public class cancel {
    private String bookingId;
    private String email;
    private String policy;
    private String refund;

    public cancel(String bookingId, String email, String policy, String refund) {
        this.bookingId = bookingId;
        this.email = email;
        this.policy = policy;
        this.refund = refund;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund;
    }

    @Override
    public String toString() {
        return "cancel{" +
                "bookingId='" + bookingId + '\'' +
                ", email='" + email + '\'' +
                ", policy='" + policy + '\'' +
                ", refund='" + refund + '\'' +
                '}';
    }
}
