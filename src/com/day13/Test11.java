package com.day13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     String str=   scanner.nextLine();
     char []chars=str.toCharArray();
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        for(char ch:chars){
           linkedHashSet.add(String.valueOf(ch));
        }
        for(String st:linkedHashSet)
        System.out.println(st);
    }
}
