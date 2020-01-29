package com.internousdev.ecsite.dto;

public class UserInfoDTO {
	private int id;
	private String loginId;
	private String userName;

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getLoginId(){
		return this.loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
}
