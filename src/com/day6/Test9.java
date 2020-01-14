package com.day6;

import java.util.Scanner;
import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Books> list = new ArrayList<>();
        for (int k = 0; k < 3; k++) {
            System.out.println("请输入第" + (k + 1) + "本书的名称：");
            String s = in.next();
            System.out.println("请输入第" + (k + 1) + "本书的价格：");
            double j = in.nextDouble();
            Books b = new Books(s,j);
            list.add(b);
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k).getTitle() + ", " + list.get(k).getPrice());
        }
      Books.Bookp(list.get(0),list.get(1),list.get(2));
      Books.Bookq(list.get(0),list.get(1),list.get(2));
    }
}
class Books {
    private String title;
    private double price;

    public Books(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public static void Bookp(Books...books){
        Books temp;
        temp=books[0].price>books[1].price?books[0]:books[1];
        temp=temp.price>books[2].price?temp:books[2];
        System.out.println("最贵的书是："+temp.getTitle()+"   价格为："+temp.getPrice());
    }
    public static void Bookq(Books...book1){
        for (int i = 0; i <book1.length ; i++) {
            for (int j = 0; j < i; j++) {
                if(book1[i].getPrice()>book1[j].getPrice()){
                    Books temp=book1[i];
                    book1[i]=book1[j];
                    book1[j]=temp;
                }
            }
        }
        System.out.println("按价格从大到小排：");
        for (int i = 0; i <book1.length  ; i++) {
            System.out.println("书名："+book1[i].getTitle()+"  价格："+book1[i].getPrice());
        }
    }
}
