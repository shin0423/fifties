package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.internousdev.fifties.util.DBConnector;
import com.internousdev.fifties.util.DateUtil;


public class InquiryCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql="insert into inquiry(name,email,inquiry_type,inquiry_body,insert_date datetime) values(?,?,?,?,?)";

	public void insertInquiry(String name, String email, String qtype, String body)throws SQLException{
		try{PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, qtype);
			ps.setString(4, body);
			ps.setString(5, dateUtil.getDate());
			ps.executeQuery();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
