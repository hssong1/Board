<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
    <table border="1">
    <tr>
        <th>글번호</th>
        <th>작성자</th>
    </tr>
    <c:forEach items="${list}" var="data">
    <tr>
        <td>${data.id}</td>
        <td>${data.name}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>