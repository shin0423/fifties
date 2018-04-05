package com.internousdev.fifties.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.fifties.dao.ProductSearchDAO;
import com.internousdev.fifties.dto.ProductDTO;


public class ProductSearchAction {
	private int category = 0;
	private String searchWord;
	private String searchMessage;

	private ProductSearchDAO searchDAO = new ProductSearchDAO();
	private List searchDTOList = new ArrayList<ProductDTO>();
	private ArrayList<ArrayList<ProductDTO>>  mainList = new ArrayList();

}
