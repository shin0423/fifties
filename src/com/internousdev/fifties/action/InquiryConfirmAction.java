package com.internousdev.fifties.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class InquiryConfirmAction extends ActionSupport implements SessionAware{
	private String inquiryName;
	private String inquiryEmail;
	private String qtype;
	private String inquiryBody;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;
		if(!(inquiryName.equals(""))
		 && !(qtype.equals(""))
		 && !(qtype.equals("notSelect"))
		 && !(inquiryBody.equals(""))){
			session.put("inquiryName", inquiryName);
			session.put("inquiryEmail", inquiryEmail);
			session.put("qtype", qtype);
			session.put("inquiryBody", inquiryBody);
		}else{
			setErrorMessage("未記入の項目があります。");
			result="ERROR";
		}
	return result;
	}

	public String getInquiryName(){
		return inquiryName;
	}
	public void setInquiryName(String inquiryName){
		this.inquiryName = inquiryName;
	}


	public String getInquiryEmail(){
		return inquiryEmail;
	}
	public void setInquiryEmail(String inquiryEmail){
		this.inquiryEmail = inquiryEmail;
	}


	public String getQtype(){
		return qtype;
	}
	public void setQtype(String qtype){
		this.qtype = qtype;
	}


	public String getInquiryBody(){
		return inquiryBody;
	}
	public void setInquiryBody(String inquiryBody){
		this.inquiryBody = inquiryBody;
	}


	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}


	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}
}
