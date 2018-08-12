package com.znlccy.cms.index.mapper;

import com.znlccy.cms.index.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/8/12 23:20
 * @version: v.1.0.0
 * @introduce: 用户映射接口
 */
@Mapper
public interface UserMapper {

    @Insert("")
    void add(@Param("user") User user);

    @Delete("")
    void delete(@Param("uid") Integer uid);

    @Update("")
    void update(@Param("user") User user);

    @Select("")
    List<User> findAll();

    @Select("")
    User findOne(@Param("uid") Integer uid);
}
