
package com.day5;

public class Test8 {
    public static void main(String[] args) {
        Book b = new Book("No003", "java实战", "isbn45717", 45.5, "2017-08-04");
        Book b1 = new Book("No013", "c语言实战", "isbn47717", 95.7, "2004-07-08");
        Book b2 = new Book("No007", "PHP实战", "isbn85717", 35.4, "2010-11-24");
        b.showBook();
        b1.showBook();
        b2.showBook();
        Book.Book1(b, b1, b2);
    }
}

class Book {
    private String hao;
    private String shu;
    private String isbn;
    private double men;
    private String day;

    public Book() {
    }

    public Book(String hao, String shu, String isbn, double men, String day) {
        this.hao = hao;
        this.shu = shu;
        this.isbn = isbn;
        this.men = men;
        this.day = day;
    }

    public String getHao() {
        return hao;
    }

    public void setHao(String hao) {
        this.hao = hao;
    }

    public String getShu() {
        return shu;
    }

    public void setShu(String shu) {
        this.shu = shu;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getMen() {
        return men;
    }

    public void setMen(double men) {
        this.men = men;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void showBook() {
        System.out.println("书名：" + shu + " , 图书编号：" + hao + " , ISBN编码：" + isbn + " , 价格：" + men + " , 出版日期：" + day);
    }

    public static void Book1(Book... books) {
        Book temp = books[0].men > books[1].men ? books[0] : books[1];
        Book temp1 = temp.men > books[2].men ? temp : books[2];
        System.out.println("最贵的书是：");
        System.out.println("书名：" + temp1.getShu() + " , 图书编号：" + temp1.getHao() + " , ISBN编码：" + temp1.getIsbn() + " , 价格：" + temp1.getMen() + " , 出版日期：" + temp1.getDay());
    }


}
