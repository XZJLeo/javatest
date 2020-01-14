package com.day13;

import java.util.HashSet;
import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        HashSet<Integer>hashSet=new HashSet<>();
        Random random=new Random();
        boolean falg=true;
        while (falg){
        int a   = random.nextInt(20)+1;
        hashSet.add(a);
        if (hashSet.size()<10){
            continue;
        }else break;
        }
        System.out.println(hashSet);

    }
}
