package org.fkit.service.Impl;

import org.fkit.dao.UserDao;
import org.fkit.model.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-05-17  16:37  星期四
 * version 1.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getAllUser() {

        List<User> allUser = userDao.getAllUser();

        return allUser;
    }
}
