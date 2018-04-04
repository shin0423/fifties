package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.fifties.dto.ProductSearchDTO;
import com.internousdev.fifties.util.DBConnector;

public class ProductSearchDAO {

	public List<ProductSearchDTO> getProduct_Info(String productName, int categoryId) throws SQLException {
		List<ProductSearchDTO> searchDTOList = new ArrayList<ProductSearchDTO>();
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		String sql = "SELECT*FROM user_info";

		if (categoryId == 0) {
			sql = sql + " WEHRE category_id";
		} else {
			sql = sql + " WEHRE category_id LIKE '%category%' AND product_name LIKE '%searchWord%'";
		}

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			con.close();

		}

		return searchDTOList;


	}
}
