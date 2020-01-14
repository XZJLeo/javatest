package com.day15;

public class Test1 {
    public static void main(String[] args) {
        MyThaed myThaed=new MyThaed();
        myThaed.start();

        Task task=new Task();
        Thread thread =new Thread(task);
        thread.start();


        for (int i = 0; i <20 ; i++) {
            System.out.println("主线程"+i);
        }

    }
}class MyThaed extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程"+i);
        }
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Run子线程"+i);
        }
    }
}
