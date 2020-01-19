package com.day20.Test1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(6666);
        System.out.println("等待。。。。");
        Socket Sver = server.accept();
        System.out.println("连接成功");
        InputStream is = Sver.getInputStream();
        int len;
        byte b[] = new byte[1024];
        len = is.read(b);
        System.out.println("客户端的消息：" + new String(b, 0, len));

        OutputStream os=Sver.getOutputStream();
        os.write("服务信息.hello".getBytes());
        os.close();
        is.close();
        Sver.close();
    }
}
