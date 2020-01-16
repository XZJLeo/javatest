package com.day18;

import java.io.FileWriter;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args)throws Exception {
        Info();
    }
    public static void Info()throws Exception{
        FileWriter fos = new FileWriter("D:\\ccc\\info.txt");
        Scanner in=new Scanner(System.in);
        System.out.println("请输入字符串保存到info.txt");
        while (true) {
            String str=in.nextLine();
            if (str.equals("886") ) {
                break;
            }
            fos.write(str);
            fos.write("\r\n");
        }
        fos.close();
    }

}
