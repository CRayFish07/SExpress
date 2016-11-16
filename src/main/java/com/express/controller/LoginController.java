package com.express.controller;

import com.express.DAO.daoImp.UserDaoImp;
import com.express.entity.Manage;
import com.express.service.ManagerService;
import com.express.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by linzhijie on 2016/11/16.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    ManagerService managerService;

    @RequestMapping(method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String dologin(Manage manage){
        if(managerService.getManagerById(manage.getId()).getPassword()==manage.getPassword()){
            return "managerindex";
        }
        else
            return "login";
    }
}
