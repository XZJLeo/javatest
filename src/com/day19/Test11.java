package com.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        String str,string;
        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();
        BufferedReader brb = new BufferedReader(new FileReader("b.txt"));
        while ((string = brb.readLine()) != null) {
            System.out.println(string);
        }
        brb.close();
    }
}
