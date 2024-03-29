package com.sasu.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sasu.Util.HibernateSessionFactory;
import com.sasu.entity.ClazzInfo;

public class ClazzDao {
	
	public ClazzInfo getClazzById(int id) {
		Session session=HibernateSessionFactory.getSession();
		return session.get(ClazzInfo.class,id);
	}
	
	public void save(ClazzInfo info) {
		Session session=HibernateSessionFactory.getSession();
		Transaction t=session.beginTransaction();//开启事物
		session.save(info);
		t.commit();	//提交事务
		session.close();//关闭session对象
	}
	
	public void update(ClazzInfo info) {
		Session session=HibernateSessionFactory.getSession();
		Transaction t=session.beginTransaction();
		session.update(info);
		t.commit();
		session.close();
	}
	
	public void delete(ClazzInfo info) {
		System.out.println(info.getClazz_name());
		Session session=HibernateSessionFactory.getSession();
		Transaction t=session.beginTransaction();
		session.delete(info);
		t.commit();
		session.close();
	}
	
	public List<ClazzInfo> getClazzs(){
		Session session=HibernateSessionFactory.getSession();
		Transaction t=session.beginTransaction();
		String hql="from ClazzInfo";			//注意：hql语句是面向对象编写的，并非面向数据表查询
		List<ClazzInfo> list=session.createQuery(hql).list();
		t.commit();
		session.close();
		return list;
	}
}
