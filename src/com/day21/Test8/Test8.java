package com.day21.Test8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

public class Test8 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("src\\pro.properties"));
        Class c=Class.forName(br.readLine());
       Method m= c.getMethod("run");
        m.invoke(new DemoClass());
    }
}
