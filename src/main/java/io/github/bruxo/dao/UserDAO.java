package io.github.bruxo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import io.github.bruxo.hibernate.HibernateUtil;
import io.github.bruxo.persistence.User;
 
public class UserDAO {
 
    public String createUser(String name, Integer age) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            User user = new User();
            user.setName(name);
            user.setAge(age);
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Error creating User :" + e.getMessage());
            session.getTransaction().rollback();
            return "failure" ;
        }
        return "success";
    }
 
    public List getUsers(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List users = null;
        try {
            session.beginTransaction();
            users = session
                    .createQuery("from User where name like :name")
                    .setParameter("name", "%" + name + "%").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Error getting Users :" + e);
            session.getTransaction().rollback();
        }
        return users;
    }
    
    public List getUsersCriteria(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List users = null;
        try {
            session.beginTransaction();
            Criteria crit = session.createCriteria(User.class);
            crit.add( Restrictions.like("name", "%" + name + "%") );
            crit.setMaxResults(50);
            users = crit.list();
        } catch (Exception e) {
            System.err.println("Error getting Users :" + e);
            session.getTransaction().rollback();
        }
        return users;
    }
}