package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport {
	private UserListDAO dao = new UserListDAO();
	private List<UserInfoDTO> dtoList = new ArrayList<UserInfoDTO>();

	public String execute() throws SQLException{

		dtoList = dao.getUserList();

		return SUCCESS;
	}

	public List<UserInfoDTO> getDtoList(){
		return this.dtoList;
	}
	public void setDtoList(List<UserInfoDTO> dtoList){
		this.dtoList = dtoList;
	}

}
