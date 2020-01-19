package com.day20.Test3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动..... ");
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\bbb\\b.txt"));
        byte[] b = new byte[1024 * 8];
        int len;
        while ((len = bis.read(b)) !=-1) {
            bos.write(b, 0, len);
        }
        bos.close();
        bis.close();
        accept.close();
        System.out.println("文件上传已保存");
    }
}
