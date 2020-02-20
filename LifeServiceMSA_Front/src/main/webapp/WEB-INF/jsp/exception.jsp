<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<link rel="stylesheet" href="resources/css/Style.css">
		<title>문제발생!</title>
	</head>
	<body>
		<br><h2>문제가 발생했습니다</h2><br>
		<span style="color:#cd3c3c">에러 메세지 : ${error_msg}</span><br>
		<a href='${contextPath}/main'>메인 화면으로 이동하기</a>
	</body>
</html>