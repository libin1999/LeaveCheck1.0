package com.sasu.Dao;

import org.hibernate.Session;

import com.sasu.Util.HibernateSessionFactory;
import com.sasu.entity.ClazzInfo;

public class ClazzDao {
	
	public ClazzInfo getClazzById(int id) {
		Session session=HibernateSessionFactory.getSession();
		return session.get(ClazzInfo.class,id);
	}
}
