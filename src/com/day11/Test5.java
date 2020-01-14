package com.day11;

public class Test5 {
    public static void main(String[] args) {

        String str = "";
        long a = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            str += i;
        }
        System.out.println("String用时：" + (System.currentTimeMillis() - a));

        StringBuilder stringBuilder = new StringBuilder();
        long b = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(i);
        }
        System.out.println("StringBuilder用时：" + (System.currentTimeMillis() - b));
        StringBuffer stringBuffer = new StringBuffer();
        long c = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuffer.append(i);
        }

        System.out.println("StringBuffer用时：" + (System.currentTimeMillis() - c));


    }
}
