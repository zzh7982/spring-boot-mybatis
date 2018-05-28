package com.example.sbmb.mapper;

import com.example.sbmb.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * description: UserMapper
 *
 * @author zhangzh
 * @version [1.0, 2018/5/28]
 */
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> getAll();
}
