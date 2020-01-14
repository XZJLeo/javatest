package com;

public class lainxi {
    public static void main(String[] args) {
        Show show = new Show();
        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    show.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1=new Thread(){
            @Override
            public void run() {
                try {
                    show.show1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        thread1.start();

    }
}

class Show {
    int count = 0;
    Object object = new Object();

    public void show() throws Exception {

        for (int i = 0; i < 10; i++) {
            synchronized (object) {
                if (count == 0) {
                    object.notify();
                }
                System.out.println("kkkkk");
                count = 1;
                object.wait();
            }
        }

    }

    public void show1() throws Exception {
        for (int i = 0; i < 10; i++) {
            synchronized (object) {
                if (count == 1) {
                    object.notify();
                }
                System.out.println("LLLLL");
                count = 0;
                object.wait();
            }
        }
    }
}