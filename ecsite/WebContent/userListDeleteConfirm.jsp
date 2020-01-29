<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>userListDeleteConfirm</title>
</head>
<body>
	<s:if test="message != null">
		<s:property value="message" />
	</s:if>

	<s:form action="UserListDeleteCompleteAction">
		<input type="hidden" name="deleteFlg"
			value='<s:property value="session.deleteFlg"/>'>
		<s:submit value="ＯＫ" />
	</s:form>

	<s:form action="UserListAction">
		<s:submit value="キャンセル" />
	</s:form>
</body>
</html>
