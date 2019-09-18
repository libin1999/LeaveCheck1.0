package com.sasu.Test;

import com.sasu.Dao.ClazzDao;
import com.sasu.entity.ClazzInfo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClazzDao dao=new ClazzDao();
		ClazzInfo info=dao.getClazzById(2);
		System.out.println(info.getClazz_name());
		System.out.println(info.getMajor().getMajor_name());
		System.out.println(info.getMajor().getCollege().getName());
		System.out.println(info.getTeacher().getTeacher_name());
	}

}
