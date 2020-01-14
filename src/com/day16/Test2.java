package com.day16;

public class Test2 {
    public static void main(String[] args) {
        Teick teick = new Teick();
        teick.setNum(100);
        Window window=new Window(teick);
        Thread thread=new Thread(window,"A窗口");
        Thread thread1=new Thread(window,"B窗口");
        Thread thread2=new Thread(window,"D窗口");
       thread.start();
        thread1.start();
        thread2.start();
    }
}

class Teick {
    private String massgae;
    private Integer num;

    public Teick(String massgae, Integer num) {
        this.massgae = massgae;
        this.num = num;
    }

    public Teick() {
    }

    public String getMassgae() {
        return massgae;
    }

    public void setMassgae(String massgae) {
        this.massgae = massgae;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}

class Window implements Runnable {
    private Teick teick;

    public Window(Teick teick) {
        this.teick = teick;
    }

    @Override
    public void run() {

            int j = 1;
            for (int i = 0; i < 100; i++) {
                synchronized (teick) {
                    Integer num = teick.getNum();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    if (num == 0) {
                        System.out.println("没票了");
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "在买票,卖出" + j + "张" + "剩余" + (num - 1) + "张");
                    teick.setNum(--num);
                    j++;
                }
            }

    }
}