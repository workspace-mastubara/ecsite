<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>itemList</title>
</head>
<body>
	<table>
		<tbody>

			<tr>
				<th>ID</th>
				<th>商品名</th>
				<th>値段</th>
				<th>在庫</th>
				<th>詳細</th>
			</tr>

			<s:iterator value="dtoList">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="itemName" /></td>
					<td><s:property value="itemPrice" /></td>
					<td><s:property value="itemStock" /></td>
					<td><a
						href='<s:url action="ItemDetailsAction">
					<s:param name="id" value="%{id}"/></s:url>'>詳細</a>
					</td>
				</tr>
			</s:iterator>

		</tbody>
	</table>

	<s:form action="ItemListDeleteConfirmAction">
		<input type="hidden" name="deleteFlg" value="1">
		<s:submit value="削除" />
	</s:form>

</body>
</html>