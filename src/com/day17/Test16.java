package com.day17;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入正确的文件路径：");
        String string = in.nextLine();
        File file = new File(string);
        HashMap<String, Integer> hashMap = new HashMap<>();
        sum(hashMap, file);
        Set<String> set = hashMap.keySet();
        for (String str : set) {
            System.out.println("以" + str + "文件类型结尾的文件有" + hashMap.get(str) + "个");
        }

    }

    public static void sum(HashMap<String, Integer> hashMap, File file) {
        File[] f = file.listFiles();
        for (File file1 : f) {
            if (file1.isDirectory()) {
                sum(hashMap, file1);
            } else {
                int index = file1.getName().indexOf(".");
                String key = file1.getName().substring(index + 1);
                if (hashMap.containsKey(key)) {
                    hashMap.put(key, hashMap.get(key) + 1);
                } else {
                    hashMap.put(key, 1);
                }
            }
        }

    }
}