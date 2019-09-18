package com.sasu.entity;

public class CollegeLeaderInfo {			//学院领导信息    	曾佳跃
	private int id;
	private int leader_account;	//账号
	private UserInfo user;			//账号信息等
	private String leader_name;		//领导姓名
	private String leader_sex;		//领导性别
	private CollegeInfo college;	//所在学院的对象信息
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
