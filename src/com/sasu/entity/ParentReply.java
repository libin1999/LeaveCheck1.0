package com.sasu.entity;

public class ParentReply {		//父母回复记录		谭力
	private int id;
	private String content;	//发送的内容模板
	private LeaveInfo leave;	//请假信息对象
	private String record_time;	//记录截止时间
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
