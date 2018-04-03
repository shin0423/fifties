package com.internousdev.fifties.dto;

public class ProductSearchDTO {
	public int categoryId;
	public String itemName;

	public int getCategoryId(){
		return categoryId;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}
}
