package com.internousdev.ecsite.dto;

public class ItemInfoDTO {
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private int id;
	private String insertDate;
	private String updatedDate;

	public String getItemName(){
		return this.itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public int getItemPrice(){
		return this.itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getItemStock(){
		return this.itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock = itemStock;
	}

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getInsertDate(){
		return this.insertDate;
	}
	public void setInsertDate(String insertDate){
		this.insertDate = insertDate;
	}

	public String getUpdatedDate(){
		return this.updatedDate;
	}
	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}
}
