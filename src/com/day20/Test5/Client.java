package com.day20.Test5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("127.0.0.1", 5555);
        BufferedInputStream bis = new BufferedInputStream(client.getInputStream());
        String str = String.valueOf(System.currentTimeMillis());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\8051\\" + str + "1.png"));
        byte[] b = new byte[1024 * 500];
        int len = bis.read(b);
        bos.write(b, 0, len);
        bos.close();
        bis.close();
        client.close();
    }
}
