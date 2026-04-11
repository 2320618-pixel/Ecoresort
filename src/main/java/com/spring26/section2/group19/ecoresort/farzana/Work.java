package com.spring26.section2.group19.ecoresort.farzana;

public class Work {
    private String Remark;

    public Work(String remark) {
        Remark = remark;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    @Override
    public String toString() {
        return "Work{" +
                "Remark='" + Remark + '\'' +
                '}';
    }
}
