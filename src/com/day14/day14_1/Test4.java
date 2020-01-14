package com.day14.day14_1;

import java.util.HashMap;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap();
        Scanner in = new Scanner(System.in);
        while (true) {
            String str = in.next();
            int a= str.indexOf(",");
            hashMap.put(str.substring(0,a),Integer.parseInt(str.substring(a+1)));
         if(hashMap.size()>=5){
            break;
         }
        }
        System.out.println(hashMap);

    }
}
