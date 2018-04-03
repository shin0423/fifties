package com.internousdev.fifties.dao;

import com.internousdev.fifties.dto.ProductSearchDTO;
import com.internousdev.fifties.util.DBConnector;
import com.mysql.jdbc.Connection;

public class ProductSearchDAO {

	public ArrayList<ProductSearchDTO> getProduct_Info(String product_name, int categoryId) throws SQLException {
		List<ProductSearchDTO> searchDTOList = new ArrayList<ProductSearchDTO>();
		private DBConnector dbConnector = dbConnector.getConnector;
		private Connection connection = dbConnector.getConnection;
		private ProductSearchDTO productSearchDTO = new ProductSearchDTO();
		String sql = "SELECT*FROM user_info";

		if (category = 0) {
			sql = sql + " WEHRE category_id";
		} else {
			sql = sql + " WEHRE category_id LIKE '%category%' AND product_name LIKE '%searchWord%'";
		}
		try{
			PreparedStatemant pstmt = con.prepaeStatement(sql);


		}finally{

		}
}
}
/* category_id LIKE '%category%' AND product_name LIKE '%searchWord%' */