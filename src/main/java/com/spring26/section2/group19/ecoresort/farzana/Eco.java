package com.spring26.section2.group19.ecoresort.farzana;

public class Eco {
    private String Activity;

    public Eco(String activity) {
        Activity = activity;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }

    @Override
    public String toString() {
        return "Eco{" +
                "Activity='" + Activity + '\'' +
                '}';
    }
}
