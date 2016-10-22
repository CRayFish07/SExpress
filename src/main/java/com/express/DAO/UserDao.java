package com.express.DAO;

import com.express.entity.User;

import java.util.List;


/**
 * Created by linzhijie on 2016/10/22.
 */
public interface UserDao {

    public User getUserByPhone(String phone);

    public List<User> getAllUser();

    public boolean addUser(User user);

    public boolean delUser(String id);

    public boolean updUser(User user);
}
