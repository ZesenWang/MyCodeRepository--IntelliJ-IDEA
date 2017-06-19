package com.service;

import com.dao.UserDAO;
import com.po.User;

/**
 * Created by wangz on 2017/6/18.
 */
public class UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public String register(User user) {
        userDAO.register(user);
        return null;
    }
}
