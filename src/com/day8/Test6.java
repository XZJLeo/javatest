package com.day8;

public class Test6 {
    public static void main(String[] args) {
        manager m = new manager();
        cook c = new cook();
        m.num = "m110";
        m.name = "老王";
        m.poice = 10000;
        m.eat();
        m.work();
        c.num = "c110";
        c.name = "小王";
        c.poice = 6000;
        c.eat();
        c.work();
    }
}

abstract class worker {
    String num;
    String name;
    double poice;

    abstract void work();

    abstract void eat();
}

class manager extends worker {
    public void work() {
        System.out.println("工号为：" + num + ",姓名为：" + name + " 工资为：" + poice + "的经理在工作，管理其他人");
    }

    public void eat() {
        System.out.println("工号为：" + num + ",姓名为：" + name + " 工资为：" + poice + "的经理在吃鱼");
    }
}

class cook extends worker {
    public void work() {
        System.out.println("工号为：" + num + ",姓名为：" + name + " 工资为：" + poice + "的厨师在工作，炒菜");
    }

    public void eat() {
        System.out.println("工号为：" + num + ",姓名为：" + name + " 工资为：" + poice + "的厨师在吃肉");
    }
}