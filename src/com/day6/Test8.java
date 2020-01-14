package com.day6;

import java.util.Scanner;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        for (int k = 0; k < 3; k++) {
            System.out.println("请输入第" + (k + 1) + "本书的名称：");
            String s = in.next();
            System.out.println("请输入第" + (k + 1) + "本书的ISBN编码：");
            String i = in.next();
            System.out.println("请输入第" + (k + 1) + "本书的价格：");
            double j = in.nextDouble();
            Book b = new Book(s, i, j);
            list.add(b);
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k).getTitle() + ", " + list.get(k).getIsbn() + ", " + list.get(k).getPrice());
        }
    }
}
class Book {
    private String title;
    private String isbn;
    private double price;

    public Book(String title, String isbn, double price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }
}
