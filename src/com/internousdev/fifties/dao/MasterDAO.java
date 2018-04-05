package com.internousdev.fifties.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.fifties.dto.ProductDTO;
import com.internousdev.fifties.util.DBConnector;

public class MasterDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public ArrayList<ProductDTO> getProductInfo() throws SQLException{

			ArrayList<ProductDTO> productDTOList=new ArrayList<ProductDTO>();

			String sql="SELECT id ,product_id ,product_name ,product_name_kana ,product_description,category_id,product_stock,price,image_file_path,image_file_name ,release_company FROM product_info";
			try{
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				ResultSet resultSet=preparedStatement.executeQuery();

				while(resultSet.next()){
					ProductDTO dto=new ProductDTO();
					dto.setId(resultSet.getInt("id"));
					dto.setProduct_id(resultSet.getInt("product_id"));
					dto.setProduct_name(resultSet.getString("product_name"));
					dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
					dto.setProduct_description(resultSet.getString("product_description"));
					dto.setCategory_id(resultSet.getInt("category_id"));
					dto.setProduct_stock(resultSet.getInt("product_stock"));
					dto.setPrice(resultSet.getInt("price"));
					dto.setImage_file_path(resultSet.getString("image_file_path"));
					dto.setImage_file_name(resultSet.getString("image_file_name"));
					dto.setRelease_company(resultSet.getString("release_company"));
					productDTOList.add(dto);
				}


			}catch(Exception e){
				e.printStackTrace();
			}
			return productDTOList;

			}
			}

