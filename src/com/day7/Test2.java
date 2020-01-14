package com.day7;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "HELLO";

        System.out.println("str1和str2内容是否相等：" + str1.equals(str2));
        System.out.println("str1和str3内容是否相等：" + str1.equals(str3));
        System.out.println("忽略大小写 str1和str3内容是否相等：" + str1.equalsIgnoreCase(str3));
        System.out.println("str1字符串是否以He开头：" + str1.substring(0, 2).equals("He"));
        System.out.println("str1字符串是否以abc开头：" + str1.substring(0, 3).equals("abc"));
        System.out.println("str1和字符串是否以o结尾：" + (str1.charAt(str1.length() - 1) == 'o'));
        System.out.println("str1和字符串是否以l结尾：" + (str1.charAt(str1.length() - 1) == 'l'));


    }
}
