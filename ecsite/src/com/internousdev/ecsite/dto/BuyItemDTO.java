package com.internousdev.ecsite.dto;

public class BuyItemDTO {
	private int id;
	private String itemName;
	private String itemPrice;
	private int stock;

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getItemName(){
		return this.itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return this.itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}


	public int getStock(){
		return this.stock;
	}
	public void setStock(int stock){
		this.stock = stock;
	}

}
