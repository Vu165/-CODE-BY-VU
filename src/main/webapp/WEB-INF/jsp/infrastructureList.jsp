<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td.sunday{
color = red;
}
</style>
</head>
<body>
<h1>検索結果</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>名前</th>
			<th>登録日</th>
			<th>曜日</th>
		</tr>
		<c:forEach items="${infrasList}" var="prefecture">
			<tr>
				<td><c:out value="${infrasList.ID}" /></td>
				<td><c:out value="${infrasList.name}" /></td>
				<td><fmt:formatDate pattern="yyyy年MM月dd日" value="${infrasList.registDate}"/></td>
				<fmt:formatDate var="day" pattern="E" value="${infrasList.registDate}"/>
				<td><c:if test="${day=='日'}">class="sunday"</c:if>/>${day}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>