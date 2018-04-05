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
		<s:submit value="削除"/>
	</s:form>

<!-- 	ログインしているかいないかで分岐 -->
	<s:if test="session.loginFlg == false">
	</s:if>
	<s:form action="決済アクションへ">
		<p>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
		<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		<s:submit value="決済"/>
	</s:form>
	<s:if test="session.loginFlg == false">
		<s:form action ="GoLoginAction" theme="simple">
			<div class="settlement_btn">
				<s:submit value="ログイン" id="set_c"/>
			</div>
		</s:form>
	</s:if>
	<s:else>
		<s:if test="! cartList.isEmpty()">
			<s:form action="SettlementConfirmAction" theme="simple">
			   <s:hidden name="token" value="%{token}" />
				<div class="settlement_btn">
					<s:submit id="set_b" value="決算画面へ" />
				</div>
			</s:form>
		</s:if>
	</s:else>
</body>
</html>