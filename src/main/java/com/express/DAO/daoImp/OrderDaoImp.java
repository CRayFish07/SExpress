package com.express.DAO.daoImp;

import com.express.DAO.OrderDao;
import com.express.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by linzhijie on 2016/10/23.
 */
@Transactional
@Repository
public class OrderDaoImp implements OrderDao{

    @Autowired
    private SessionFactory sessionFactory;
    Session session = sessionFactory.getCurrentSession();

    public Order getOrderById(int id) {
        String hql = "from com.express.entity.Order o where o.id = :id";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        return (Order)query.uniqueResult();
    }

    public List<Order> getAllOrder() {
        String hql = "from com.express.entity.Order";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        return query.list();
    }

    public boolean addOrder(Order order) {
        int i = (Integer)session.save(order);
        if(i>0){
            return true;
        }
        else
            return false;
    }

    public boolean delOrder(int id) {
        String hql = "delete Order a where a.id= :id";
        Query query = session.createQuery(hql);
        query.setParameter("id",id);
        return (query.executeUpdate() > 0);
    }

    public boolean updOrder(Order order) {
        String hql = "update com.express.entity.Order o set o.phone = :phone , " +
                "o.saddress = :saddress , o.raddress = :raddress , o.transnum = :transnum ,o.price = :price , o.weigth = :weight , o.uid = :uid where o.id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("phone",order.getPhone());
        query.setParameter("saddress",order.getSaddress());
        query.setParameter("raddress",order.getRaddress());
        query.setParameter("transnum",order.getTransnum());
        query.setParameter("price",order.getPrice());
        query.setParameter("weight",order.getWeight());
        query.setParameter("uid",order.getUid());
        query.setParameter("id",order.getId());

        return (query.executeUpdate() > 0);
    }
}
