package com.internousdev.fifties.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class InquiryConfirmAction extends ActionSupport implements SessionAware{
	private String name;
	private String email;
	private String qtype;
	private String body;
	public Map<String,Object> inquirySession;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;
		if(!(name.equals(""))
		 && !(qtype.equals(""))
		 && !(qtype.equals("notSelect"))
		 && !(body.equals(""))){
			inquirySession.put("name", name);
			inquirySession.put("email", email);
			inquirySession.put("qtype", qtype);
			inquirySession.put("body", body);
		}else{
			setErrorMessage("未記入の項目があります。");
			result="ERROR";
		}
	return result;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}


	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}


	public String getQtype(){
		return qtype;
	}
	public void setQtype(String qtype){
		this.qtype = qtype;
	}


	public String getBody(){
		return body;
	}
	public void setBody(String body){
		this.body = body;
	}


	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}


	@Override
	public void setSession(Map<String,Object> inquirySession){
		this.inquirySession = inquirySession;
	}
	public Map<String,Object> getSession(){
		return this.inquirySession;
	}
}
