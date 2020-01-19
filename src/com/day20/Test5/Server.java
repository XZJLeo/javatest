package com.day20.Test5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5555);
        while (true) {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\ccc\\1.png"));
            Socket sver = serverSocket.accept();
            System.out.println("加入成功");
            BufferedOutputStream bos = new BufferedOutputStream(sver.getOutputStream());
            byte b[] = new byte[1024 * 500];
            int len;
            len = bis.read(b);
            bos.write(b, 0, len);
            bos.close();
            bis.close();
        }

    }
}
