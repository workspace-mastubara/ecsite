<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>BuyItem画面</title>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<P>BuyItem</P>
		</div>

		<div>
			<s:if test="message != null">
				<s:property value="message" />
			</s:if>

			<s:form action="BuyItemAction">
				<table>
					<tr>
						<td><span>商品名</span></td>
						<td><s:property value="session.buyItem_name" /><br></td>
					</tr>

					<tr>
						<td><span>値段</span></td>
						<td><s:property value="session.buyItem_price" /> <span>円</span>
						</td>
					</tr>

					<tr>
						<td><span>購入個数</span></td>
						<td><select name="count">
								<%
									for (int i = 1; i <= 50; i++) {
								%>
								<option>
									<%=i + "<br>"%>
								</option>
								<%
									}
								%>
						</select></td>
					</tr>

					<tr>
						<td><span>支払い方法</span></td>
						<td><input type="radio" name="pay" value="1"
							checked="checked">現金 <input type="radio" name="pay"
							value="2">クレジットカード</td>
					</tr>

					<tr>
						<td><s:submit value="購入" /></td>
					</tr>
				</table>
			</s:form>

			<div>
				<p>
					前画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a>
				</p>
				<p>
					マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a>
				</p>
			</div>
		</div>
	</div>

	<div id="footer"></div>

</body>
</html>