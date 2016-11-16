package com.express.service;

import com.express.entity.Address;

import java.util.List;

/**
 * Created by linzhijie on 2016/11/16.
 */
public interface AddressService {
    public Address getAddressByPhone(String phone);

    public List<Address> getAllAddress();

    public boolean addAddress(Address address);

    public boolean updAddress(Address address);

    public boolean delAddress(int id);
}
