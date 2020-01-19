package com.day21.Test7;

import java.lang.reflect.Constructor;

public class Test7 {
    public static void main(String[] args) throws Exception {
        Class c = Person.class;
        Constructor<Person> ds = c.getConstructor(String.class, Integer.class);
        Person p = ds.newInstance("小红", 19);
        System.out.println(p);
    }
}
