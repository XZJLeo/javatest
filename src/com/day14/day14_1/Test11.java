package com.day14.day14_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test11 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        HashMap<String, String> hashMap1 = new HashMap<>();//Java基础班
        HashMap<String, String> hashMap2 = new HashMap<>();//Java就业班
        hashMap1.put("001","李晨");
        hashMap1.put("002","范冰冰");
        hashMap2.put("001","马云");
        hashMap2.put("002","马化腾");
        hashMap.put("java基础班",hashMap1);
        hashMap.put("java就业班",hashMap2);
        Set< String>set=hashMap.keySet();
        for(String str :set){
            System.out.println("班级："+str);
            System.out.println(hashMap.get(str));
        }
        System.out.println("--------------------------");
Set<Map.Entry<String, HashMap<String, String>>>set1=hashMap.entrySet();
        Iterator<Map.Entry<String, HashMap<String, String>>>iterator=set1.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, HashMap<String, String>> g=iterator.next();
            System.out.println("班级："+g.getKey());
            System.out.println(g.getValue());
        }

    }
}
