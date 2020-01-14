package com.day7;

public class Test8 {
    public static void main(String[] args) {
        String strings = "javajfiewjavajfiowfjavagkljjava";
        String chs = "java";
        System.out.println("字符串" + strings + "中" + chs + "的数量：" + getCount(strings, chs));
    }

    public static int getCount(String str, String ch) {
        int count = 0;
        while (str.indexOf(ch) != -1) {

            str = str.substring((str.indexOf(ch) + ch.length()));
            count++;
        }
        return count;
    }
}
