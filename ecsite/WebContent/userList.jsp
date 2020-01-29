<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>userList</title>
</head>
<body>
	<table>
		<tbody>

			<tr>
				<th>ID</th>
				<th>ログインID</th>
				<th>ユーザー名</th>
			</tr>

			<s:iterator value="dtoList">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="loginId" /></td>
					<td><s:property value="userName" /></td>
				</tr>
			</s:iterator>

		</tbody>
	</table>

	<s:form action="UserListDeleteConfirmAction">
		<input type="hidden" name="deleteFlg" value="1">
		<s:submit value="削除" />
	</s:form>

</body>
</html>