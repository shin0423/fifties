<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<title>検索結果</title>
</head>
<body>
	<div id="header">
		<span>カテゴリー</span>
		<s:form action="PriductSearchAction">
			<select name="category">
			<option value=1>車1</option>
			<option value=2>車2</option>
			<option value=3>車3</option>
			<option value=4>車4</option>
				<!-- DBからカテゴリ名を取得（あるだけ） -->

			</select>
			<!-- 仮名称:searchWord-->
			<s:textfield name="searchWord">
			</s:textfield>
			<s:submit value="検索" />

		</s:form>

	</div>
</body>
</html>