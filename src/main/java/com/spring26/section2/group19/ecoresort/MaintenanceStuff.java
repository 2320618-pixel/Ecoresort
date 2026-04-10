package com.spring26.section2.group19.ecoresort;

public class MaintenanceStuff {
    private int maintenanceStuffId;
    private String name;
    private String password;

    public MaintenanceStuff(int maintenanceStuffId, String name, String password) {
        this.maintenanceStuffId = maintenanceStuffId;
        this.name = name;
        this.password = password;
    }

    public int getMaintenanceStuffId() {
        return maintenanceStuffId;
    }

    public void setMaintenanceStuffId(int maintenanceStuffId) {
        this.maintenanceStuffId = maintenanceStuffId;
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
        return "MaintenanceStuff{" +
                "maintenanceStuffId=" + maintenanceStuffId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
