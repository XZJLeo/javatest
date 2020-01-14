package com.day15;

public class Test7 {
    public static void main(String[] args) {
        Thread thread=new Thread("线程一"){
            @Override
            public void run() {
                int sum=1;
                for (int i = 1; i <11 ; i++) {
                    sum*=i;
                }
                System.out.println(Thread.currentThread().getName()+" 10!是: "+sum);
            }
        };
        Thread thread1=new Thread(()->{
                int sum=1;
                for (int i = 1; i <9 ; i++) {
                    sum*=i;
                }
                System.out.println(Thread.currentThread().getName()+" 8!是: "+sum);

        },"线程二");

        Thread thread2=new Thread(()->{
            int sum=1;
            for (int i = 1; i <6 ; i++) {
                sum*=i;
            }
            System.out.println(Thread.currentThread().getName()+" 5!是: "+sum);

        },"线程三");

        thread.start();
        thread1.start();
        thread2.start();
    }
}
