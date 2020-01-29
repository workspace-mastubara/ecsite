package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemDetailsDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailsAction extends ActionSupport{
	private int id;

	private ItemDetailsDAO dao = new ItemDetailsDAO();
	private ItemInfoDTO dto = new ItemInfoDTO();

	public String execute(){
		System.out.println(id);

		dto = dao.itemDetail(id);

		return SUCCESS;
	}

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}

	public ItemInfoDTO getDto(){
		return this.dto;
	}
	public void setDto (ItemInfoDTO dto){
		this.dto = dto;
	}

}
