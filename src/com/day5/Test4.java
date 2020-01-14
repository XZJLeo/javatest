package com.day5;

public class Test4 {
    public static void main(String[] args) {
        Card card = new Card();
        card.setHua("黑桃");
        card.setNum('A');
        card.showCard();
    }
}

class Card {
    private String hua;
    private char num;

    public Card() {

    }

    public Card(String hua, char num) {
        this.hua = hua;
        this.num = num;
    }

    public char getNum() {
        return num;
    }

    public void setNum(char num) {
        this.num = num;
    }

    public String getHua() {
        return hua;
    }

    public void setHua(String hua) {
        this.hua = hua;
    }

    public void showCard() {
        System.out.println(hua + num);
    }


}