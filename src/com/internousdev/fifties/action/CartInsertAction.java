package com.internousdev.fifties.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CartInsertAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private int productCount;
	private int productId;

	public String execute(){

		return SUCCESS;
	}

}
