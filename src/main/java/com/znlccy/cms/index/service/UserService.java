package com.znlccy.cms.index.service;

import com.znlccy.cms.index.model.User;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/8/12 23:25
 * @version: v.1.0.
 * @introduce: 
 */
public interface UserService {

    void add();

    void delete();

    void update();

    List<User> findAll();

    User findOne();
}
