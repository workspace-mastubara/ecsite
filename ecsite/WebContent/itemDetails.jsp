<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>itemDetails</title>
</head>
<body>

	<s:if test="dto != null">
		<table>
			<tbody>
				<tr>
					<th>ID</th>
					<th>ITEM NAME</th>
					<th>ITEM PRICE</th>
					<th>ITEM STOCK</th>
					<th>INSERT DATE</th>
					<th>UPDATE DATE</th>
				</tr>
				<tr>
					<td><s:property value="dto.id" /></td>
					<td><s:property value="dto.itemName" /></td>
					<td><s:property value="dto.itemPrice" /></td>
					<td><s:property value="dto.itemStock" /></td>
					<td><s:property value="dto.insertDate" /></td>
					<td><s:property value="dto.updatedDate" /></td>
				</tr>

				<s:form action="ItemDeleteConfirmAction">
					<s:submit value="削除" />
				</s:form>

			</tbody>
		</table>
	</s:if>

</body>
</html>