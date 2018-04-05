//@中嶋

package com.internousdev.fifties.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.fifties.dao.ProductSearchDAO;
import com.internousdev.fifties.dto.ProductDTO;

public class ProductSearchAction {
	/*
	 * private String category ; private String searchWord; private String
	 * searchMessage;
	 */
	// 検索結果の詳細をリストに格納
	private ProductSearchDAO searchDAO = new ProductSearchDAO();
	private List<ProductDTO> searchList = new ArrayList<ProductDTO>();

	/*
	 * 検索結果を１ページに９個ごと表示させたい private ArrayList<ArrayList<ProductDTO>> mainList =
	 * new ArrayList(); private int pageCount;
	 *
	 * private List<Integer> pageList = new ArrayList<>(); public String
	 * execute() throws SQLException { searchList =
	 * ProductSearchDAO.getItemInfo(searchWord, category); }
	 */

	// 検索がHitしない場合検索結果が存在しないと表記
	// 検索ワードを検索後もインプットBOXに出力
	public ProductSearchDAO getSearchDAO() {
		return searchDAO;
	}

	public void setSearchDAO(ProductSearchDAO searchDAO) {
		this.searchDAO = searchDAO;
	}

	public List<ProductDTO> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<ProductDTO> searchList) {
		this.searchList = searchList;
	}
}
