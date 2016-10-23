package com.express.DAO.daoImp;

import com.express.DAO.AddressDao;
import com.express.entity.Address;
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

    public Address getAddressByPhone(String phone) {
        return null;
    }

    public List<Address> getAllAddress() {
        return null;
    }

    public boolean addAddress(Address address) {
        return false;
    }

    public boolean updAddress(Address address) {
        return false;
    }

    public boolean delAddress(int id) {
        return false;
    }
}
