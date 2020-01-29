package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteConfirmAction extends ActionSupport{
	private String message;

	public String execute(){
		setMessage("1件削除します。よろしいですか？");

		return SUCCESS;
	}

	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

}
