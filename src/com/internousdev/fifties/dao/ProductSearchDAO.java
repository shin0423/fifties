package com.internousdev.fifties.dao;
import java.sql.Connection;

import com.internousdev.fifties.dto.ProductSearchDTO;
import com.internousdev.fifties.util.DBConnector;


public class ProductSearchDAO {
	private DBConnector dbConnector = dbConnector.getConnector;
	private Connection connection = dbConnector.getConnection;
	private ProductSearchDTO productSearchDTO = new ProductSearchDTO();

	public ProductSearchDTO getCategoryid(String searchWord,int categoryId) {
		String sql ="SELECT FROM user_info wehre category_id = ? AND product_name LIKE '%searchWord%'";


	}
}