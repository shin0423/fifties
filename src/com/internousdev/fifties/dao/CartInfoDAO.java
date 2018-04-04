package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.fifties.dto.CartInfoDTO;
import com.internousdev.fifties.util.DBConnector;


public class CartInfoDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();


	//ログインユーザーのカート情報を取得
	public ArrayList<CartInfoDTO> getUserCartList(String userId){
		ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();

		String sql = "SELECT pi.product_stock as product_stock, "
				+ "ci.id as cartId,"
				+ "ci.product_id as product_id, "
				+ "pi.product_name as product_name, "
				+ "pi.product_name_kana as product_name_kana, "
				+ "pi.image_file_path as image_file_path, "
				+ "pi.price as price, "
				+ "ci.product_count as product_count, "
				+ "pi.release_company as release_company, "
				+ "pi.release_date as release_date, "
				+ "ci.total_price as total_price "
				+ "FROM cart_info as ci LEFT JOIN product_info as pi ON ci.product_id = pi.product_id WHERE ci.user_id = ?";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, userId);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				CartInfoDTO dto = new CartInfoDTO();
				dto.setStock(resultSet.getInt("product_stock"));
				dto.setCartId(resultSet.getInt("CartId"));
				dto.setProductId(resultSet.getInt("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setProductCount(resultSet.getInt("product_count"));
				dto.setReleaseCompany(resultSet.getString("release_company"));
				dto.setReleaseDate(resultSet.getString("release_date"));

				cartList.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cartList;
	}

	//仮ユーザーがログインに成功したときのカート取得の処理。


	//仮ユーザーのカート情報を取得
	public ArrayList<CartInfoDTO> getTempUserCartList(String tempUserId){
		ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();

		String sql = "SELECT pi.product_stock as product_stock, "
				+ "ci.id as cartId,"
				+ "ci.product_id as product_id, "
				+ "pi.product_name as product_name, "
				+ "pi.product_name_kana as product_name_kana, "
				+ "pi.image_file_path as image_file_path, "
				+ "pi.price as price, "
				+ "ci.product_count as product_count, "
				+ "pi.release_company as release_company, "
				+ "pi.release_date as release_date, "
				+ "ci.total_price as total_price "
				+ "FROM cart_info as ci LEFT JOIN product_info as pi ON ci.product_id = pi.product_id WHERE ci.temp_user_id = ?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, tempUserId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				CartInfoDTO dto = new CartInfoDTO();
				dto.setStock(resultSet.getInt("product_stock"));
				dto.setCartId(resultSet.getInt("CartId"));
				dto.setProductId(resultSet.getInt("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setProductCount(resultSet.getInt("product_count"));
				dto.setReleaseCompany(resultSet.getString("release_company"));
				dto.setReleaseDate(resultSet.getString("release_date"));
				cartList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cartList;
	}

	//ログインアクションで、仮ユーザーがログイン前にカートに商品を入れているか確認。
}
