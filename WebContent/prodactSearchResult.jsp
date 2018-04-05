<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>検索結果</title>
</head>
<body>
	<div id="header">
		<span>カテゴリー</span>
		<s:form action="PriductSearchAction">
			<select name="category">
			<option value=0>全てのカテゴリー</option>
			<option value=1>車</option>
			<option value=2>音楽・映画</option>
			<option value=3>家電</option>

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