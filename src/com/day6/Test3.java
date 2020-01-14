package com.day6;
import java.util.Random;
public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int a = r.nextInt(10) + 1;
            System.out.println(a);
        }
    }
}
