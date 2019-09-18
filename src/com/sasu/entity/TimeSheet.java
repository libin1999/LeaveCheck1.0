package com.sasu.entity;

public class TimeSheet {	//学生考勤信息		罗胜
	private int id;
	private TeacherInfo teacher;	//对应的教师对象
	private StudentInfo student;	//该学生对象
	private String record_item;		//该记录的内容
	private String record_date;		//记录考勤时间
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
