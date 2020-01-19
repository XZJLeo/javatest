package com.day20.Test4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket client=new Socket("127.0.0.1",5555);
        Scanner in=new Scanner(System.in);
        System.out.println("请输入用户名和密码（格式java=123456）：");
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        String str=in.nextLine();
        bw.write(str);
        bw.newLine();
        bw.flush();
        System.out.println(br.readLine());
        br.close();
        bw.close();
        client.close();
    }
}
