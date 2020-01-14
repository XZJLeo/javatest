package com.day14.day14_2;

public class Test3 {
    public static void main(String[] args) {

    }
}
class PainExecptoin extends Exception{
    public PainExecptoin() {
    }

    public PainExecptoin(String message) {
        super(message);
    }

    public PainExecptoin(String message, Throwable cause) {
        super(message, cause);
    }

    public PainExecptoin(Throwable cause) {
        super(cause);
    }

    public PainExecptoin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
class ToothPainException extends PainExecptoin{
    public ToothPainException() {
    }

    public ToothPainException(String message) {
        super(message);
    }

    public ToothPainException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToothPainException(Throwable cause) {
        super(cause);
    }

    public ToothPainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
class TonguePainException extends PainExecptoin{
    public TonguePainException() {
    }

    public TonguePainException(String message) {
        super(message);
    }

    public TonguePainException(String message, Throwable cause) {
        super(message, cause);
    }

    public TonguePainException(Throwable cause) {
        super(cause);
    }

    public TonguePainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
class BigToothPainException extends ToothPainException{
    public BigToothPainException() {
    }

    public BigToothPainException(String message) {
        super(message);
    }

    public BigToothPainException(String message, Throwable cause) {
        super(message, cause);
    }

    public BigToothPainException(Throwable cause) {
        super(cause);
    }

    public BigToothPainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
class FrontToothPainExcption extends ToothPainException{
    public FrontToothPainExcption() {
    }

    public FrontToothPainExcption(String message) {
        super(message);
    }

    public FrontToothPainExcption(String message, Throwable cause) {
        super(message, cause);
    }

    public FrontToothPainExcption(Throwable cause) {
        super(cause);
    }

    public FrontToothPainExcption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
class Father {
    public void eat()throws ToothPainException{
        System.out.println("吃到一个石子");
        throw new ToothPainException();
    }
    public void drink()throws ToothPainException{
        System.out.println("喝什么都没问题");
    }
}
class son extends Father{
    /*public void eat()throws TonguePainException{
    }*/
    /*public  void eat()throws PainExecptoin{

    }*/

}