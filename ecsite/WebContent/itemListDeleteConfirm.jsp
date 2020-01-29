<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>itemListDeleteConfirm</title>
</head>
<body>

	<s:if test="message != null">
		<s:property value="message"/><br><br>
	</s:if>

	<s:form action="ItemListDeleteCompleteAction">
		<input type="hidden" name="deleteFlg" value="1">
		<s:submit value="ＯＫ"/>
	</s:form>

	<s:form action="ItemListAction">
		<s:submit value="キャンセル"/>
	</s:form>

</body>
</html>