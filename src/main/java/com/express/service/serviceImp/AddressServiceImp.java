package com.express.service.serviceImp;

import com.express.DAO.AddressDao;
import com.express.entity.Address;
import com.express.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.portlet.bind.annotation.ActionMapping;

import java.util.List;

/**
 * Created by linzhijie on 2016/11/16.
 */
@Repository
public class AddressServiceImp implements AddressService{

    @Autowired
    AddressDao addressDao;

    public Address getAddressByPhone(String phone) {
        return addressDao.getAddressByPhone(phone);
    }

    public List<Address> getAllAddress() {
        return getAllAddress();
    }

    public boolean addAddress(Address address) {
        return addressDao.addAddress(address);
    }

    public boolean updAddress(Address address) {
        return addressDao.updAddress(address);
    }

    public boolean delAddress(int id) {
        return addressDao.delAddress(id);
    }
}
