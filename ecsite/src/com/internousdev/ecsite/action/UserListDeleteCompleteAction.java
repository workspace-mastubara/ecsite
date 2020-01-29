package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport implements SessionAware{
	private String deleteFlg;
	private Map<String, Object>session;
	private UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();


	public String execute(){
		System.out.println(deleteFlg);
		if(deleteFlg.equals("1")){
			dao.userListDelete();

			System.out.println(session.get("deleteFlg"));
		}

		return SUCCESS;
	}

	public String getDeleteFlg(){
		return this.deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	public Map<String, Object> getSession(){
		return this.session;
 	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
