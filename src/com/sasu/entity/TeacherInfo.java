package com.sasu.entity;

public class TeacherInfo {	//��ʦ��Ϣ		��ʤ
	private int id;
	private String teacher_number;	//��ְ�����
	private UserInfo user;			//�˻�������Ϣ����
	private String teacher_name;	//��ְ������
	private String teacher_sex;		//�Ա�
	private String teacher_level;	//����ְ��
	private CollegeInfo college;	//����ѧԺ�Ķ���
	
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacher_number() {
		return teacher_number;
	}
	public void setTeacher_number(String teacher_number) {
		this.teacher_number = teacher_number;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_sex() {
		return teacher_sex;
	}
	public void setTeacher_sex(String teacher_sex) {
		this.teacher_sex = teacher_sex;
	}
	public String getTeacher_level() {
		return teacher_level;
	}
	public void setTeacher_level(String teacher_level) {
		this.teacher_level = teacher_level;
	}
	public CollegeInfo getCollege() {
		return college;
	}
	public void setCollege(CollegeInfo college) {
		this.college = college;
	}
	

}
