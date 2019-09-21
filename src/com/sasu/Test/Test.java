package com.sasu.Test;

import java.util.List;

import com.sasu.Dao.ClazzDao;
import com.sasu.entity.ClazzInfo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClazzDao dao=new ClazzDao();
//		ClazzInfo info=dao.getClazzById(4);
//		System.out.println(info.getClazz_name());
//		dao.delete(info);
		List<ClazzInfo> list=dao.getClazzs();
		for(ClazzInfo clazz:list) {
			System.out.println(clazz.getClazz_name());
		}
	}
}
