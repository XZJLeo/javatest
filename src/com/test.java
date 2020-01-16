package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test {
    private static  int NUM = 1;

    public static void main(String[] args) throws Exception {
        File file1 = new File("D:\\JAVA\\javatest\\src\\com");
        File file2 = new File("D:\\java1");
        Copy(file1, file2);
        File file3 = new File("D:\\java1");
        Totle(file3);
    }

    //file1:输入的文件夹  file2: D:\\java
    public static void Copy(File file1, File file2) throws Exception {
        File[] file = file1.listFiles();
        for (File f : file) {
            if (f.isFile() && f.getName().endsWith(".java")) {
                FileInputStream fis = new FileInputStream(f);
                File[] file2_1 = file2.listFiles();
               // String string=null;
                File  file3=new File(file2,f.getName());
                for (File f1 : file2_1) {

                    if (f1.getName().equals(f.getName())) {
                        int k = f.getName().indexOf(".");
                       file3= new File(file2,(f.getName().substring(0, k) +"(" +NUM+")") + (f.getName().substring(k)));
                        NUM++;
                    }

                }

                FileOutputStream fos = new FileOutputStream(file3);
                int len;
                byte[] b = new byte[1024];
                while (!((len = fis.read(b)) == -1)) {
                    fos.write(b, 0, len);
                }
                fos.close();
                fis.close();

            } else if (f.isDirectory()) {
                Copy(f, file2);
            }
        }

    }

    public static void Totle(File file) {
        File f[] = file.listFiles();
        int count = 0;
        for (File file1 : f) {
            if (file1.getName().endsWith(".java")) {
                count++;
            }
        }
        System.out.println(file.getName() + "文件夹中以.java结尾的文件个数为：" + count);
    }
}