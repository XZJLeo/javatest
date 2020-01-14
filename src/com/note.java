package com;

public class note {
    public static void main(String[] args) {

        int[] arr1 = {4, 2, 8, 1, 3, 5, 10, 7, 6, 11};
        //f(arr1);
        //f1(arr1);
        //  pai(arr1);
        Search(arr1);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }

    }

    // 第一种    利用双重for循环实现数组反转
    public static void f(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    //第二         借助外部变量实现数组反转
    public static void f1(int arrr[]) {
        int k = 0;
        for (int i = arrr.length - 1; i >= 0; i--) {
            int t = arrr[k];
            arrr[k] = arrr[i];
            arrr[i] = t;
            k++;
        }
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }
    }

    //        一种排序方法
    public static void pai(int i[]) {
        for (int j = 0; j < i.length; j++) {
            for (int k = 0; k < j; k++) {
                if (i[j] > i[k]) {
                    int temp = i[j];
                    i[j] = i[k];
                    i[k] = temp;
                }
            }
        }
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }

    //*二分插入排序法*
    public static void Search(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int low = 0, high = i - 1;
            int mid = -1;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for (int j = i - 1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            arr[low] = temp;
        }
    }


}
