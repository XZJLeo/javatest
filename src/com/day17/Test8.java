package com.day17;

import java.io.File;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        File f = new File(str);
        if (!f.isFile()) {
            System.out.println("不存在，创建它");
            f.createNewFile();
        } else {
            System.out.println("存在，打印他的长度：" + f.length());
        }
    }
}
