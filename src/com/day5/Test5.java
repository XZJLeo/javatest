package com.day5;

public class Test5 {
    public static void main(String[] args) {
Circle r=new Circle();
     r.setR(8);
     r.showArea();
     r.showPerimeter();
    }
}

class Circle {
    private double r;

    public Circle() {

    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void showArea(){
        double ip=3.14;
        System.out.println("半径为："+r+",的圆的面积为："+r*r*ip);
    }
    public void showPerimeter(){
        double ip=3.14;
        System.out.println("半径为："+r+",的圆的周长为："+2*r*ip);
    }

}