package com.spring26.section2.group19.ecoresort.Ayesha;

public class SelectedActivity {
    private String date;
    private String activity;
    private String information;

    public SelectedActivity(String date, String activity, String information) {
        this.date = date;
        this.activity = activity;
        this.information = information;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "SelectedActivity{" +
                "date='" + date + '\'' +
                ", activity='" + activity + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}
