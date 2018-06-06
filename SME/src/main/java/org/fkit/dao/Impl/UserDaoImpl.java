package org.fkit.dao.Impl;

import org.apache.ibatis.session.SqlSession;
import org.fkit.dao.UserDao;
import org.fkit.model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-06-06  10:26  星期三
 * version 1.0
 */
public class UserDaoImpl  implements UserDao {

    @Autowired
    private  UserDao userDao;


    public List<User> getAllUser() {
        List<User> users = userDao.getAllUser();
        return users;
    }
}
