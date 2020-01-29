<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADMIN</title>
</head>
<body>
	商品
		<s:form action="ItemCreateAction">
			<s:submit value="新規登録"/>
		</s:form>
		<s:form action="ItemListAction">
			<s:submit value="一覧"/>
		</s:form>
	ユーザー<br>
		<s:form action="UserCreateAction">
			<s:submit value="新規登録"/>
		</s:form>
		<s:form action="UserListAction">
			<s:submit value="一覧"/>
		</s:form>
</body>
</html>