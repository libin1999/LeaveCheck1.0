package com.sasu.entity;

public class LessonInfo {		//�ڿ���Ϣ		̷��
	private int id;
	private CourseInfo course;	//�ÿγ̵Ķ���
	private ClazzInfo clazz;	//�Ͽΰ༶����Ϣ
	private TeacherInfo teacher;	//�Ͽ���ʦ��Ϣ
	private int weekday;	//�Ͽ��������ڼ�
	private WorkRestInfo clazz_begin;	//�Ͽδӵڼ��ڿ�ʼ
	private WorkRestInfo clazz_over;		//�Ͽε��ڼ��ڽ���
	private String clazz_room; //�Ͽν��ұ��
	
	public WorkRestInfo getClazz_begin() {
		return clazz_begin;
	}
	public void setClazz_begin(WorkRestInfo clazz_begin) {
		this.clazz_begin = clazz_begin;
	}
	public WorkRestInfo getClazz_over() {
		return clazz_over;
	}
	public void setClazz_over(WorkRestInfo clazz_over) {
		this.clazz_over = clazz_over;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CourseInfo getCourse() {
		return course;
	}
	public void setCourse(CourseInfo course) {
		this.course = course;
	}
	public ClazzInfo getClazz() {
		return clazz;
	}
	public void setClazz(ClazzInfo clazz) {
		this.clazz = clazz;
	}
	public TeacherInfo getTeacher() {
		return teacher;
	}
	public void setTeacher(TeacherInfo teacher) {
		this.teacher = teacher;
	}
	public int getWeekday() {
		return weekday;
	}
	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}
	public String getClazz_room() {
		return clazz_room;
	}
	public void setClazz_room(String clazz_room) {
		this.clazz_room = clazz_room;
	}
	

}
