package com.day11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main  (String[] args) throws Exception{
        String bth = "1997-11-08";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date=dateFormat.parse(bth);

        Date date1=new Date();
        long a=date1.getTime()-date.getTime();
        long ab=a/1000/60/60/24;
        System.out.println(ab);
    }
}
