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
	<div id="header">
		<fieldset>
		<legend>
		<h3>在庫数 変更方法</h3>
		</legend>
		<p>一度に変更できる個数は、在庫数±20個です。<br>
		</fieldset>
		</div>


	<div id="main">
		<div id="top">
			<p>master</p>
		</div>

		<div>
			<div>
				<a href='<s:url action="MasterAddConfirmAction"/>'>新商品追加</a>

			</div>
				<table>
					<s:iterator value="productList">
			<s:form action="MasterUpdateAction">
						<tr>
							<td>
								<h3><s:property value="itemName"/></h3>
							</td>
						</tr>

						<tr>
							<td>
								<span>在庫</span>
							</td>
							<td>
								<s:property value="item_stock"/>
							</td>
						</tr>

						<tr>
							<td>
								<span>商品在庫追加</span>
							</td>
							<td>
								<select name="item_stock">
									<option value="0" selected="selected">0</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
								</select>
							</td>
						</tr>
					<tr><td>
					<input type="submit" value="在庫を変更する">

						<tr>
							<td>
								<s:submit value="追加"/>
							</td>
						</tr>
			</s:form>
					</s:iterator>
				</table>

			<div>
				<p><a href='<s:url action="GoHomeAction" />'>home</a></p>
			</div>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>


</body>
</html>