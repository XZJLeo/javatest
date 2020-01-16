package com.day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("D:\\d1\\score.txt");
        Properties p=new Properties();
        p.load(fr);
        Set<String>set=p.stringPropertyNames();
        for (String str:set){
            if(str.equals("lisi")){
                p.setProperty(str,"100");
            }
        }
        FileWriter fw=new FileWriter("D:\\d1\\score.txt");
        Set<String>set1=p.stringPropertyNames();
        for (String str:set1){

            fw.write(str+" = "+p.getProperty(str));
            fw.write("\r\n");

        }
      fw.close();
      fr.close();
    }
}
