package com.sasu.entity;

public class CounselorInfo {	//�꼶����Ա��Ϣ		����Ծ
	private int id;
	private String counselor_number; 	//����Ա��ְ�����
	private String counselor_name;		//����Ա����
	private String counselor_sex;		//����Ա�Ա�
	private CollegeInfo college;		//ѧԺ��Ϣ����
	private String phone;
	private String gard;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGard() {
		return gard;
	}
	public void setGard(String gard) {
		this.gard = gard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCounselor_number() {
		return counselor_number;
	}
	public void setCounselor_number(String counselor_number) {
		this.counselor_number = counselor_number;
	}
	public String getCounselor_name() {
		return counselor_name;
	}
	public void setCounselor_name(String counselor_name) {
		this.counselor_name = counselor_name;
	}
	public String getCounselor_sex() {
		return counselor_sex;
	}
	public void setCounselor_sex(String counselor_sex) {
		this.counselor_sex = counselor_sex;
	}
	public CollegeInfo getCollege() {
		return college;
	}
	public void setCollege(CollegeInfo college) {
		this.college = college;
	}
	

}
