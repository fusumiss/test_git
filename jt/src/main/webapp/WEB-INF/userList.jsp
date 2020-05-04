<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020/5/4
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>userList页面</title>
</head>
<body>
    <!--从域对象中取出数据
        item:表示从域对象中取值，jsp的四大作用域
            = ${域中的key} 获取集合
        var: 循环遍历的变量名称
        varStatus: 记录当前的循环状态，获取遍历次数
        ${user.id} --调用的是对象中的get方法，
    -->
    <c:forEach var="user" items="${users}">
        ${user.id}
        ${user.name}
        ${user.sex}
        ${user.age}
        <hr>
    </c:forEach>
</body>
</html>
