package com.sample;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by wangz on 2017/5/10.
 */
public class Register extends ActionSupport {
    // It will create that object using the Person class's default constructor.
    // Then for each form field that has a name value of personBean.someAttribute (e.g personBean.firstName)
    // it will call the personBean's public set method for that attribute and pass it the form field's value (the user input).
    // This all happens before the execute method occurs.
    Person personBean;

    public String register() throws Exception {
        //call Service class to store personBean's state in database
        System.out.println(personBean);
        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        personBean = person;
    }
    public void validate(){
        if ( personBean.getFirstName().length() == 0 ){
            addFieldError( "personBean.firstName", "First name is required." );
        }
        if ( personBean.getEmail().length() == 0 ){
            addFieldError( "personBean.email", "Email is required." );
        }
        if ( personBean.getAge() < 18 ){
            addFieldError( "personBean.age", "Age is required and must be 18 or older" );
        }
    }
    public String exception() throws Exception {
        throw new Exception();
    }
}
