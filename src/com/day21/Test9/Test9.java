package com.day21.Test9;

import java.io.*;
import java.util.Properties;

public class Test9 {
    public static void main(String[] args) throws Exception {
        File file = new File("app.properties");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fis = new FileInputStream(file);
        Properties pro = new Properties();
        pro.load(fis);
        int count = 0;
        if (pro.getProperty("cou") != null) {
            if (Integer.parseInt(pro.getProperty("cou")) >= 3) {
                System.out.println("运行次数大于三，到期了。。");
                return;
            }
            int i = Integer.parseInt(pro.getProperty("cou")) + 1;
            pro.setProperty("cou", String.valueOf(i));
        } else {
            count++;
            pro.setProperty("cou", String.valueOf(count));
        }
        FileOutputStream fos = new FileOutputStream(file);
        pro.store(fos, "app run ing");
        System.out.println("------------程序运行--------------");
        fos.close();
        fis.close();
    }
}
