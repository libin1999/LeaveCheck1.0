package com.sasu.entity;

public class CollegeLeaderInfo {			//ѧԺ�쵼��Ϣ    	����Ծ
	private int id;
	private int leader_account;	//�˺�
	private UserInfo user;			//�˺���Ϣ��
	private String leader_name;		//�쵼����
	private String leader_sex;		//�쵼�Ա�
	private CollegeInfo college;	//����ѧԺ�Ķ�����Ϣ
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLeader_account() {
		return leader_account;
	}
	public void setLeader_account(int leader_account) {
		this.leader_account = leader_account;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public String getLeader_name() {
		return leader_name;
	}
	public void setLeader_name(String leader_name) {
		this.leader_name = leader_name;
	}
	public String getLeader_sex() {
		return leader_sex;
	}
	public void setLeader_sex(String leader_sex) {
		this.leader_sex = leader_sex;
	}
	public CollegeInfo getCollege() {
		return college;
	}
	public void setCollege(CollegeInfo college) {
		this.college = college;
	}
	

}
