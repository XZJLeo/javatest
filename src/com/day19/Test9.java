package com.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Test9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        ArrayList<String> list = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        Collections.reverse(list);
        BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"));
        for (String strs : list) {
            bw.write(strs);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
