package com.sasu.entity;

public class TimeSheet {	//ѧ��������Ϣ		��ʤ
	private int id;
	private TeacherInfo teacher;	//��Ӧ�Ľ�ʦ����
	private StudentInfo student;	//��ѧ������
	private String record_item;		//�ü�¼������
	private String record_date;		//��¼����ʱ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TeacherInfo getTeacher() {
		return teacher;
	}
	public void setTeacher(TeacherInfo teacher) {
		this.teacher = teacher;
	}
	public StudentInfo getStudent() {
		return student;
	}
	public void setStudent(StudentInfo student) {
		this.student = student;
	}
	public String getRecord_item() {
		return record_item;
	}
	public void setRecord_item(String record_item) {
		this.record_item = record_item;
	}
	public String getRecord_date() {
		return record_date;
	}
	public void setRecord_date(String record_date) {
		this.record_date = record_date;
	}
	

}
