package com.day21.Test4;

import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args)throws Exception {
        Class c=Print.class;
       Method m= c.getMethod("show");
       m.invoke(new Print());
    }
}
