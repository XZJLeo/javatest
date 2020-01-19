package com.day21.Test5;

import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception {
        String str = "A";
        Class c = Class.forName("com.day21.Test5." + str);
        Method method = c.getMethod("showString");
        method.invoke(new A());
    }
}
