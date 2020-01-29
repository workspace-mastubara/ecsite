package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport implements SessionAware{

	private int deleteFlg;
	private ItemDeleteCompleteDAO dao = new ItemDeleteCompleteDAO();
	private Map<String, Object>session;

	public String execute(){
		if(deleteFlg == 1){
			dao.deleteItem(Integer.parseInt(session.get("id").toString()));
		}

		return SUCCESS;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public int getDeleteFlg(){
		return this.deleteFlg;
	}
	public void setDeleteFlg(int deleteFlg){
		this.deleteFlg = deleteFlg;
	}

}
