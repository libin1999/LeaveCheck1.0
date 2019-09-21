package com.sasu.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sasu.Util.HibernateSessionFactory;
import com.sasu.entity.OptUrl;

public class OptUrlDao {
	
	public OptUrl getLessonById(int id) {
		Session session=HibernateSessionFactory.getSession();
		return session.get(OptUrl.class,id);
	}
	
	public void save(OptUrl info) {
		Session session=HibernateSessionFactory.getSession();
		Transaction t=session.beginTransaction();//开启事物
		session.save(info);
		t.commit();	//提交事务
		session.close();//关闭session对象
	}
	
	public void update(OptUrl info) {
		Session session=HibernateSessionFactory.getSession();
		Transaction t=session.beginTransaction();
		session.update(info);
		t.commit();
		session.close();
	}
	
	public void delete(OptUrl info) {
		Session session=HibernateSessionFactory.getSession();
		Transaction t=session.beginTransaction();
		session.delete(info);
		t.commit();
		session.close();
	}
}
