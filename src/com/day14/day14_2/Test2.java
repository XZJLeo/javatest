package com.day14.day14_2;

public class Test2 {
    public static void main(String[] args) {
Studend studend=new Studend();
studend.setScore(5);
studend.setScore(-5);
    }
}
class NoScoreException extends RuntimeException{
    public NoScoreException() {
    }

    public NoScoreException(String message) {
        super(message);
    }

    public NoScoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoScoreException(Throwable cause) {
        super(cause);
    }

    public NoScoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
class Studend extends NoScoreException {
    private String name;
    private double score;

    public Studend(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Studend() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score<0){
            throw new  NoScoreException("分数不能为负数");
        }
        this.score = score;
    }

}