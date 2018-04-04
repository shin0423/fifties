package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.fifties.dto.CartInfoDTO;
import com.internousdev.fifties.util.DBConnector;


public class CartInfoDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();




	public ArrayList<CartInfoDTO> showUserCartList(String userId)

		String sql="";

		try {
			con = dbConnector.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()) {
				CartInfoDTO dto=new CartInfoDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemNameKana(rs.getString("item_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setItemCount(rs.getInt("item_count"));
				dto.setTotal(rs.getInt("item_count")*(rs.getInt("price")));
				cartList.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return cartList;
	}

public ArrayList<CartInfoDTO> tempUserCartList(String userId)

}
