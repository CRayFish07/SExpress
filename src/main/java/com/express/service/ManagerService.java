package com.express.service;

import com.express.entity.Manage;

import java.util.List;

/**
 * Created by linzhijie on 2016/11/16.
 */
public interface ManagerService {
    public Manage getManagerById(int id);

    public List<Manage> getAllManager();

    public boolean addManager(Manage man);

    public boolean delManager(int id);

    public boolean updManager(Manage man);
}
