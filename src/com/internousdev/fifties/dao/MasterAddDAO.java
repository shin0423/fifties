package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

public class MasterAddDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO product_info(product_name,product_name_kana,price,image_file_path,image_file_name,release_company,regist_date)VALUES(?,?,?,?,?,?,?)";

	public void buyItemeInfo(String product_name, String product_name_kana, int price, String image_file_path,
			String image_file_name, String relese_company) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, product_name);
			preparedStatement.setString(2, product_name_kana);
			preparedStatement.setInt(3, price);
			preparedStatement.setString(4, image_file_path);
			preparedStatement.setString(5, image_file_name);
			preparedStatement.setString(6, relese_company);
			preparedStatement.setString(7, dateUtil.getDate());
			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
