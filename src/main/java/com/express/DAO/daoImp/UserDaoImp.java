package com.express.DAO.daoImp;

import com.express.DAO.UserDao;
import com.express.entity.User;
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
public class UserDaoImp implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;
    Session session = sessionFactory.getCurrentSession();

    public User getUserByPhone(String phone) {
        String hql = "from User a where a.phone = :phone";
        Query query = session.createQuery(hql);
        query.setParameter("phone",phone);
        return (User)query.uniqueResult();
    }

    public List<User> getAllUser() {
        String hql = "from User";
        Query query = session.createQuery(hql);
        return query.list();
    }

    public boolean addUser(User user) {
        int i = (Integer)session.save(user);
        if(i > 0)
            return true;
        else
            return false;
    }

    public boolean delUser(String id) {
        String hql = "delete User a where a.id= :id";
        Query query = session.createQuery(hql);
        query.setParameter("id",id);
        return (query.executeUpdate() > 0);
    }

    public boolean updUser(User user) {
        String hql = "update User o set o.username = :username,o.phone = :phone where o.id =:id";
        //Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("username",user.getUsername());
        query.setParameter("phone",user.getPhone());
        query.setParameter("id",user.getId());
        return (query.executeUpdate() > 0);
    }
}
