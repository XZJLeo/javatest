package com.day8;


public class Test7 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("666", "傅红雪");
        lecturer.work();
        Tutor tutor=new Tutor("668","顾棋");
       tutor.work();
        Maintainer maintainer=new Maintainer("686","庖丁");
        maintainer.work();
        Buyer buyer=new Buyer("888","景甜");
        buyer.work();
    }
}

abstract class Employee {
    String id;
    String name;

    abstract void work();

    public Employee() {
    }

    public Employee(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}

abstract class Teachers extends Employee {


    public Teachers() {
    }

    public Teachers(String id, String name) {
        super(id, name);
    }
}

abstract class AdminStaff extends Employee {


    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }
}

class Lecturer extends Teachers {


    public Lecturer(String id, String name) {
        super(id, name);
    }

    public void work() {
        System.out.println("工号为 " + id + " 的讲师 " + name + " 在讲课");
    }
}

class Tutor extends Teachers {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    public void work() {
        System.out.println("工号为 " + id + " 的助教 " + name + " 在帮学生解决问题");
    }
}

class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    public void work() {
        System.out.println("工号为 " + id + " 的维护人员 " + name + " 在解决不能共享屏幕问题");
    }
}

class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    public void work() {
        System.out.println("工号为 " + id + " 的采购人员 " + name + " 在采购音响设备");
    }
}