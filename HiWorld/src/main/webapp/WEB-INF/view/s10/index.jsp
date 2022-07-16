<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head></head>
<body>
<div>
    <form method="post" action="${pageContext.request.contextPath}/s10_/login">
        姓名：<input name="name"/><br/>
        密码：<input name="pass"/><br/>
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html