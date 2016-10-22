package com.express.DAO;

import com.express.entity.Order;

import java.util.List;

/**
 * Created by linzhijie on 2016/10/22.
 */
public interface OrderDao {

    public Order getOrderById(int id);

    public List<Order> getAllOrder();

    public boolean addOrder(Order order);

    public boolean delOrder(int id);

    public boolean updOrder(Order order);
}
