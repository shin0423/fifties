<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1>ホーム画面</h1>
<p>ログイン画面は<a href='<s:url action="GoLoginAction"/>'>こちら</a></p>
<p>カートは<a href='<s:url action="CartAction"/>'>こちら</a></p>
<p>お問合わせはは<a href='<s:url action="InquiryAction"/>'>こちら</a></p>
<p><a href='<s:url action="MasterAction"/>'>管理者</a></p>*たつや消します！！
</body>
</html>