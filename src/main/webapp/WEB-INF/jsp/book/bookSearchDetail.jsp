<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Result</title>
</head>
<body>
	<h1>ID:${param.bookID}の検索結果</h1>
	<dl>
		<dt>ID</dt>
		<dd>
			<c:out value="${book.bookID}" />
		</dd>
		<dt>Book name</dt>
		<dd>
			<c:out value="${book.bookName}" />
		</dd>
		<dt>Price</dt>
		<dd>
			<fmt:formatNumber maxFractionDigits="3" value="${book.Price}" />
		</dd>
	</dl>
</body>
</html>