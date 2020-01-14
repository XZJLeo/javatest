package com.day11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test7 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("001", "少林核桃", 15.5, "斤");
        Goods goods2 = new Goods("002", "尚康饼干", 14.5, "包");
        Goods goods3 = new Goods("003", "移动硬盘", 345, "个");
        Goods goods4 = new Goods("004", "高清无码", 199, "G");
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎使用超市购物系统");
        while (true) {
            System.out.println("请输入你要进行的操作：\n1.购买商品         2.结算并打印小票          3.退出系统");
            int i = in.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("--------------------------------------------------");
                    System.out.println("             商品列表\n商品id       商品名称        单价         计价单位");
                    System.out.println("  "+goods1.getId() + "        " + goods1.getName() + "        " + goods1.getPrice() + "            " + goods1.getUnit());
                    System.out.println("  "+goods2.getId() + "        " + goods2.getName() + "        " + goods2.getPrice() + "            " + goods2.getUnit());
                    System.out.println("  "+goods3.getId() + "        " + goods3.getName() + "        " + goods3.getPrice() + "           " + goods3.getUnit());
                    System.out.println("  "+goods4.getId() + "        " + goods4.getName() + "        " + goods4.getPrice() + "           " + goods4.getUnit());
                    System.out.println("-------------------------------------------------");
                    System.out.println("请输入你要购买的商品项（输入格式：商品id-购买数量），输入end表示购买结束。");
                    int k = 0;
                    ArrayList<String> list = new ArrayList<>();
                    while (true) {
                        String string=in.next();
                        list.add(string);

                        String str ="^00[1-4]-[0-9]{1,2}$";
                        Pattern pattern=Pattern.compile(str);
                        Matcher matcher=pattern.matcher(string);
                        if (list.get(k).equals("end")) {
                            System.out.println("购买结束");
                            break;
                        }
                        if(matcher.matches()){

                        if (list.get(k).substring(0, 3).equals(goods1.getId())) {
                            int d1 = Integer.parseInt(list.get(k).substring(4));
                            goods1.setSum(d1 * goods1.getPrice());
                            goods1.setNum(Integer.parseInt(list.get(k).substring(4)));
                        }
                        if (list.get(k).substring(0, 3).equals(goods2.getId())) {
                            int d2 = Integer.parseInt(list.get(k).substring(4));
                            goods2.setSum(d2 * goods2.getPrice());
                            goods2.setNum(Integer.parseInt(list.get(k).substring(4)));
                        }
                       if (list.get(k).substring(0, 3) .equals( goods3.getId())) {
                            int d3 = Integer.parseInt(list.get(k).substring(4));
                            goods3.setSum(d3 * goods3.getPrice());
                            goods3.setNum(Integer.parseInt(list.get(k).substring(4)));
                        }
                        if (list.get(k).substring(0, 3).equals(goods4.getId())) {
                            int d4 = Integer.parseInt(list.get(k).substring(4));
                            goods4.setSum(d4 * goods4.getPrice());
                            goods4.setNum(Integer.parseInt(list.get(k).substring(4)));
                        }
                        }else {
                            System.out.println("输入格式不对或者五此商品！（格式：商品id-购买数量）");
                        }
                        k++;
                    }
                }break;
                case 2: {
                    int l = 0;
                    System.out.println("-------------------------------------------\n               欢迎光临  \n名称       售价       数量        金额");
                    System.out.println("-------------------------------------------");
                    if (goods1.getNum() != 0) {
                        System.out.println(goods1.getName() + "   " + goods1.getPrice() + "        " + goods1.getNum() + "         " + goods1.getSum());
                        l++;
                    }
                    if (goods2.getNum() != 0) {
                        System.out.println(goods2.getName() + "   " + goods2.getPrice() + "        " + goods2.getNum() + "          " + goods2.getSum());
                        l++;
                    }
                    if (goods3.getNum() != 0) {
                        System.out.println(goods3.getName() + "   " + goods3.getPrice() + "       " + goods3.getNum() + "         " + goods3.getSum());
                        l++;
                    }
                    if (goods4.getNum() != 0) {
                        System.out.println(goods4.getName() + "   " + goods4.getPrice() + "       " + goods4.getNum() + "        " + goods4.getSum());
                        l++;
                    }
                    if (goods1.getNum() == 0 && goods2.getNum() == 0 && goods3.getNum() == 0 && goods4.getNum() == 0) {
                        System.out.println("你未购买仍何商品！");
                    }
                    int num=goods1.getNum()+goods2.getNum()+goods3.getNum()+  goods4.getNum();
                    double sum=goods1.getSum()+goods2.getSum()+goods3.getSum()+goods4.getSum();
                    System.out.println("-------------------------------------------");
                    System.out.println(l+"项商品\n"+"共计："+num+"件\n"+"共："+sum);

                }break;
                case 3: {
                    System.out.println("感谢使用超市购物系统，欢迎下次光临，good拜···");
                    return;
                }
            }


        }


    }
}

class Goods {
    private String id;
    private String name;
    private double price;
    private String unit;
    private double sum=0;
    private int num = 0;

    public Goods(String id, String name, double price, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}