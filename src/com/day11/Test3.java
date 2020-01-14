package com.day11;

import java.util.Calendar;

public class Test3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("当前年月日为：" + year + "年" + month + "月" + day + "日");
        cal.add(Calendar.DAY_OF_MONTH, 500);
        int year1 = cal.get(Calendar.YEAR);
        int month1 = cal.get(Calendar.MONTH) + 1;
        int day1 = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("500天后为：" + year1 + "年" + month1 + "月" + day1 + "日");

    }
}
