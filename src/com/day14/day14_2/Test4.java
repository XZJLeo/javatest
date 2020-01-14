package com.day14.day14_2;

public class Test4 {
    public static void main(String[] args) {
Person person=new Person();
person.setLifevalue(-2);
person.setLifevalue(5);
    }
}
class Person{
    private String name;
    private double lifevalue;

    public Person() {
    }

    public Person(String name, double lifevalue) {
        this.name = name;
        this.lifevalue = lifevalue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifevalue() {
        return lifevalue;
    }

    public void setLifevalue(double lifevalue) {
        if(lifevalue<0){
            throw new NoLifeValueExption("生命值不能为负");
        }
        this.lifevalue = lifevalue;
    }
}

class NoLifeValueExption extends RuntimeException {
    public NoLifeValueExption() {
    }

    public NoLifeValueExption(String message) {
        super(message);
    }

    public NoLifeValueExption(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLifeValueExption(Throwable cause) {
        super(cause);
    }

    public NoLifeValueExption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}