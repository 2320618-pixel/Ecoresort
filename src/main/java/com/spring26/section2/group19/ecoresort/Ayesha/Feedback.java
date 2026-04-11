package com.spring26.section2.group19.ecoresort.Ayesha;

public class Feedback {
    private String bookingID;
    private int rating;
    private String feedbackText;
    private String date;

    public Feedback(String bookingID, int rating, String feedbackText, String date) {
        this.bookingID = bookingID;
        this.rating = rating;
        this.feedbackText = feedbackText;
        this.date = date;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "bookingID='" + bookingID + '\'' +
                ", rating=" + rating +
                ", feedbackText='" + feedbackText + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
