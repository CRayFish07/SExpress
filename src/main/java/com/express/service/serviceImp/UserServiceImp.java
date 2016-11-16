package com.express.service.serviceImp;

import com.express.DAO.UserDao;
import com.express.entity.User;
import com.express.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by linzhijie on 2016/11/16.
 */
@Repository
public class UserServiceImp implements UserService{

    @Autowired
    UserDao userDao;

    public User getUserByPhone(String phone) {
        return userDao.getUserByPhone(phone);
    }

    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

    public boolean delUser(String id) {
        return userDao.delUser(id);
    }

    public boolean updUser(User user) {
        return userDao.updUser(user);
    }
}
