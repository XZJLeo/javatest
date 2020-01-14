package com.day6;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        User s1 = new User("宋江", 10900);
        User s2 = new User("吴用", 25000);
        User s3 = new User("林冲", 22000);
        User s4 = new User("武松", 10000);
        User s5 = new User("花荣", 15000);
        User s6 = new User("靓仔", 9500);
        User s7 = new User("大叔", 9000);
        User s8 = new User("小伙子", 11700);
        ArrayList<User> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "  工资：" + list.get(i).getEarn());
        }
        System.out.println();
        cxsd(list);


    }

    public static void cxsd(ArrayList<User> lists) {
        int max;
        User[] temp = new User[3];
        for (int i = 0; i < 3; i++) {
            max = i;
            for (int j = 0; j < lists.size(); j++) {
                if (lists.get(j).getEarn() > lists.get(max).getEarn()) {
                    max = j;
                }
            }
            temp[i] = lists.get(max);
            lists.remove(max);
        }
        System.out.println("前三个工资最高的人：");
        for (int i = 0; i < 3; i++) {
            System.out.println(temp[i].getName() + "  " + temp[i].getEarn());
        }
    }
}
class User {
    private String name;
    private double earn;

    public User() {
    }

    public User(String name, double earn) {
        this.name = name;
        this.earn = earn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEarn() {
        return earn;
    }

    public void setEarn(double earn) {
        this.earn = earn;
    }

}
