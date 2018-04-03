package com.internousdev.fifties.action;

import java.util.ArrayList;
import java.util.Map;

import com.internousdev.fifties.dto.CartInfoDTO;

public class CartAction  {

	private Map<String, Object> session;

	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private

	public String execute() {
		return SUCCESS;
	}
}
