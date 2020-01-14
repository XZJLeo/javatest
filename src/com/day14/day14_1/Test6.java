package com.day14.day14_1;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = in.nextLine();
        find(line);
    }
    private static void find(String line) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!map.containsKey(c))
                map.put(c, 1);
                Integer count = map.get(c);
                map.put(c, ++count);
            }
        System.out.println(map);
        }

    }
