package com.example.sbmb.controller;

import com.example.sbmb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: UserController
 *
 * @author zhangzh
 * @version [1.0, 2018/5/28]
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/users")
    public String getAll(){
        return userMapper.getAll().toString();
    }
}
