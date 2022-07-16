<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户增加</title>
</head>
<body>
<div style="text-align: center">
<h1>新增用户信息</h1>
<a href="/01_HelloWorld/s05/list.do">返回用户列表</a>
<form method="post" action="/01_HelloWorld/s05/add2.do">
用户id<input type="text" name="id"/><br>
姓名<input type="text" name="name"/><br>
年龄<input type="text" name="age"/><br>
<button type="submit">submit</button>
</form>
</div>
</body>
</html>