package com.day9;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("sta001", "笔记本", 10000);
        Phone phone = new Phone("sta002", "手机", 5000);
        Fruit fruit = new Fruit("sta005", "榴莲", 50);
        GouWuChe gouWuChe = new GouWuChe();
        System.out.println("==========添加商品==========");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        System.out.println("==========打印商品==========");
        gouWuChe.showGoods();
        System.out.println("===========================");
        gouWuChe.total();

    }
}

class Goods {
    String id;
    String name;
    double price;

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Egoods extends Goods {
    public Egoods(String id, String name, double price) {
        super(id, name, price);
    }
}

class Phone extends Egoods {
    public Phone(String id, String name, double price) {
        super(id, name, price);
    }
}

class Laptop extends Egoods {
    public Laptop(String id, String name, double price) {
        super(id, name, price);
    }
}

class Fruit extends Goods {
    public Fruit(String id, String name, double price) {
        super(id, name, price);
    }
}

class GouWuChe {
    ArrayList<Goods> list = new ArrayList<>();

    public void addGoods(Goods goods) {
        System.out.println("加入 " + goods.getName() + " 成功");
        list.add(goods);
    }

    public void showGoods() {
        System.out.println("你所选购的商品为：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + ", " + list.get(i).getName() + "," + list.get(i).getPrice());
        }
    }

    public void total() {
        double p = 0;
        for (int i = 0; i < list.size(); i++) {
            p += list.get(i).getPrice();
        }
        System.out.println("原价为：" + p);
        System.out.println("折后价为：" + (p * 0.88));
    }
}