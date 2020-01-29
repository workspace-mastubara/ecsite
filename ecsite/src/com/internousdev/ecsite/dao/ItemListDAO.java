package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {
	private List<ItemInfoDTO> dtoList = new ArrayList<ItemInfoDTO>();

	public List<ItemInfoDTO> getItemInfo(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnect();

		String sql = "SELECT item_name, item_price, item_stock, id "
				+ "FROM item_info_transaction";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemInfoDTO dto = new ItemInfoDTO();

				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getInt("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setId(rs.getInt("id"));

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

	public void itemListDelete(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnect();

		String sql = "DELETE FROM item_info_transaction";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();
		} catch(SQLException e){
			e.printStackTrace();
		} try {
			con.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}

}
