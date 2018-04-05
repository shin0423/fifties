//@中嶋

package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.DBConnector;

public class ProductSearchDAO {

	public List<ProductDTO> getProduct_Info(String searchWord, int category) throws SQLException {
		List<ProductDTO> searchDTOList = new ArrayList<ProductDTO>();
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		String sql = "SELECT*FROM product_info";
		// 選択されたカテゴリID、検索ワードと一致する場合
		if (category == 0) {
			sql = sql + " WEHRE category_id";
		} else {
			sql = sql + " WEHRE category_id LIKE '%category%' AND product_name LIKE '%searchWord%'";
		}
		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setId(rs.getInt("id"));
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setProduct_name_kana(rs.getString("product_name_kana"));
				dto.setProduct_description(rs.getString("product_description"));
				dto.setCategory_id(rs.getInt("category_id"));
				dto.setProduct_stock(rs.getInt("product_stock"));
				dto.setPrice(rs.getInt("price"));
				dto.setImage_file_path(rs.getString("image_file_path"));
				dto.setImage_file_name(rs.getString("image_file_name"));
				dto.setRelease_date(rs.getString("release_date"));
				dto.setRelease_company(rs.getString("release_company"));
				dto.setStatus(rs.getInt("status"));
				dto.setRegist_date(rs.getString("regist_date"));
				dto.setUpdate_date(rs.getString("update_date"));
				searchDTOList.add(dto);

			}

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
