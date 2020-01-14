package com.day5;

public class Test7 {
    public static void main(String[] args) {
        MyDate m = new MyDate();
        m.setYear(1900);
        m.setMonth(1);
        m.setDay(1);
        m.showDate();
        m.isBi();
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {

    }

    public MyDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        System.out.println("日期：" + year + "年" + month + "月" + day + "日");
    }

    public void isBi() {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}