package com.internousdev.fifties.action;

import java.util.ArrayList;
import java.util.Map;

import com.internousdev.fifties.dto.CartInfoDTO;



public class CartAction  {

	private Map<String, Object> session;

	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private int productTotalPrice;
	private int CartTotalPrice;

	public String execute() {

		//userIdがセッションに格納されているかログイン判定
		return SUCCESS;
	}
}
