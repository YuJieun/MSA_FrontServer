<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<link rel="stylesheet" href="resources/css/Style.css">
		<title>상품 리스트</title>
	</head>
	<body>
		<br><h2>상품 리스트</h2><br><br>
		<table border="1">
			<th>상품 아이디</th>
			<th>상품 명</th>
			<th>상품 가격</th>
			<c:forEach items="${item_list}" var="item">
				<tr><td>${item.itemId}</td><td><a href='${contextPath}/prom?itemid=${item.itemId}'>${item.itemNM}</td></a><td>${item.fstSellPrc}</td></tr>
			</c:forEach>
		</table>
	</body>
</html>