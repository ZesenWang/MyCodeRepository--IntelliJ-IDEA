package com.sample;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by wangz on 2017/5/8.
 */
public class Hello extends ActionSupport implements SessionAware{
    private static final String HELLO_COUNT = "helloCount";
    private String userName = "no username";
    private Map<String, Object> userSession;

    public static String sayHello(){
        return "Hello, World ! ";
    }
    public String execute(){
        increaseHelloCount();
        return "SUCCESS";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSession(Map<String, Object> map) {
        this.userSession = map;
    }
    private void increaseHelloCount() {
        Integer helloCount = (Integer) userSession.get(HELLO_COUNT);
        if (helloCount == null ) {
            helloCount = 1;
        } else {
            helloCount++;
        }
        userSession.put(HELLO_COUNT, helloCount);
    }
}
