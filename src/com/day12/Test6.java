package com.day12;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        String str[] = {"令狐冲", "张无忌", "杨过", "东方不败"};
        Integer int_1[] = {4, 5, 6, 7, 8, 9};
        swap(str, 0, 2);
        swap(int_1, 0, 2);
    }

    public static <E> void swap(E arr[], int a, int b) {
        E temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        ArrayList<E> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
