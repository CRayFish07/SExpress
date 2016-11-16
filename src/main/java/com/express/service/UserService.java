package com.express.service;

import com.express.entity.User;

import java.util.List;

/**
 * Created by linzhijie on 2016/11/16.
 */
public interface UserService {
    public User getUserByPhone(String phone);

    public List<User> getAllUser();

    public boolean addUser(User user);

    public boolean delUser(String id);

    public boolean updUser(User user);
}
