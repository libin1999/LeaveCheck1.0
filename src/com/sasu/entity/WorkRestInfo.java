package com.sasu.entity;

public class WorkRestInfo {		//ѧУ��Ϣʱ���		̷��
	private int id;
	private String sequence;	//�ڼ���ʱ��
	private String time_begin;	//��ʼʱ��
	private String time_end;	//����ʱ��
	private String semester;	//�ڼ�ѧ����Ϣʱ���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getTime_begin() {
		return time_begin;
	}
	public void setTime_begin(String time_begin) {
		this.time_begin = time_begin;
	}
	public String getTime_end() {
		return time_end;
	}
	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	

}
