package com.day17;

import java.io.File;
import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        File file = new File(str);
        Seer(file);
    }

    public static void Seer(File file) {
        File[] file1 = file.listFiles();
        for (File f : file1) {
            if (f.isFile()) {
                f.delete();
            } else {
                Seer(f);
            }
        }
        file.delete();
    }

}
