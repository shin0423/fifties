<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>入力情報確認画面</title>

<link rel="stylesheet" type="text/css" href="css/form.css">
</head>


<body id="form-body">

	<div id="form-user-main-2" class="form-back">
		<h2 class="form-top">新規ユーザー登録 ＞ 入力確認</h2>
		<div>
			<h3 class="form-link">登録する内容は以下でよろしいですか？</h3>
			<s:form class="form-table" id="form" name="form"
				action="UserCreateCompleteAction">
				<table>
					<tr>
						<th><label>ユーザーID：</label></th>
						<td><s:property value="userId" escape="false" /> <input
							type="hidden" name="userId" value='<s:property value="userId"/>'></td>
					</tr>
					<tr>
						<th><label>パスワード：</label></th>
						<td colspan="3"><s:property value="passCon" escape="false" />
							<input type="hidden" name="password"
							value='<s:property value="password"/>'></td>
					</tr>
					<tr>
						<th><label>姓：</label></th>
						<td><s:property value="familyName" escape="false" /> <input
							type="hidden" name="familyName"
							value='<s:property value="familyName"/>'></td>
						<th><label>名：</label></th>
						<td><s:property value="firstName" escape="false" /> <input
							type="hidden" name="firstName"
							value='<s:property value="firstName"/>'></td>
					</tr>
					<tr>
						<th><label>せい：</label></th>
						<td><s:property value="familyNameKana" escape="false" /> <input
							type="hidden" name="familyNameKana"
							value='<s:property value="familyNameKana"/>'></td>
						<th><label>めい：</label></th>
						<td><s:property value="firstNameKana" escape="false" /> <input
							type="hidden" name="firstNameKana"
							value='<s:property value="firstNameKana"/>'></td>
					</tr>
					<tr>
						<th><label>性別：</label></th>
						<td><s:if test="sex==0">男</s:if> <s:if test="sex==1">女</s:if>
							<input type="hidden" name="sex" value='<s:property value="sex"/>'></td>
					</tr>
					<tr>
						<th><label>メールアドレス：</label></th>
						<td colspan="3"><s:property value="email" escape="false" />
							<input type="hidden" name="email"
							value='<s:property value="email"/>'></td>
					</tr>
					<tr>
						<th><label>秘密の質問：</label></th>
						<td colspan="3"><s:property value="question" escape="false" />
							<input type="hidden" name="question"
							value='<s:property value="question"/>'></td>
					</tr>
					<tr>
						<th><label>質問の答え：</label></th>
						<td colspan="3"><s:property value="answer" escape="false" />
							<input type="hidden" name="answer"
							value='<s:property value="answer"/>'></td>
					</tr>
				</table>
				<input type="hidden" name="token"
					value='<s:property value="token"/>'>
				<br>
				<br>
				<div class="form-user-button">
					<s:submit class="form-btn" value="訂正"
						onclick="goUserCreateBackAction();" />
					<s:submit class="form-btn" value="登録"
						onclick="goUserCreateCompleteAction();" />
				</div>
			</s:form>
		</div>
	</div>

</body>
</html>