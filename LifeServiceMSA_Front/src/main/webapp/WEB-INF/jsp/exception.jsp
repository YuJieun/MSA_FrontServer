<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>에러발생!</title>
</head>
<body>
예외페이지입니다.<br>
<br>
에러 메세지 : ${error_msg}<br>
<a href='${contextPath}/main'>처음 페이지로 이동하기</a>
</body>
</html>