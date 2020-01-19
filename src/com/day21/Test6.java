package com.day21;


import java.lang.reflect.Field;

public class Test6 {
    public static void main(String[] args) throws Exception{
        Object object=new Object();
        Object object1=new Object();
        setProperty(object,"propertyName",object1);
        getProperty(object,"propertyName");
    }

    public static void setProperty(Object obj, String propertyName, Object value)throws Exception {
        Class c = obj.getClass();
       Field field= c.getDeclaredField("propertyName");
       field.set(obj,value);
    }

    public static Object getProperty(Object obj, String propertyName) throws Exception{
        Class c = obj.getClass();
        Field field= c.getDeclaredField("propertyName");
        return field;
    }
}
