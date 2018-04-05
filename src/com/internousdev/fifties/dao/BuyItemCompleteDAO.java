package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.fifties.dto.CartInfoDTO;
import com.internousdev.fifties.util.DBConnector;
/*
 * 決済ボタンを押した後のアクション
 * @auther 妹尾
 */

public class BuyItemCompleteDAO {
	/*
	 * カート内情報を取得しCartInfoDTOにsetするメソッド
	 */
	public ArrayList<CartInfoDTO> getCartInfo(String userId)throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection= dbConnector.getConnection();
		ArrayList<CartInfoDTO> cartInfoDTOList=new ArrayList<CartInfoDTO>();

		 //↓cart_info,product_info内の共通product_idで２つのテーブルを結合
		String sql="SELECT*FROM cart_info as ci  LEFT OUTER JOIN product_info as pi ON ci.product_id=pi.product_id WHERE user_id=?";

		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				CartInfoDTO dto=new CartInfoDTO();
				dto.setProductId(rs.getInt("product_id"));
				dto.setUserId(rs.getString("user_id"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setStock(rs.getInt("stock"));
				dto.setPrice(rs.getInt("price"));


				cartInfoDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return cartInfoDTOList;



	}

	/*
	 * カートテーブルを購入履歴テーブルに登録
	 *
	 */
	public int setPurchseHistory(List<CartInfoDTO> cartList) throws SQLException{
		DBConnector db= new DBConnector();
		Connection con = db.getConnection();
		int ret =0;

		//for文でカート情報の商品件数ぶん商品情報を商品購入履歴に登録する。その件数処理数がretに入る

		try{
			for(int i=0; i<cartList.size(); i++){
				String sql="INSERT INTO purchase_history_info(user_id,product_id,product_count,price,insert_date,update_date)VALUES(?,?,?,?,NOW(),NOW())";
				PreparedStatement ps=con.prepareStatement(sql);

				ps.setString(1, cartList.get(i).getUserId());
				ps.setInt(2, cartList.get(i).getPrice());
				ps.setInt(3, cartList.get(i).getProductId());
				ps.setInt(4, cartList.get(i).getProductCount());

				ret += ps.executeUpdate();

			}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				con.close();
			}
			return ret;
		}

	/*
	 * 購入履歴テーブルに登録後カートテーブル内の情報を削除
	 */

	public
	}


