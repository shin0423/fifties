package com.internousdev.fifties.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dao.CartInfoDAO;
import com.internousdev.fifties.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
//山本作成
public class CartAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private String price;
	private String userId;
	private int productTotalPrice;
	private int CartTotalPrice;

	public String execute() {
		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		//ログインしていない場合。
		//ログインしている場合。
		if((boolean) session.get("loginFlg")){
			cartList = cartInfoDAO.getUserCartList((String) session.get("userId"));
		}else{
			String tempUserId = session.get("tempUserId").toString();
			cartList = cartInfoDAO.getTempUserCartList(tempUserId);
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
