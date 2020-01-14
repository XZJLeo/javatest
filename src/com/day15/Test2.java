package com.day15;

public class Test2 {
    public static void main(String[] args) {

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        Thread thread=new Thread(runnable,"播放音乐");
        Thread thread1=new Thread(runnable,"显示画面");
        thread.start();
        thread1.start();

    }
}
