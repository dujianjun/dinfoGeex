package org.fkit.controller;

import org.fkit.model.User;
import org.fkit.utils.DataGridResult;
import org.fkit.utils.JDBCUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-03-27  17:51  星期二
 * version 1.0
 */

@RestController
@RequestMapping(value = "/easyui")
public class EasyUIController {


    @RequestMapping(value = "/selectAllUser",
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public DataGridResult selectAllUser() {

        JDBCUtil jdbcUtil = new JDBCUtil();
        jdbcUtil.getConnection();
        List<User> users = new ArrayList<User>();
        try {
            List<Map<String, Object>> result = jdbcUtil.findResult("select * from users", null);
            for (int i = 0; i < result.size(); i++) {
                Map<String, Object> map = result.get(i);
                User user = new User();
                String firstname = (String) map.get("firstname");
                String lastname = (String) map.get("lastname");
                String phone = (String) map.get("phone");
                String email = (String) map.get("email");
                user.setEmail(email);
                user.setFirstname(firstname);
                user.setLastname(lastname);
                user.setPhone(phone);
                users.add(user);
            }
            DataGridResult resu = new DataGridResult(users.size(),
                    users);
            return resu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }















}
