package com.spring26.section2.group19.ecoresort.farzana;

public class receptionist {
    private int receptionistId;
    private String name;
    private String password;

    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public receptionist(int receptionistId, String name, String password) {
        this.receptionistId = receptionistId;
        this.name = name;
        this.password = password;

    }

    @Override
    public String toString() {
        return "receptionist{" +
                "receptionistId=" + receptionistId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
