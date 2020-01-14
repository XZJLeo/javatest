package com.day11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {
    public static void main(String[] args) throws Exception {
        String str = "2016.12.18";
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date = dateFormat.parse(str);
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("原格式：" + dateFormat1.format(date));
        ((SimpleDateFormat) dateFormat1).applyPattern("yyyy年MM月dd日");
        System.out.println("转会后格式：" + dateFormat1.format(date));


    }
}
