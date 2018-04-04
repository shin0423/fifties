package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.fifties.dao.MasterUpdateDAO;

public class MasterUpdateAction {
    private String product_id;
	private  int item_stock;
	private String dateUtil;

	public Map<String,Object> session;

	private  MasterUpdateDAO masterUpdateDAO=new  MasterUpdateDAO();


	public String execute() throws SQLException{



		masterUpdateDAO.productUpdateInfo(item_stock,  Integer.parseInt(product_id.toString()),dateUtil);
		

		String result = SUCCESS;
		return result;

	}




	public String getPriduct_id() {
		return product_id;
	}

	public void setPriduct_id(String priduct_id) {
		this.product_id = priduct_id;
	}

	public int getItem_stock(){
		return item_stock;
	}
	public void setItem_stock(int item_stock){
		this.item_stock=item_stock;
	}


}
