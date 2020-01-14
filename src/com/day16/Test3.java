package com.day16;

public class Test3 {
    public static void main(String[] args) {
invokeDirecat(()->{
    System.out.println("导演拍电影了");

});
    }
    private static void invokeDirecat(Director director){
        director.makeMovie();
    }
}
interface Director{
    public void makeMovie();
}