package com.day16;

import java.util.Arrays;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        Workr workr=new Workr();
        Threads threads=new Threads(workr);
        Thread thread=new Thread(threads,"前门");
        Thread thread1=new Thread(threads,"后门");
        thread.start();
        thread1.start();

    }
}

class Threads implements Runnable {
    private Workr workr;

    public Threads(Workr workr) {
        this.workr = workr;
    }

    @Override
    public void run() {
        int j=1;
        while (true) {
            synchronized (workr) {
                int num = workr.getNumber();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(num==0){
                    System.out.println("从"+Thread.currentThread().getName()+"入场的员工总共;"+(j-1)+"位");
                    break;
                }
                System.out.println("编号为："+num+"的员工从 "+Thread.currentThread().getName()+"入场！拿到的双色球彩票号码是:"+DoubleColorBallUtil.create());
                j++;workr.setNumber(--num);
            }
        }

    }
}

class Workr {
    private String name = "员工";
    private Integer number = 100;

    public Workr() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}


class DoubleColorBallUtil {
    // 产生双色球的代码
    public static String create() {
        String[] red = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
                "24", "25", "26", "27", "28", "29", "30", "31", "32", "33"};
//创建蓝球
        String[] blue = "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16".split(",");
        boolean[] used = new boolean[red.length];
        Random r = new Random();
        String[] all = new String[7];
        for (int i = 0; i < 6; i++) {
            int idx;
            do {
                idx = r.nextInt(red.length);//0‐32
            } while (used[idx]);//如果使用了继续找下一个
            used[idx] = true;//标记使用了
            all[i] = red[idx];//取出一个未使用的红球
        }
        all[all.length - 1] = blue[r.nextInt(blue.length)];
        Arrays.sort(all);
        return Arrays.toString(all);
    }
}