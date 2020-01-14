package com.wookbook;


public class practice1 {
    public static void main(String[] args) {
        A a=new A();
        A.B ab=a.new B();

        a.kkj();
    }
}
class A{
    int num=10;
    class B{
        int num=20;
        public void moth(){
            int num=50;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(A.this.num);
            class C{
                int num=40;
                public void fg(){
                    System.out.println(num);
                }
            }

        }
    }
    public void kkj(){
        System.out.println("zxj:"+num);
    }
}