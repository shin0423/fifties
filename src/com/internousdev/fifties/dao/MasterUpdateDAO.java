package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.fifties.util.DBConnector;

public class MasterUpdateDAO {
	private DBConnector dbConnector=new DBConnector();

	private Connection connection=dbConnector.getConnection();

	private String sql="UPDATE product_info SET product_stock = ? WHERE id = ?";

	public void itemInfo(int countControl,int product_id) throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, countControl);
			preparedStatement.setInt(2, product_id);

			preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}


