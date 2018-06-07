package org.fkit.controller;

import org.fkit.model.User;
import org.fkit.model.DataGridResult;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-03-27  17:51  星期二
 * version 1.0
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllUser",produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public DataGridResult getAllUser(User user) {
        List<User> allUser = userService.getAllUser();
        DataGridResult  resu = new DataGridResult(allUser.size(),allUser);
        return resu;
    }

}
