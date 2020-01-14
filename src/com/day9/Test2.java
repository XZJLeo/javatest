package com.day9;

public class Test2 {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sendMeaaage();
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMeaaage();
        newPhone.palyGame();
    }
}

interface Play {
    public abstract void palyGame();
}

class OldPhone {
    public void call() {
        System.out.println("旧手机打电话");
    }

    public void sendMeaaage() {
        System.out.println("旧手机发短信");
    }
}

class NewPhone extends OldPhone implements Play {
    @Override
    public void palyGame() {
        System.out.println("新手机玩游戏");
    }

    public void call() {
        System.out.println("新手机打电话");
    }

    public void sendMeaaage() {
        System.out.println("新手机发短信");
    }
}