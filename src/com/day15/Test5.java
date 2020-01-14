package com.day15;

public class Test5 {
    public static void main(String[] args) {

        Bus bus=new Bus();
        Thread thread=new Thread(bus,"前门");
        Thread thread1=new Thread(bus,"中门");
        Thread thread2=new Thread(bus,"后门");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class Bus implements Runnable {
    int num = 80;
    int i = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (i > num) {
                    System.out.println("没位了。。");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " 上车,共上车了" + i + "人，剩余" + (num - i) + "个位置");
                i++;

            }

        }
    }
}