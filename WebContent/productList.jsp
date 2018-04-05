<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<title>商品一覧画面</title>
</head>
<body>
<!-- ヘッダー -->
<!-- メイン -->
<h3>商品一覧</h3>

<s:iterator value="searchList">

<dl>
<dt><img src="<s:property value= 'image_file_path'/>"></dt>

<dd><s:property value="product_name"/></dd>

<dd><s:property value="price"/>円</dd>

<dd><s:property value="product_stock"/>個</dd>
</dl>
</s:iterator>

<!-- フッター -->
</body>
</html>