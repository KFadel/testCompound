package com.ntg.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.ntg.pojo.User;
import com.ntg.view.UserViewImple;

/**
 *
 * @author AndDeve
 */
@Transactional
@Repository
public class UserDAOImple implements UserDAOInter {
	static final Logger logger = LogManager.getLogger(UserDAOImple.class
			.getName());

//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
	
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Transactional
    @Override
    public Object insertUser(Object obj) {
    	logger.entry();
    	logger.info("insertUser :: " + obj.toString());
        int rows = 0;
//        sessionFactory.getCurrentSession().persist(u);
      
        
        if (obj instanceof User) {
            final User u = (User) obj;

            transactionTemplate.execute(new TransactionCallback<Object>() {

                @Override
                public Object doInTransaction(TransactionStatus ts) {
                    Session session = getHibernateTemplate().getSessionFactory().openSession();
                    session.save(u);
                   return null;
                }
            });
            return u;
        }
        return null;
    }

    @Override
    public boolean deleteUser(Object obj) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object selectUser(Object obj) {

        return null;
    }

    @Override
    public Collection selectAllUser() {

        return null;

    }

    @Override
    public boolean updateUser(Object obj) {

        return false;
    }
    
    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


}

