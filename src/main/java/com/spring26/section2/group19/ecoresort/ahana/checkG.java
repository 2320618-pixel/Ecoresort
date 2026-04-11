package com.spring26.section2.group19.ecoresort.ahana;

public class checkG {
    private String guestDetailCol;
    private int roomNumberCol;

    public checkG(String guestDetailCol, int roomNumberCol) {
        this.guestDetailCol = guestDetailCol;
        this.roomNumberCol = roomNumberCol;
    }

    public String getGuestDetailCol() {
        return guestDetailCol;
    }

    public void setGuestDetailCol(String guestDetailCol) {
        this.guestDetailCol = guestDetailCol;
    }

    public int getRoomNumberCol() {
        return roomNumberCol;
    }

    public void setRoomNumberCol(int roomNumberCol) {
        this.roomNumberCol = roomNumberCol;
    }

    @Override
    public String toString() {
        return "checkG{" +
                "guestDetailCol='" + guestDetailCol + '\'' +
                ", roomNumberCol=" + roomNumberCol +
                '}';
    }
}
