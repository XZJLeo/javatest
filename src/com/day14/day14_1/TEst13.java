package com.day14.day14_1;

import java.util.HashMap;
import java.util.Random;

public class TEst13 {
    public static void main(String[] args) {
        Random random=new Random();
        HashMap<Integer,String>hashMap=new HashMap<>();
        while(true){
            hashMap.put(random.nextInt(9),"苹果");
            hashMap.put(random.nextInt(9),"香蕉");
            hashMap.put(random.nextInt(9),"西瓜");
            hashMap.put(random.nextInt(9),"橘子");
            if(hashMap.size()>=4){
                break;
            }
        }
        System.out.println(hashMap);

    }
}
