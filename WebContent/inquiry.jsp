<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inquiry</title>
</head>
<body>
	<%--データベース内容：
			名前 name
			メールアドレス email
			問合せタイプ inquiry_type
			問い合わせボディ inquiry_body

		(insert時に自動追加される)
			投稿日時 insert_data
	--%>

	<h3>お問合わせフォーム</h3>
	<s:form method="post" action="InquiryConfirmAction">

		お名前:
		<input type="text" name="inquiryName" value="" />

		メールアドレス:
		<input type="text" name="inquiryEmail" value="" size="35" />

		お問合わせの種類:
		<select name="ptype">
			<option value="notSelect">選択してください</option>
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">アフターサポートについて</option>
			<option value="other">その他お問合わせ</option>
		</select>

		お問い合わせ内容:
		<s:textarea name="inquiryBody" />
		<s:submit value="確認へ" />
	</s:form>

	ホームに戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>
</body>
</html>