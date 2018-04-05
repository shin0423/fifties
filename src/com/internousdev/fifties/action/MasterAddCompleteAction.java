package com.internousdev.fifties.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.fifties.dao.MasterAddDAO;
import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.DateUtil;

public class MasterAddCompleteAction {




	private String imageFileName;

	private String itemName;

	private String itemKanaName;

	private String itemPrice;

	private String itemStock;

	private String imageName;

	public String image;

	public Map<String, Object> session;

	private DateUtil dateUtil = new DateUtil();

	private MasterAddDAO dao = new MasterAddDAO();
	

	public String execute() throws SQLException {
		String result = ERROR;


		if (itemName.length() != 0 && itemKanaName.length() !=0 && itemPrice.length() != 0 && itemStock.length() != 0 && image.length() != 0) {
			dto = dao.productDTO(itemName, itemKanaName, itemPrice, itemStock, imageName);
			
			dateUtil.getDate());

			result = SUCCESS;
			return result;
		}
		return result;
	}

}
