# HiSpringMVC
```text
echo "# HiSpringMVC" >> README.md
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/ss891004/HiSpringMVC.git
git push -u origin main
```


```text
1、Helloword
2、@Controller、@RequestMapping
3、如何接受请求中的参数？
4、@RequestBody接收Json格式数据
5、吃透文件上传
6、返回页面常见的5种方式
7、返回json格式数据 & 通用返回值设计
   SpringMVC返回null是什么意思？
    到目前我们主要掌握了3种类型的返回值，工作中基本上最常用的就是这3种方式，咱们要掌握好：
    第1种：返回视图，即页面，此时返回值可以是String（视图名称）、或者ModelAndView
    第2种：返回json格式数据，此时需要用到@ResponseBody注解
    第3种：方法返回值为void或者return null；此时需要我们在方法中自己通过HttpServletResponse对象来主动向客户端输出结果。
   异步处理请求
8、如何集成静态资源？
9、拦截器怎么用？
13、统一异常处理
14、实战篇：通用返回值 & 异常处理设计
15、全注解的方式 & 原理解析
16、源码解析SpringMVC处理请求的流程
17、源码解析SpringMVC容器的启动过程
18、RequestBodyAdvice：对@ReuqestBody进行增强
19、ResponseBodyAdvice：对@ResponseBody进行增强
20、RESTful接口详解
21、接口调用利器RestTemplate

```


##JSTL
```text

JSTL 核心标签
标签	说明
<c:out>	将表达式的结果输出到页面中，类似于 <％= ...％>
<c:set>	在指定范围内设置变量或属性值
<c:if>	类似于 Java if 语句，用于条件判断
<c:choose>	类似于 Java switch 关键字，为 <c:when>和<c:otherwise> 的父标签
<c:when>	<c:choose> 的子标签，用来判断条件是否成立
<c:otherwise>	<c:choose> 的子标签，当所有的 <c:when> 标签判断为 false 时被执行
<c:forEach>	类似于 Java for，用于迭代集合中的信息
<c:forTokens>	类似于 Java split，用于分隔字符串
<c:remove>	用于删除数据
<c:catch>	用于捕获异常
<c:import>	用来导入静态或动态文件
<c:param>	用来传入参数
<c:redirect>	用于将当前页面重定向至另一个 URL
<c:url>	用于将 URL 格式化为一个字符串
```