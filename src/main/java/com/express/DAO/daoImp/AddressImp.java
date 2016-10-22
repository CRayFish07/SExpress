package com.express.DAO.daoImp.DaoImp;

import com.express.DAO.daoImp.Address;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by linzhijie on 2016/10/22.
 */
@Transactional
@Repository
public class AddressImp implements Address{

    @Autowired
    private SessionFactory sessionFactory;

    public Address getAddressByPhone(String phone) {
        String hql = "from Address a where a.phone = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0,phone);

        return null;
    }

    public Address getAddressById(int id) {
        return null;
    }

    public boolean addAddress(Address address) {
        return false;
    }

    public boolean updAddress(Address address) {
        return false;
    }
}
