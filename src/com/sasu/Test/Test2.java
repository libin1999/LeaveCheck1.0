package com.sasu.Test;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sasu.Util.HibernateSessionFactory;
import com.sasu.entity.LeaveInfo;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction t=session.beginTransaction();
		List<LeaveInfo> info=session.createQuery("from LeaveInfo info where student_id = (select id from StudentInfo info where id= 2)").list();
//		System.out.println(info.getStudent().getStu_name());
		
		for(LeaveInfo clazz:info) {
			System.out.println(clazz.getStudent().getStu_name());
		}
		t.commit();
		session.close();
	}

}
