package com.internousdev.fifties.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.CartInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CartInsertAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private String userId;
	private String tempUserId;
	private int productId;
	private int productCount;
	private int price;
	private CartInfoDAO cartInfoDAO = new CartInfoDAO();


	public String execute(){

		if((boolean) session.get("loginFlg")){
			int count = cartInfoDAO.insertUserCart(userId,productId,productCount,price);
			if(count == 1){
			}
		}else{
			tempUserId = session.get("tempUserId").toString();
			cartInfoDAO.insertTempUserCart(tempUserId, productId, productCount, price);
		}



		return SUCCESS;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getTempUserId() {
		return tempUserId;
	}


	public void setTempUserId(String tempUserId) {
		this.tempUserId = tempUserId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getProductCount() {
		return productCount;
	}


	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
