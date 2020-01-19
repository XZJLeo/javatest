package com.day21;

import org.junit.Test;

import static java.lang.Math.abs;

public class Test1 {
    @Test
    public void mothd() {
        Calculator c = new Calculator();

        System.out.println("加：" + c.tetol(4, 5));
        System.out.println("减：" + c.jian(4, 5));
        System.out.println("乘：" + c.shen(4, 5));
        System.out.println("除：" + c.chu(4, 5));


    }
}

class Calculator {

    public Calculator() {
    }

    public int tetol(int i, int l) {
        return i + l;
    }

    public int jian(int i, int l) {
        return abs(i - l);
    }

    public int shen(int i, int l) {
        return i * l;
    }

    public int chu(int i, int l) {
        return i / l;
    }
}