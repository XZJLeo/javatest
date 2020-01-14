package com.day5;

public class Test6 {
    public static void main(String[] args) {
        Manager m= new Manager();
        Coder c=new Coder();
        m.setGz(15000);
        m.setName("James");
        m.setHao(9527);
        m.setJiangj(3000);
        m.intro();
        m.showSalary();
        m.work();
        c.setGz(10000);
        c.setHao("0025");
        c.setName("Kobe");
        System.out.println("=================");
        c.intro();
        c.showSalary();
        c.work();
    }
}

class Manager {
    private String name;
    private int hao;
    private int gz;
    private int jiangj;

    public Manager() {

    }

    public Manager(String name, int hao, int gz, int jiangj) {
        this.gz = gz;
        this.hao = hao;
        this.name = name;
        this.jiangj = jiangj;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGz() {
        return gz;
    }

    public int getHao() {
        return hao;
    }

    public int getJiangj() {
        return jiangj;
    }

    public void setGz(int gz) {
        this.gz = gz;
    }

    public void setHao(int hao) {
        this.hao = hao;
    }

    public void setJiangj(int jiangj) {
        this.jiangj = jiangj;
    }

   public void intro(){
       System.out.println("经理姓名："+name);
       System.out.println("工号："+hao);
   }
    public void showSalary(){
        System.out.println("基本工资为"+gz+",奖金为"+jiangj);
    }
    public void work(){
        System.out.println("正在努力做着管理的工作，分配任务，检查员工提交上来的代码....");
    }

}

class Coder {
    private String name;
    private String hao;
    private int gz;

    public Coder() {

    }

    public Coder(String name, String hao, int gz) {
        this.gz = gz;
        this.hao = hao;
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGz() {
        return gz;
    }

    public String getHao() {
        return hao;
    }



    public void setGz(int gz) {
        this.gz = gz;
    }

    public void setHao(String hao) {
        this.hao = hao;
    }


    public void intro(){
        System.out.println("程序员姓名："+name);
        System.out.println("工号："+hao);
    }
    public void showSalary(){
        System.out.println("基本工资为"+gz+",奖金无");
    }
    public void work(){
        System.out.println("正在努力写代码....");
    }

}

