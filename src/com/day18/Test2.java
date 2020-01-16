
package com.day18;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Student();
    }

    public static void Student() throws Exception {
        FileOutputStream fos = new FileOutputStream("D:\\ccc\\stu.txt");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的信息(遇到end结束)：");
        while (true) {
            //  byte b[] = new byte[5];
            String str = in.nextLine();
            if (str.equals("end")) {
                break;
            }
            fos.write(str.getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}

