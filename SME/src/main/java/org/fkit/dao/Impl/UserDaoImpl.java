package org.fkit.dao.Impl;

import org.apache.ibatis.session.SqlSession;
import org.fkit.dao.UserDao;
import org.fkit.model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-05-29  11:44  星期二
 * version 1.0
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public List<User> getAllUser() {

        SqlSession  sqlSession = getSqlSession();
        List<User> allUser = sqlSession.selectList("getAllUser");
        // 不要手动关闭SqlSession，如果你手动关闭了，就会抛出一个异常
        // sqlSession.close();
        return allUser;
    }
}
