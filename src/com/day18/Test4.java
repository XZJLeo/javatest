package com.day18;

import java.io.FileInputStream;

import java.util.HashMap;

public class Test4 {
    public static void main(String[] args) throws Exception {
        //获取info.txt文件
        FileInputStream fis = new FileInputStream("D:\\d1\\info.txt");
        HashMap<Character, Integer> hashMap = new HashMap<>();
        byte b[] = new byte[1024];
        int len;
        //将文件的字节数组传入方法统计个数
        while (true) {
            len = fis.read(b);
            if (len == -1) {
                break;
            } else {
                Totle(hashMap, new String(b, 0, len));
            }
        }
        fis.close();
        System.out.println(hashMap);

    }

    public static void Totle(HashMap<Character, Integer> hashMap, String str) {

        char[] ch = str.toCharArray();//将byte数组转换为char
        for (char c : ch) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

    }
}
