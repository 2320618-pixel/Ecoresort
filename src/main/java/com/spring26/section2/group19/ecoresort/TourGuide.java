package com.spring26.section2.group19.ecoresort;

public class TourGuide {
    private int tourGuideId;
    private String name;
    private String password;

    public TourGuide(int tourGuideId, String name, String password) {
        this.tourGuideId = tourGuideId;
        this.name = name;
        this.password = password;
    }

    public int getTourGuideId() {
        return tourGuideId;
    }

    public void setTourGuideId(int tourGuideId) {
        this.tourGuideId = tourGuideId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TourGuide{" +
                "tourGuideId=" + tourGuideId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
