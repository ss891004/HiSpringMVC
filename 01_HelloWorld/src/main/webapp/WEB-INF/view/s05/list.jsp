<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>用户列表</title>
</head>
<body>
<div style="text-align: center">
<table border="1" cellpadding="10" cellspacing="0">
    <tr>
        <th width="50">id</th>
        <th width="100">name</th>
        <th width="50">age</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr align="center">
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>