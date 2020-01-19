package com.day20.Test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket sver = new ServerSocket(5555);
        Socket s = sver.accept();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\ccc\\jj.txt"));
        Properties pro = new Properties();
        pro.load(bis);
        Set<String> set = pro.stringPropertyNames();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String str = br.readLine();
        int t = str.indexOf("=");
        for (String s1 : set) {
            if (s1.equals(str.substring(0, t)) && (pro.getProperty(s1).equals(str.substring(t + 1)))) {
                bw.write("登录成功");
                bw.newLine();
                bw.flush();
                br.close();
                bw.close();
                return;
            } if (s1.equals(str.substring(0, t)) && !(pro.getProperty(s1).equals(str.substring(t + 1)))) {
                bw.write("密码错误");
                bw.newLine();
                bw.flush();
                br.close();
                bw.close();
                return;
            }
        }
        FileWriter fw=new FileWriter("D:\\ccc\\jj.txt",true);
        fw.write("\r\n");
        fw.write(str);
        fw.close();
        bw.write("注册成功");
        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }
}