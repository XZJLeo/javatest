package com.day14.day14_1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("黄晓明", " Baby");
        map.put("邓超", "孙俪");
        map.put("谢霆锋", "张柏芝");
        Set<Map.Entry<String, String>> entry = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry1 = iterator.next();
            System.out.println("key:" + entry1.getKey() + " value:" + entry1.getValue());
        }


    }
}
