package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;


public class ItemDetailsDAO {
	private ItemInfoDTO dto = new ItemInfoDTO();

	public ItemInfoDTO itemDetail(int id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnect();

		String sql = "SELECT * FROM item_info_transaction WHERE id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getInt("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdatedDate(rs.getString("updated_date"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} try {
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
}
