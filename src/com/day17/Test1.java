package com.day17;

import java.io.File;

public class Test1 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\a.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

    }
}
