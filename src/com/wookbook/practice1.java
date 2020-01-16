package com.wookbook;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class practice1 {
    public static void main(String[] args) throws  Exception{
        BufferedReader bis=new BufferedReader(new FileReader("D:\\a.txt"));
        BufferedWriter bos=new BufferedWriter(new FileWriter("D:\\b.txt"));
        HashMap<String ,String >hashMap=new HashMap<>();
        String len=null;
        while ((len=bis.readLine())!=null){
            String str[]= len.split("\\.");
            hashMap.put(str[0],str[1]);
        }
        Set<String >set=hashMap.keySet();
        for (int i=1;i<=set.size();i++){
            String s=String.valueOf(i);
            bos.write(s+"."+hashMap.get(s));
            bos.newLine();
        }
        bis.close();
        bos.close();
    }
}
