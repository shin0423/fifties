package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;

public class MasterUpdateDAO {
	private DBConnector dbConnector=new DBConnector();

	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();


	private String sql="UPDATE product_info SET product_stock = ? WHERE id = ?";

	public void productUpdateInfo(int product_stockl,int product_id,String update_date) throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, product_stockl);
			preparedStatement.setInt(2, product_id);
			preparedStatement.setString(3, dateUtil.getDate());

			preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}


