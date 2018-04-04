package com.internousdev.fifties.dto;

public class ProductSearchDTO {
	private int categoryId;
	private String productName;

	public int getCategoryId(){
		return categoryId;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public String getProductName(){
		return product_name;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}
}
