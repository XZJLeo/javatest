package com.day14.day14_2;

public class Test5 {
    public static void main(String[] args)throws Exception {

        try {
           // login("kk","ad");
          //  login("admin","gh");
            login("admin","admin");

        } catch (LoginExcptoin loginExcptoin) {
            loginExcptoin.printStackTrace();
        }

    }
    public static void login(String name,String pwd)throws LoginExcptoin{
        String str="admin";
        String str1="admin";
        if(str!=name){
            throw new LoginExcptoin("用户名不存在");
        }
        if(str1!=pwd){
            throw new LoginExcptoin("密码错误");
        }else {
            System.out.println("欢迎~~~~~");
        }
    }
}
class LoginExcptoin  extends Exception{
    public LoginExcptoin() {
    }

    public LoginExcptoin(String message) {
        super(message);
    }

    public LoginExcptoin(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginExcptoin(Throwable cause) {
        super(cause);
    }

    public LoginExcptoin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}