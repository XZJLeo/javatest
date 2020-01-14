package com.day14.day14_1;

import java.util.HashMap;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

            Scanner in= new Scanner(System.in);
            System.out.println("请输入一个字符串:");
            String line = in.nextLine();
            findc(line);
        }
        private static void findc(String line) {

            HashMap<String, Integer> map = new HashMap<String, Integer>();

            String str[]=line.split(" ");
            int count=0;
            for (int i = 0; i < str.length; i++) {
              if(!map.containsKey(str[i])){
                  map.put(str[i],1);
              }else {
                  map.put(str[i],++count);
              }
            }
            System.out.println(map);
        }

}
