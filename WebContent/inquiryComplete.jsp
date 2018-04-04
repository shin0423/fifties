<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<title>InquiryComplete</title>

<%--ここのjsまったくわからない --%>
<script type="text/javascript">
	waitTimer = 3;
	<s:url action="GoHomeAction" />
		function jumpPage() {
		  location.href = url;
		}
		setTimeout("jumpPage()",waitTimer*1000)
</script>
<%--ここまで --%>

</head>
<body>
	<h3>お問合わせ有難うございました。<br>
		3秒後に
		<a href='<s:url action="GoHomeAction" />'>ホーム</a>
		に戻ります。</h3>

</body>
</html>