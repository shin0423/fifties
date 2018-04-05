<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- ホーム画面に5病後に遷移する content="秒数" -->
<meta http-equiv="refresh" content="5;URL=GoHomeAction">

<title>登録完了画面</title>
<link rel="stylesheet" type="text/css" href="css/form.css">
</head>

<body id="form-body">

	<div id="form-user-main-3" class="form-back">
		<h2 class="form-top">新規ユーザー登録 ＞ 登録完了</h2>
		<div class="form-link">
			<h2>ご登録ありがとうございました。</h2>
			<p>5秒後に自動的にホーム画面へ遷移します。</p>
			<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
			<a href='<s:url action="GoHomeAction" />'>ホーム画面へ</a>
		</div>
	</div>

</body>
</html>