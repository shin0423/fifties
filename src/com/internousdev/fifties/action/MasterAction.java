package com.internousdev.fifties.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.fifties.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	private ArrayList<ProductDTO> productList =new ArrayList<ProductDTO>();


	public String execute(){
		return SUCCESS;
	}
	public Map<String,Object>getSession(){
		return this.session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public ArrayList<ProductDTO> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<ProductDTO> productList) {
		this.productList = productList;
	}

}
