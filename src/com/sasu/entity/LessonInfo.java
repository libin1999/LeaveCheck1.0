package com.sasu.entity;

public class LessonInfo {		//授课信息		谭力
	private int id;
	private CourseInfo course;	//该课程的对象
	private ClazzInfo clazz;	//上课班级的信息
	private TeacherInfo teacher;	//上课老师信息
	private int weekday;	//上课是在星期几
	private WorkRestInfo clazz_begin;	//上课从第几节开始
	private WorkRestInfo clazz_over;		//上课到第几节结束
	private String clazz_room; //上课教室编号
	
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
