package com.day14.day14_1;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println("请输入五个不同人的名字");
        while (true) {
            String name = in.next();
            int num = random.nextInt(101);
            hashMap.put(name, num);
            if (hashMap.size() >= 5) {
                break;
            }
        }
        Set<String> set = hashMap.keySet();
        Iterator<String> iterator = set.iterator();
        int sum = 0;
        int max = 0;
        int min = hashMap.get(iterator.next());
        for (String str : set) {
            sum += hashMap.get(str);
            if (max < hashMap.get(str)) {
                max = hashMap.get(str);
            }
            if (min > hashMap.get(str)) {
                min = hashMap.get(str);
            }
        }
        System.out.println(hashMap);
        System.out.println("总分：" + sum + " 最高分：" + max + " 最低分：" + min);
    }
}
