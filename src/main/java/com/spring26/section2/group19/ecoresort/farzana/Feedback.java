package com.spring26.section2.group19.ecoresort.farzana;

public class Feedback {
    private String Feedback;

    public Feedback(String feedback) {
        Feedback = feedback;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "Feedback='" + Feedback + '\'' +
                '}';
    }
}
