package com.example.fragmentsinui;

public class Months {
    private int id;
    private String month;
    private int countOfDays;

    public Months(int id, String month, int countOfDays){
        this.id=id;
        this.month=month;
        this.countOfDays=countOfDays;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getCountOfDays() {
        return this.countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }
}
