package com.express.controller;

import com.express.entity.Order;
import com.express.service.AddressService;
import com.express.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linzhijie on 2016/11/16.
 */
@Controller
@RequestMapping("/express")
public class expressController {

    @Autowired
    AddressService addressService;

    @Autowired
    OrderService orderService;

    private boolean validateOrderInfo(Order order){
        if(order.getPhone() != null && order.getRaddress() != null && order.getSaddress() != null){
            return true;
        }
        else
            return false;
    }

    @RequestMapping("/addOrder")
    public String  addUserOrder(Order order){
        if(validateOrderInfo(order)){
            orderService.addOrder(order);
            return "index";
        }
        else
            return "addorder";
    }


}
