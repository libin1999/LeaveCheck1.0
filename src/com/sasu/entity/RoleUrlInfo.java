package com.sasu.entity;

public class RoleUrlInfo {	//ĳ�ֽ�ɫ��Ӧ����Щ����  ���
	private int id;
	private RoleInfo role_id;//��ɫ���
	private OptUrl url_id;//url���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RoleInfo getRole_id() {
		return role_id;
	}
	public void setRole_id(RoleInfo role_id) {
		this.role_id = role_id;
	}
	public OptUrl getUrl_id() {
		return url_id;
	}
	public void setUrl_id(OptUrl url_id) {
		this.url_id = url_id;
	}
	
}
