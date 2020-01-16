package com.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
       // Fliers();
    }

    /*public static void Fliers() throws Exception {
        File f = new File("D:\\d1");
        File file[] = f.listFiles();

        for (File file1 : file) {
            FileOutputStream fos = new FileOutputStream("D:\\bbb\\" + file1.getName());
            FileInputStream fis = new FileInputStream("D:\\d1\\" + file1.getName());
            byte b[] = new byte[1024];
            int len;
            while (true) {
                len = fis.read(b);
                if (len == -1) {
                    break;
                }
                fos.write(b, 0, len);
            }
            fis.close();
            fos.close();
        }

    }*/
}
