package com.day4.day4_1;

public class Test4 {
    public static void main(String[] args) {
        char aChar = getChar(115);
        System.out.println("字符：" + aChar);
    }

    public static char getChar(int num) {
        char ch = (char) num;
        if ((num >= 48 && num <= 57) || (num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
            return ch;
        } else {
            return ' ';
        }
    }
}
