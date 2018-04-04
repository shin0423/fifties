package com.internousdev.fifties.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private int productTotalPrice;
	private int CartTotalPrice;

	public String execute() {
		CartInfoDAO cartInfoDAO = new CartInfoDAO();



		//ログインしていない場合。
		if(!(boolean) session.get("loginFlg")) {
			session.put("loginFlg", false);
		}
		//ログインしている場合。
		if((boolean) session.get("loginFlg")){
			cartList = cartInfoDAO.getUserCartList((String) session.get("userId"));


		}else{
			String tempUserId = (String) session.get("tempUserId");
			cartList = cartInfoDAO.getTempUserCartList((String) session.get("userId"));

		}
		//tempUserIdをクッキーに保存して判別
		//仮ユーザーもデータベースに保存する。
		//userIdがセッションに格納されているかログイン判定
		//
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
