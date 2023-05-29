package com.app.myobjects;

public class Reports {
    private Integer id;
    private Integer month;
    private Integer day;
    private Integer user_id;
    private String daily_report;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getDaily_report() {
        return daily_report;
    }

    public void setDaily_report(String daily_report) {
        this.daily_report = daily_report;
    }

    @Override
    public String toString() {
        return "Reports{" +
                "id=" + id +
                ", month=" + month +
                ", day=" + day +
                ", user_id=" + user_id +
                ", daily_report='" + daily_report + '\'' +
                '}';
    }
}
