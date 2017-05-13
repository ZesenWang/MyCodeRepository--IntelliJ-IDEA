package com.sample;

/**
 * Created by wangz on 2017/5/8.
 */
public class Hello {
    private String userName = "no username";

    public static String sayHello(){
        return "Hello, World ! ";
    }
    public String execute(){
        return "SUCCESS";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
