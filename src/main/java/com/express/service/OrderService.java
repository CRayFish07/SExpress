package com.express.service;

import com.express.entity.Order;

import java.util.List;

/**
 * Created by linzhijie on 2016/11/16.
 */
public interface OrderService {
    public Order getOrderById(int id);

    public List<Order> getAllOrder();

    public boolean addOrder(Order order);

    public boolean delOrder(int id);

    public boolean updOrder(Order order);
}
