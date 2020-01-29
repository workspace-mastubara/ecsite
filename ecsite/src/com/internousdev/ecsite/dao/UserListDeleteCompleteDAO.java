package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteCompleteDAO {
	public void userListDelete(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnect();

		String sql = "DELETE FROM login_user_transaction WHERE admin_flg IS NULL";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();

		} catch(SQLException e){
			e.printStackTrace();
		} try {
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
