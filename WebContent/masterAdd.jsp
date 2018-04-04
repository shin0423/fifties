<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<title>管理画面</title>
<style type="text/css">
</style>
<script type="text/Javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>
</head>
<body>
<h3 class="message">メニュー追加画面</h3>
<fieldset>
		<div class="instruction">
			<p>追加したい商品情報を入力してください。</p>
		</div>

		<tr>
			<s:iterator value="errorMessageList">
				<td><span style="color: red"><s:property /><br></span></td>
			</s:iterator>
		</tr>
		<div class="main">
			<table>
				<s:form action="MasterAddConfirmAction" method="post"
					enctype="multipart/form-data">
					<tr>
						<td><label>商品名:</label></td>
						<td><input type="text" name="productName" value=""
							placeholder="20文字以下で入力" /></td>
					</tr>

					<tr>
						<td><label>商品名(ひらがな):</label></td>
						<td><input type="text" name="productKanaName" value=""
							placeholder="30文字以下で入力" /></td>
					</tr>

					<tr>
						<td><label>価格:</label></td>
						<td><input type="text" name="price" value=""
							placeholder="半角数字" /></td>
					</tr>
					<tr>
						<td><label>個数:</label></td>
						<td><select name="productStock">
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>

						</select></td>
					</tr>

					<!-- 商品画像 -->
					<tr>
						<td>画像:</td>
						<td><s:select name="imageName" id="image_bname"
								list="imageFileNames" /></td>
					</tr>

					<input type="submit" value="登録">

					<!-- 登録ボタン -->
					<tr>
						<td colspan="2">
							<div class="image">
								su
							</div>
						</td>

					</tr>

				</s:form>
			</table>

			<!-- 戻るボタン -->
			<a href='<s:url action="MMasterAction"/>'>◀
				管理者画面に戻る</a>
		</div>
	</fieldset>


</body>
</html>

</body>
</html>