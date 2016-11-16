package com.express.service.serviceImp;

import com.express.DAO.ManagerDao;
import com.express.entity.Manage;
import com.express.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by linzhijie on 2016/11/16.
 */
@Repository
public class ManagerServiceImp implements ManagerService{

    @Autowired
    ManagerDao managerDao;

    public Manage getManagerById(int id) {
        return managerDao.getManagerById(id);
    }

    public List<Manage> getAllManager() {
        return managerDao.getAllManager();
    }

    public boolean addManager(Manage man) {
        return managerDao.addManager(man);
    }

    public boolean delManager(int id) {
        return managerDao.delManager(id);
    }

    public boolean updManager(Manage man) {
        return managerDao.updManager(man);
    }
}
