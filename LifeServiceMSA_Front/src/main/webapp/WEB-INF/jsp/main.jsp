<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>기획전 선택하기</title>
</head>
<body>
 현재 진행중인 기획전 목록<br><br>
 <table border="1">
	<th>기획전 아이디</th>
	<th>기획전 명</th>
	<th>기획전 시작일</th>
	<th>기획전 종료일</th>
	<c:forEach items="${pnshop_list}" var="pnshop">
		<tr><td>${pnshop.pnshop_id}</td>
		<td><a href='${contextPath}/show?pnshopid=${pnshop.pnshop_id}'>${pnshop.pnshop_nm}</a></td>
		<td>${pnshop.pnshop_strt_dts}</td>
		<td>${pnshop.pnshop_end_dts}</td>
	</c:forEach>
</table>
</body>
</html>

