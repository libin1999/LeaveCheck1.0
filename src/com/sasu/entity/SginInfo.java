package com.sasu.entity;

public class SginInfo {		//班主任审核信息		李娇
	private int id;
	private String content;	//内容
	private LeaveInfo leave;	//假条对象
	private String record_time;	//签收假条时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LeaveInfo getLeave() {
		return leave;
	}
	public void setLeave(LeaveInfo leave) {
		this.leave = leave;
	}
	public String getRecord_time() {
		return record_time;
	}
	public void setRecord_time(String record_time) {
		this.record_time = record_time;
	}
	

}
