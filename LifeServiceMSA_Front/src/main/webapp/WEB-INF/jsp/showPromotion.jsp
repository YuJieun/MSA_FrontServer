<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
프로모션 리스트<br><br>
<table border="1">
	<th>프로모션 아이디</th>
	<th>프로모션 명</th>
	<th>오퍼 목록</th>
	<th>할인 값</th>
	<c:forEach items="${promotion_list}" var="prom">
		<tr><td>${prom.promId}</td><td>${prom.promNM}</td><td>
		<c:forEach items="${prom.offers}" var="offer">
			${offer.offerNM}<br>
		</c:forEach>
		</td><td>
		<c:forEach items="${prom.offers}" var="offer">
			${offer.discountValue}
			<c:if test="${offer.offerTypeCd eq '100'}">%</c:if>
			<c:if test="${offer.offerTypeCd eq '200'}">원</c:if>
			<br>
		</c:forEach>
		</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>