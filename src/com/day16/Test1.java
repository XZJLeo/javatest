package com.day16;

public class Test1 {
    public static void main(String[] args) {
        Baizi baizi = new Baizi();
        baizi.setFalg(10);
        ProductionThread p=new ProductionThread(baizi);
        ConsumerThread c=new ConsumerThread(baizi);
        Thread thread=new Thread(p,"店小二");
        Thread thread1=new Thread(c,"八戒");
        thread.start();
        thread1.start();
    }
}

class Baizi {
    private String name;
    private Integer falg;

    public Baizi(String name, Integer falg) {
        this.name = name;
        this.falg = falg;
    }

    public Baizi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFalg() {
        return falg;
    }

    public void setFalg(Integer falg) {
        this.falg = falg;
    }
}

class ConsumerThread implements Runnable {
    private Baizi baizi;

    public ConsumerThread(Baizi baizi) {
        this.baizi = baizi;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (baizi) {
                int num=baizi.getFalg();
                if (num>=5&&num<=10) {
                    System.out.println("有包子,数量为："+num +","+ Thread.currentThread().getName() + "吃包子。");
                    baizi.notify();
                    baizi.setFalg(--num);
                } else {
                    try {
                        baizi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
class ProductionThread implements Runnable {
    private Baizi baizi;

    public ProductionThread(Baizi baizi) {
        this.baizi = baizi;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (baizi) {
                int num=baizi.getFalg();
                if (num<10 ) {
                    System.out.println("包子不多了，还有"+num+"个，" + Thread.currentThread().getName() + "生产包子。");
                    baizi.notify();
                    baizi.setFalg(++num);
                } else {
                    try {
                        baizi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}