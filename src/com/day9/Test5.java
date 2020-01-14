package com.day9;

public class Test5 {
    public static void main(String[] args) {
        Manager manager = new Manager("张小强", 9000);
        Coder coder = new Coder("李晓亮", 5000);
        Company company = new Company();
        company.paySalary(manager);
        company.paySalary(coder);

    }
}

abstract class Employee {
    String name;
    double money;

    public Employee(String name, double money) {
        this.name = name;
        this.money = money;
    }
}

class Manager extends Employee {
    public Manager(String name, double money) {
        super(name, money);
    }

}

class Coder extends Employee {
    public Coder(String name, double money) {
        super(name, money);
    }
}

interface Money {

    public abstract void paySalary(Employee emp);
}

class Company implements Money {
    double peice = 1000000;

    public double getPeice() {
        return peice;
    }

    public void setPeice(double peice) {
        this.peice = peice;
    }

    @Override
    public void paySalary(Employee emp) {
        System.out.println("给" + emp.name + "发工资 " + emp.money + "元，公司剩余：" + (peice - emp.money));
        setPeice(peice - emp.money);
    }


}