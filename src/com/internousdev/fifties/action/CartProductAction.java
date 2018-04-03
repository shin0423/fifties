package com.internousdev.fifties.action;

import java.util.ArrayList;
import java.util.Map;

import com.internousdev.fifties.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartProductAction extends ActionSupport {
	private Map<String, Object> session;

	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();


	public String execute() {
		return SUCCESS;
	}


}
