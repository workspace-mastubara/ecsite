<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ItemCreate</title>
</head>
<body>
	<s:form action="ItemCreateConfirmAction">
		<s:textfield name="itemName" label="商品名" />
		<s:textfield name="itemPrice" label="値段　" />
		<s:textfield name="itemStock" label="個数　" />
		<s:submit value="登録" />
	</s:form>

</body>
</html>