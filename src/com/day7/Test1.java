package com.day7;

public class Test1 {
    public static void main(String[] args) {
        String str = ("你好");
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        byte[] bytes = {97, 98, 99, 100, 101};
        String str1 = new String(chars);
        String str2 = new String(bytes);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
