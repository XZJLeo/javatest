package com.day15;

public class Test3 {
    public static void main(String[] args) {
        P_Thread p_thread = new P_Thread();
        Thread thread = new Thread(p_thread, "K");
        Thread thread1 = new Thread(p_thread, "L");
        Thread thread2 = new Thread(p_thread, "J");
        Thread thread3 = new Thread(p_thread, "H");
        Thread thread4 = new Thread(p_thread, "O");

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}

class P_Thread implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
