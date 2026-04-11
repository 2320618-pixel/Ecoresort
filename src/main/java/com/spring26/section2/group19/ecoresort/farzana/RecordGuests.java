package com.spring26.section2.group19.ecoresort.farzana;

public class RecordGuests {
    private String Guests;
    private String Attendance;

    public RecordGuests(String guests, String attendance) {
        Guests = guests;
        Attendance = attendance;
    }

    public String getAttendance() {
        return Attendance;
    }

    public void setAttendance(String attendance) {
        Attendance = attendance;
    }

    public String getGuests() {
        return Guests;
    }

    public void setGuests(String guests) {
        Guests = guests;
    }

    @Override
    public String toString() {
        return "RecordGuests{" +
                "Guests='" + Guests + '\'' +
                ", Attendance='" + Attendance + '\'' +
                '}';
    }
}
