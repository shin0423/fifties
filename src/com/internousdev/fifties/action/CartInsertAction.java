package com.internousdev.fifties.action;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CartInsertAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private productCount;
	private productId;
}
