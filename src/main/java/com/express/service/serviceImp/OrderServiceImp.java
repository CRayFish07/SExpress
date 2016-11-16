package com.express.service.serviceImp;

import com.express.DAO.OrderDao;
import com.express.entity.Order;
import com.express.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by linzhijie on 2016/11/16.
 */
@Repository
public class OrderServiceImp implements OrderService{

    @Autowired
    OrderDao orderDao;

    public Order getOrderById(int id) {
        return orderDao.getOrderById(id);
    }

    public List<Order> getAllOrder() {
        return orderDao.getAllOrder();
    }

    public boolean addOrder(Order order) {
        return orderDao.addOrder(order);
    }

    public boolean delOrder(int id) {
        return orderDao.delOrder(id);
    }

    public boolean updOrder(Order order) {
        return orderDao.updOrder(order);
    }
}
