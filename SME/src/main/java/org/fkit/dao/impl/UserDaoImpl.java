package org.fkit.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.fkit.dao.UserDao;
import org.fkit.model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.mail.Session;
import java.util.List;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-06-06  10:26  星期三
 * version 1.0
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public List<User> getAllUser() {
        SqlSession sqlSession = getSqlSession();
        List<User> users = sqlSession.selectList("userDao.getAllUser");
        return users;
    }
}
