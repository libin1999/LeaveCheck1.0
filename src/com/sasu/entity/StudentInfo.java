package com.sasu.entity;

public class StudentInfo {		//ѧ����Ϣ		��ʤ
	private int id;
	private String stu_number;	//ѧ��
	private UserInfo user;		//ѧ�����˻��������
	private String stu_name;	//����
	private String stu_sex;		//�Ա�
	private String stu_phone; 	//ѧ������ϵ��ʽ
	private int stu_grade;		//��ѧ���
	private	String stu_photofile;   //ѧ����Ƭ�ļ�����Ϣ
	private String stu_parent;		//ѧ����ĸ����
	private String stu_parentPhone;	//ѧ����ĸ��ϵ��ʽ
	private String stu_home_adrress;	//ѧ����ͥסַ
	private ClazzInfo clazz;	//ѧ�����ڰ༶�������Ϣ
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStu_number() {
		return stu_number;
	}
	public void setStu_number(String stu_number) {
		this.stu_number = stu_number;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}
	public String getStu_phone() {
		return stu_phone;
	}
	public void setStu_phone(String stu_phone) {
		this.stu_phone = stu_phone;
	}
	public int getStu_grade() {
		return stu_grade;
	}
	public void setStu_grade(int stu_grade) {
		this.stu_grade = stu_grade;
	}
	public String getStu_photofile() {
		return stu_photofile;
	}
	public void setStu_photofile(String stu_photofile) {
		this.stu_photofile = stu_photofile;
	}
	public String getStu_parent() {
		return stu_parent;
	}
	public void setStu_parent(String stu_parent) {
		this.stu_parent = stu_parent;
	}
	public String getStu_parentPhone() {
		return stu_parentPhone;
	}
	public void setStu_parentPhone(String stu_parentPhone) {
		this.stu_parentPhone = stu_parentPhone;
	}
	public ClazzInfo getClazz() {
		return clazz;
	}
	public void setClazz(ClazzInfo clazz) {
		this.clazz = clazz;
	}
	public String getStu_home_adrress() {
		return stu_home_adrress;
	}
	public void setStu_home_adrress(String stu_home_adrress) {
		this.stu_home_adrress = stu_home_adrress;
	}
	
	

}
