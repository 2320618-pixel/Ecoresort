package com.spring26.section2.group19.ecoresort;

public class Maintenance {
    private String StuffLocation;
    private String issuesType;
    private String savesInput;

    public Maintenance(String stuffLocation, String issuesType, String savesInput) {
        StuffLocation = stuffLocation;
        this.issuesType = issuesType;
        this.savesInput = savesInput;
    }

    public String getStuffLocation() {
        return StuffLocation;
    }

    public void setStuffLocation(String stuffLocation) {
        StuffLocation = stuffLocation;
    }

    public String getIssuesType() {
        return issuesType;
    }

    public void setIssuesType(String issuesType) {
        this.issuesType = issuesType;
    }

    public String getSavesInput() {
        return savesInput;
    }

    public void setSavesInput(String savesInput) {
        this.savesInput = savesInput;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "StuffLocation='" + StuffLocation + '\'' +
                ", issuesType='" + issuesType + '\'' +
                ", savesInput='" + savesInput + '\'' +
                '}';
    }
}
