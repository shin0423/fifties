<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<title></title>
</head>
<body>
	<s:form action="CartDeleteAction">
		<s:iterator value="cartList">
			<table>
				<tr>
				</tr>
			</table>
		</s:iterator>
	</s:form>
	<s:if test="session.loginFlg == true">
		<s:form action="BuyItemConfirmAction" theme="simple">
			<s:submit value="決済"/>
		</s:form>
	</s:if>
	<s:else>
		<s:form action ="GoLoginAction" theme="simple">
			<div>
				<s:submit value="ログイン"/>
			</div>
		</s:form>
	</s:else>
</body>
</html>