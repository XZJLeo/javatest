package com.day21;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {
    @Test
    public void mothe() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Class c = list.getClass();
        try {
            Method method = c.getMethod("add", Object.class);
           method.invoke(list,"java");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
