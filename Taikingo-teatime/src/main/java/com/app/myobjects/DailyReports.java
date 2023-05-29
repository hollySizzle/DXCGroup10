package com.app.myobjects;

public class DailyReports {
    private Integer id;
    private String daily_report;
    private String first_name;
    private String last_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDaily_report() {
        return daily_report;
    }

    public void setDaily_report(String daily_report) {
        this.daily_report = daily_report;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String month) {
        this.first_name = month;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "DailyReports{" +
                "id=" + id +
                ", daily_report='" + daily_report + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
