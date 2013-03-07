package com.miao.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class AbstractDao<E> extends HibernateDaoSupport implements BaseDao<E>  {
	@Autowired  
	public void setSessionFactory0(SessionFactory sessionFactory){  
	  super.setSessionFactory(sessionFactory);  
	}  

	public void save(E model) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(model);
	}

	public void delete(E model) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(model);
	}

	public void update(E model) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(model);
	}
	

}
