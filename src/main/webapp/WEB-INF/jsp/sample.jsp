<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Hello</title>
</head>
<body>
	<p>I'm VuDev</p>
	<ul>
		<c:forEach items="${pres}" var="pre">
			<li><c:out value="${pre.name}"/></li>
		</c:forEach>
	</ul>
</body>
</html>
