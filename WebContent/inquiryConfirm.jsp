<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InquiryConfirm</title>
</head>
<body>
	<h3>送信する内容は以下でよろしいでしょうか？</h3>

	<s:form action="InquiryCompleteAction">
		お名前:
		<s:property value="name" escape="false"/>

		メールアドレス:
		<s:property value="email" escape="false" />

		お問合わせの種類:
		<s:if test='qtype="company"'>会社について</s:if>
		<s:if test='qtype="product"'>製品について<</s:if>
		<s:if test='qtype="support"'>アフターサポートについて</s:if>
		<s:if test='qtype="other"'>その他お問合わせ</s:if>

		お問い合わせ内容:
		<s:property value="body" escape="false" />

		<s:submit value="送信する" />
	</s:form>

		戻って編集する
		ホーム画面にもどる
</body>
</html>