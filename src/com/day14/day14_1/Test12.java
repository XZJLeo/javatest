package com.day14.day14_1;

import java.util.HashMap;
import java.util.Map;

public class Test12 {
    public static void main(String[] args) {
        HashMap<String ,String>hashMap=new HashMap<>();
        hashMap.put("及时雨","宋江");
        hashMap.put("玉麒麟","卢俊义");
        hashMap.put("智多星","吴用");
        System.out.println(hashMap);
        hashMap.put("入云龙","公孙胜");
        hashMap.put("豹子头","林冲");
        hashMap.remove("玉麒麟");
        hashMap.put("智多星","");
        hashMap.remove("及时雨");
        hashMap.put("呼保义","宋江");
        System.out.println(hashMap);
    }
}
