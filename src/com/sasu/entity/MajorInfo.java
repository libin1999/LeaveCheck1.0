package com.sasu.entity;

public class MajorInfo {		//רҵ��Ϣ		���
	private int id;
	private String major_name;	//רҵ����
	private String major_sequence;	//רҵ������ֵ
	private String major_type;	//רҵ����
	private String major_semeters;	//ѧϰ��ѧ����
	private CollegeInfo college;	//רҵ������ѧԺ�Ķ���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor_name() {
		return major_name;
	}
	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}
	public String getMajor_sequence() {
		return major_sequence;
	}
	public void setMajor_sequence(String major_sequence) {
		this.major_sequence = major_sequence;
	}
	public String getMajor_type() {
		return major_type;
	}
	public void setMajor_type(String major_type) {
		this.major_type = major_type;
	}
	public String getMajor_semeters() {
		return major_semeters;
	}
	public void setMajor_semeters(String major_semeters) {
		this.major_semeters = major_semeters;
	}
	public CollegeInfo getCollege() {
		return college;
	}
	public void setCollege(CollegeInfo college) {
		this.college = college;
	}
	

}
