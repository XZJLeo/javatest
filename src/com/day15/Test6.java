package com.day15;

public class Test6 {
    public static void main(String[] args) {
     Wicket wicket=new Wicket();
        Thread thread = new Thread(wicket,"窗口a");
        Thread thread1 = new Thread(wicket,"窗口b");
        Thread thread2 = new Thread(wicket,"窗口c");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class Wicket extends Thread {
    int num = 100;
    int i = 1;

    @Override
    public void run() {
        int j=1;
        while (true) {
            synchronized (this) {
                if (i > num) {
                    System.out.println(Thread.currentThread().getName()+" 票卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " 卖了"+j+"张票" + "剩余票数为：" + (num - i));
                i++;j++;
            }
        }
    }
}