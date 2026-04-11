package com.spring26.section2.group19.ecoresort.farzana;

public class Routine {
    private String Checklist;

    public Routine(String checklist) {
        Checklist = checklist;
    }

    public String getChecklist() {
        return Checklist;
    }

    public void setChecklist(String checklist) {
        Checklist = checklist;
    }

    @Override
    public String toString() {
        return "Routine{" +
                "Checklist='" + Checklist + '\'' +
                '}';
    }
}
