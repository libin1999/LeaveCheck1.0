package com.sasu.entity;

public class ClazzInfo {	//�༶��Ϣ		���
	private int id;
	private String clazz_name;	//�༶����
	private int clazz_sequence; //�༶������ֵ
	private MajorInfo major;
	private TeacherInfo teacher;	//��ʦ����
	public TeacherInfo getTeacher() {
		return teacher;
	}
	public void setTeacher(TeacherInfo teacher) {
		this.teacher = teacher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClazz_name() {
		return clazz_name;
	}
	public void setClazz_name(String clazz_name) {
		this.clazz_name = clazz_name;
	}
	public int getClazz_sequence() {
		return clazz_sequence;
	}
	public void setClazz_sequence(int clazz_sequence) {
		this.clazz_sequence = clazz_sequence;
	}
	public MajorInfo getMajor() {
		return major;
	}
	public void setMajor(MajorInfo major) {
		this.major = major;
	}
}
