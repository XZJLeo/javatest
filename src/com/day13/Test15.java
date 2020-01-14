package com.day13;

import java.util.HashSet;
import java.util.Random;

public class Test15 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();

        while (true) {
            int a = random.nextInt(33) + 1;
            hashSet.add(a);
            if (hashSet.size() > 6) {
                break;
            }
        }
            int b = random.nextInt(16) + 1;
        System.out.print("红色球：");
        for(Integer i:hashSet) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("蓝色球："+b);
    }
}
