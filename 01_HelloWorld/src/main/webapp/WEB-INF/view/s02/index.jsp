<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接受请求中的参数</title>
</head>
<body>
<fieldset>
    <legend>接收Servlet中的参数</legend>
    <div>接收参数（HttpServletRequest/HttpServletResponse/HttpSession）</div>
    <div>
        <form method="post" action="receiveParam/test1.do">
            姓名：<input name="name" value="路人"/> <br/>
            年龄：<input name="age" value="30"/><br/>
            <input type="submit" value="提交">
        </form>
    </div>
</fieldset>


<fieldset>
    <legend>通过方法形参名称接收参数</legend>
<form method="post" action="receiveParam/test2.do">
    姓名：<input name="name" value="路人"/> <br/>
    年龄：<input name="age" value="30"/><br/>
    <input type="submit" value="提交">
</form>
</fieldset>


<fieldset>
    <legend>通过@RequestParam接收参数</legend>
<form method="post" action="receiveParam/test3.do">
    姓名：<input name="pname" value="路人"/> <br/>
    年龄：<input name="page" value="30"/><br/>
    <input type="submit" value="提交">
</form>
</fieldset>

<fieldset>
    <legend>通过1个对象接收参数</legend>
<form method="post" action="receiveParam/test4.do">
    姓名：<input name="name" value="路人"/> <br/>
    年龄：<input name="age" value="30"/><br/>
    <input type="submit" value="提交">
</form>
</fieldset>

<fieldset>
<legend>通过多个对象接收参数</legend>
<form method="post" action="receiveParam/test5.do">
    姓名：<input name="name" value="路人"/> <br/>
    年龄：<input name="age" value="30"/><br/>
    工作年限：<input name="workYears" value="10"/> <br/>
    年龄：<input name="workAddress" value="上海市"/><br/>
    <input type="submit" value="提交">
</form>
</fieldset>

<fieldset>
<legend>组合对象接收参数</legend>
<form method="post" action="receiveParam/test6.do">
    姓名：<input name="userInfo.name" value="路人"/> <br/>
    年龄：<input name="userInfo.age" value="30"/><br/>
    工作年限：<input name="workInfo.workYears" value="10"/> <br/>
    年龄：<input name="workInfo.workAddress" value="上海市"/><br/>
    第1份工作公司:<input name="experienceInfos[0].company" value="百度"/> <br/>
    第1份职位:<input name="experienceInfos[0].position" value="Java开发"/> <br/>
    第2份工作公司:<input name="experienceInfos[1].company" value="阿里"/> <br/>
    第2份职位:<input name="experienceInfos[1].position" value="Java资深开发"/> <br/>
    <input type="submit" value="提交">
</form>
</fieldset>

</body>
</html>