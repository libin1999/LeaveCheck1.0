package com.sasu.entity;

public class LeaveInfo {		//�����Ϣ		��ʤ
	private int id;
	private StudentInfo student;	//��ѧ������
	private String record_item;	//��ٷ�ʽ���¼٣����٣�
	private String leave_reason;	//���ԭ��
	private String leave_begin;		//��ٿ�ʼʱ��
	private String leave_end;		//��ٽ�ֹʱ��
	private int record_status;		//���״��(1,2,3)
	private String record_date;		//������¼ʱ��
	
	public StudentInfo getStudent() {
		return student;
	}
	public void setStudent(StudentInfo student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRecord_item() {
		return record_item;
	}
	public void setRecord_item(String record_item) {
		this.record_item = record_item;
	}
	public String getLeave_reason() {
		return leave_reason;
	}
	public void setLeave_reason(String leave_reason) {
		this.leave_reason = leave_reason;
	}
	public String getLeave_begin() {
		return leave_begin;
	}
	public void setLeave_begin(String leave_begin) {
		this.leave_begin = leave_begin;
	}
	public String getLeave_end() {
		return leave_end;
	}
	public void setLeave_end(String leave_end) {
		this.leave_end = leave_end;
	}
	public int getRecord_status() {
		return record_status;
	}
	public void setRecord_status(int record_status) {
		this.record_status = record_status;
	}
	public String getRecord_date() {
		return record_date;
	}
	public void setRecord_date(String record_date) {
		this.record_date = record_date;
	}
	

}
