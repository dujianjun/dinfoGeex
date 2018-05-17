package org.fkit.service;

import org.fkit.dao.UserDao;
import org.fkit.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-05-17  16:17  星期四
 * version 1.0
 */
public interface UserService {

    List<User> getAllUser();

}
