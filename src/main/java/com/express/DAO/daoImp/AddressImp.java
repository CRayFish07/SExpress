package com.express.DAO.daoImp;

import com.express.DAO.AddressDao;
import com.express.entity.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by linzhijie on 2016/10/22.
 */
@Transactional
@Repository
public class AddressImp implements AddressDao{

    @Autowired
    private SessionFactory sessionFactory;
    Session session = sessionFactory.getCurrentSession();

    public Address getAddressByPhone(String phone) {
        String hql = "from Address ad where ad.phone = :phone";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        return (Address)query.uniqueResult();
    }

    public List<Address> getAllAddress() {
        String hql = "from Address";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        return query.list();
    }

    public boolean addAddress(Address address) {
        int i = (Integer)session.save(address);
        if(i > 0 )
            return true;
        else
            return false;
    }

    public boolean updAddress(Address address) {
        String hql = "update Address a set o.saddress = :saddress,o.raddress = :raddress,o.phone = :phone where o.id =:id";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("saddress",address.getSaddress());
        query.setParameter("raddress",address.getRaddress());
        query.setParameter("phone",address.getPhone());
        return (query.executeUpdate() > 0);
    }

    public boolean delAddress(int id) {
        String hql = "delete Address a where a.id= :id";
        Query query = session.createQuery(hql);
        query.setParameter("id",id);
        return (query.executeUpdate() > 0);
    }
}
