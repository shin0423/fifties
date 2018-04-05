<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8" />

<title>新規ユーザー登録</title>
<link rel="stylesheet" type="text/css" href="css/form.css">
</head>


<body id="form-body">

	<div id="form-user-main" class="form-back">
		<h2 class="form-top">新規ユーザー登録</h2>
		<s:form class="form-table" id="form" name="form" action="UserCreateConfirmAction">
			<table>
				<tr>
					<th><h4 class="form-text">※全て必須項目</h4></th>
				</tr>

				<!-- ユーザーID -->
				<tr>
					<th><label>ユーザーID：</label></th>
					<td><input type="text" name="userId" class="form-form"
						oncopy="return false" onpaste="return false" placeholder=" 半角英数字"
						maxlength="8" value='<s:property value="userId"/>' /><span>※8文字以内</span></td>
				</tr>
				<s:if test="errorId!=null">
					<tr>
						<td colspan="3"><p class="form-text form-link">
								<s:property value="errorId" />
							</p>
						<td>
					</tr>
				</s:if>
				<tr>
					<th></th>
					<td></td>
				</tr>

				<!-- パスワード -->
				<tr>
					<th><label>パスワード：</label></th>
					<td><input class="form-form" type="password" name="password"
						oncopy="return false" onpaste="return false" placeholder=" 半角英数字"
						maxlength="16" /><span>※16文字以内</span></td>
				</tr>
				<s:if test="errorPass!=null">
					<tr>
						<td colspan="3"><p class="form-text form-link">
								<s:property value="errorPass" />
							</p></td>
					</tr>
				</s:if>
				<tr>
					<th></th>
					<td></td>
				</tr>

				<!-- 名前（姓・名） -->
				<tr>
					<th><label>お名前（姓）：</label></th>
					<td><input class="form-form" type="text" name="familyName"
						placeholder=" 漢字,ひらがな,半角英字"
						value='<s:property value="familyName"/>' /><span>※16文字以内</span></td>
				</tr>
				<tr>
					<th><label>お名前（名）：</label></th>
					<td><input class="form-form" type="text" name="firstName"
						placeholder=" 漢字,ひらがな,半角英字"
						value='<s:property value="firstName"/>' /><span>※16文字以内</span></td>
				</tr>
				<s:if test="errorName!=null">
					<tr>
						<td colspan="3"><p class="form-text form-link">
								<s:property value="errorName" />
							</p></td>
					</tr>
				</s:if>
				<tr>
					<th></th>
					<td></td>
				</tr>

				<!-- なまえ（せい・めい） -->
				<tr>
					<th><label>ふりがな（せい）：</label></th>
					<td><input class="form-form" type="text" name="familyNameKana"
						placeholder=" ひらがな" value='<s:property value="familyNameKana"/>' /><span>※16文字以内</span></td>
				</tr>
				<tr>
					<th><label>ふりがな（めい）：</label></th>
					<td><input class="form-form" type="text" name="firstNameKana"
						placeholder=" ひらがな" value='<s:property value="firstNameKana"/>' /><span>※16文字以内</span></td>
				</tr>
				<s:if test="errorNameKana!=null">
					<tr>
						<td colspan="3"><p class="form-text form-link">
								<s:property value="errorNameKana" />
							</p></td>
					</tr>
				</s:if>
				<tr>
					<th></th>
					<td></td>
				</tr>

				<!-- 性別  s:if test="sex==0" にすると null になり else になるから sex==1 にしている。  -->
				<tr>
					<s:if test="sex == 1">
						<th><label>性別 (<span class="form-text">選択</span>)：
						</label></th>
						<td><input type="radio" name="sex" value='0' />男 <input
							type="radio" name="sex" value='1' checked="checked" />女</td>
					</s:if>
					<s:else>
						<th><label>性別 (<span class="form-text">選択</span>)：
						</label></th>
						<td><input type="radio" name="sex" value='0'
							checked="checked" />男 <input type="radio" name="sex" value='1' />女
						</td>
					</s:else>
				</tr>
				<tr>
					<th></th>
					<td></td>
				</tr>

				<!-- メールアドレス -->
				<tr>
					<th><label>メールアドレス：</label></th>
					<td colspan="3"><input class="form-form" type="text"
						name="email" placeholder=" 半角英数字,記号" maxlength="32"
						value='<s:property value="email"/>' /><span>※14文字～32文字</span></td>
				</tr>
				<s:if test="errorEmail!=null">
					<tr>
						<td colspan="3"><p class="form-text form-link">
								<s:property value="errorEmail" />
							</p></td>
					</tr>
				</s:if>
				<tr>
					<th></th>
					<td></td>
				</tr>

				<!-- 秘密の質問 -->
				<tr>
					<s:if test="question=='尊敬する人物は？'">
						<th><label>秘密の質問 （<span class="form-text">選択</span>）：
						</label></th>
						<td><select class="form-form" name="question">
								<option value="嫌いな食べ物は？">嫌いな食べ物は？</option>
								<option value="尊敬する人物は？" selected="selected">尊敬する人物は？</option>
								<option value="初めて飼ったペットの名前は？">初めて飼ったペットの名前は？</option>
						</select></td>
					</s:if>
					<s:elseif test="question=='初めて飼ったペットの名前は？'">
						<th><label>秘密の質問 （<span class="form-text">選択</span>）：
						</label></th>
						<td><select class="form-form" name="question">
								<option value="嫌いな食べ物は？">嫌いな食べ物は？</option>
								<option value="尊敬する人物は？">尊敬する人物は？</option>
								<option value="初めて飼ったペットの名前は？" selected="selected">初めて飼ったペットの名前は？</option>
						</select></td>
					</s:elseif>
					<s:else>
						<th><label>秘密の質問 (<span class="form-text">選択</span>)：
						</label></th>
						<td><select class="form-form" name="question">
								<option value="嫌いな食べ物は？" selected="selected">嫌いな食べ物は？</option>
								<option value="尊敬する人物は？">尊敬する人物は？</option>
								<option value="初めて飼ったペットの名前は？">初めて飼ったペットの名前は？</option>
						</select></td>
					</s:else>
				</tr>
				<tr>
					<th></th>
					<td></td>
				</tr>

				<!-- 質問の答え -->
				<tr>
					<th><label>質問の答え：</label><br></th>
					<td><input class="form-form" type="text" name="answer"
						placeholder=" 答えを入力" value='<s:property value="answer"/>' /></td>
				</tr>
				<s:if test="errorAnswer!=null">
					<tr>
						<td colspan="3"><p class="form-text form-link">
								<s:property value="errorAnswer" />
							</p></td>
					</tr>
				</s:if>
				<tr>
					<th></th>
					<td></td>
				</tr>
			</table>
			<br>
			<br>
			<div class="form-user-button form-reverse">
				<s:submit class="form-btn" value="確認画面へ"
					onclick="goUserCreateConfirmAction();" />
				<s:submit class="form-btn" value="戻る" onclick="goGoLoginAction();" />
			</div>
		</s:form>
	</div>

</body>
</html>