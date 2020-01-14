package com.day17;

import java.io.File;
import java.util.HashMap;

public class Test16 {
    static int count = 0;
    static int count1 = 0;
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap();
        File file = new File("D:\\ccc");
        Totel(hashMap,file);
        System.out.println(hashMap);

    }

    public static void Totel( HashMap<String, Integer> hashMap ,File file) {

        File f[] = file.listFiles();
        for (File files : f) {
            if (files.isFile()) {
                if (files.getName().endsWith("java")) {
                    hashMap.put("java", ++count);
                }
                else if (files.getName().endsWith("txt")) {
                    hashMap.put("txt", ++count1);
                }
            } else {
                Totel(hashMap,files);
            }

        }
    }
}
