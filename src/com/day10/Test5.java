package com.day10;

public class Test5 {
    public static void main(String[] args) {
        Player p1=new Player("法力角色");
        Player p2=new Player("武力角色");

        System.out.print("选择：");
        System.out.println(Select.FightAbleselect(p1.getTybe()));
        Select.show(p1);
        System.out.println("===================");
        System.out.print("选择：");
        System.out.println(Select.FightAbleselect(p2.getTybe()));
        Select.show(p2);
    }
}
interface FightAble{
    public void specialFight();
    public default void commonFight(){
        System.out.println("普通攻击");
    }
}
class Figth implements FightAble{
    @Override
    public void specialFight() {
        System.out.println("武器攻击");
    }
}
class Fashi implements FightAble{
    @Override
    public void specialFight() {
        System.out.println("法术攻击");
    }
}
class Player{
   String tybe;

    public Player(String tybe) {
        this.tybe = tybe;
    }

    public String getTybe() {
        return tybe;
    }

    public void setTybe(String tybe) {
        this.tybe = tybe;
    }
}
class Select{

    public static String FightAbleselect(String str){
        if(str.equals("法力角色")){
            return "法师";
        }else if(str.equals("武力角色")){
            return "战士";
        }else {
            return "输入有误。。";
        }

    }
    public static void show(Player p){
        if(FightAbleselect(p.tybe).equals("法师")){
           new Fashi().specialFight();
           new Fashi().commonFight();

        }
        if(FightAbleselect(p.tybe).equals("战士")){
           new Figth().specialFight();
           new Figth().commonFight();

        }
    }
}














