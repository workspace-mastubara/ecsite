package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {
	private List<UserInfoDTO> dtoList = new ArrayList<UserInfoDTO>();

	public List<UserInfoDTO> getUserList(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnect();

		String sql = "SELECT id, login_id, user_name "
				+ "FROM login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserInfoDTO dto = new UserInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setLoginId(rs.getString("login_id"));
				dto.setUserName(rs.getString("user_name"));

				dtoList.add(dto);
			}
		} catch(SQLException e){
			e.printStackTrace();
		} try {
			con.close();
 		} catch(SQLException e){
			e.printStackTrace();
 		}
		return dtoList;

	}

}
