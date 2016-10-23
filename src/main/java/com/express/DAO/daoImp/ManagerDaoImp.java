package com.express.DAO.daoImp;

import com.express.DAO.ManagerDao;
import com.express.entity.Manage;
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
public class ManagerDaoImp implements ManagerDao {

    @Autowired
    private SessionFactory sessionFactory;
    Session session = sessionFactory.getCurrentSession();

    public Manage getManagerById(int id) {
        String hql = "from Manager m where m.id = :id";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("id",id);
        return (Manage)query.uniqueResult();
    }

    public List<Manage> getAllManager() {
        String hql = "from Manager";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        return query.list();
    }

    public boolean addManager(Manage man) {
        int i =(Integer)session.save(man);
        if(i > 0)
            return true;
        else
            return false;
    }

    public boolean delManager(int id) {
        String hql = "delete Manger a where a.id= :id";
        Query query = session.createQuery(hql);
        query.setParameter("id",id);
        return (query.executeUpdate() > 0);
    }

    public boolean updManager(Manage man) {
        String hql = "update Manage o set o.name = :name,o.password = :password,o.type = :ttype where o.id =:id";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("name",man.getName());
        query.setParameter("password",man.getPassword());
        query.setParameter("ttype",man.getType());
        query.setParameter("id",man.getId());
        return (query.executeUpdate() > 0);
    }
}
