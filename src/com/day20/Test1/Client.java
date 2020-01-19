package com.day20.Test1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket client=new Socket("127.0.0.1",6666);
        OutputStream os=client.getOutputStream();
        Scanner in=new Scanner(System.in);
        String str=in.next();
        os.write(str.getBytes());
        InputStream is = client.getInputStream();
        int len;
        byte b[] = new byte[1024];
        len = is.read(b);
        System.out.println("收到的消息：" + new String(b, 0, len));
        is.close();
        os.close();
        client.close();
    }
}
