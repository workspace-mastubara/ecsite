package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{
	private ItemListDAO dao = new ItemListDAO();
	private List<ItemInfoDTO> dtoList = new ArrayList<ItemInfoDTO>();
	private Map<String, Object>session;

	public String execute(){
		dtoList = dao.getItemInfo();

		session.put("dtoList", dtoList);

		return SUCCESS;
	}

	public List<ItemInfoDTO> getDtoList(){
		return this.dtoList;
	}
	public void setDtoList(List<ItemInfoDTO> dtoList){
		this.dtoList = dtoList;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}



}
