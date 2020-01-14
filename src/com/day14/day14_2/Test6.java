package com.day14.day14_2;

public class Test6 {
    public static void main(String[] args) throws Exception {
        Card card = new Card();
        card.setMoney(-454);
    }
}

class CardExcption extends Exception {
    public CardExcption() {
    }

    public CardExcption(String message) {
        super(message);
    }

    public CardExcption(String message, Throwable cause) {
        super(message, cause);
    }

    public CardExcption(Throwable cause) {
        super(cause);
    }

    public CardExcption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class Card extends CardExcption {
    private String accountNumber;
    private double money;

    public Card() {
    }

    public Card(String accountNumber, double money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) throws CardExcption {
        if (money < 0) {

            throw new CardExcption("余额不能为负数");
        }
        this.money = money;
    }
}