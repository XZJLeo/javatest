package com.day7;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        String[] str = {"das", "dfsdfss", "dssdterty", "你好啊", "我来了怕不怕哈哈哈", "别怕"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        System.out.println("原AllayList："+list);
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).length()>4){
                list.remove(i);
                i--;
            }
        }
        System.out.println("删除字符串长度大于4后的AllayList："+list);
    }
}
