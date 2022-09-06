<%@ page import="cn.edu.ncu.bookstore.entity.Category" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/css/style.css" rel="stylesheet"/>
    <title>网上书店</title>
</head>
<body>
<div class="modal fade" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header"></div>
            <div class="modal-body"></div>
            <div class="modal-footer"></div>
        </div>
    </div>
</div>

<div class="header">
    <div class="container">
        <div class="row">
            <div class="login span4">
                <h1><a href=""> 欢迎来到<strong>我的</strong>书店</a>
                    <span class="red">.</span></h1>
            </div>
            <div class="links span8">
                <a class="login" href="login.html" rel="tooltip" data-placement="bottom" data-toggle="modal" data-target="#myModal"></a>
                <a class="register" href="" rel="tooltip" data_placement="bottom"></a>
            </div>
        </div>
    </div>
</div> <%--header--%>

<div class="row"> <%--下方左右div控制--%>
    <div class="col-md-3"> <%--左侧菜单div控制--%>
        <ul class="nav nav-list" id="list">
            <li class="nav-header">书籍类别</li>
            <c:forEach items="${category}" var="category">
                <li>
                    <a href="#">${category.name}</a>
                </li>
            </c:forEach>
        </ul>
    </div><%--左侧菜单div控制--%>

    <div class="col-md-9" id="book"><%--右侧书本div控制--%>

    </div><%--右侧书本div控制--%>
</div><%--下方左右div控制--%>


<script src="/js/jquery.min.js" ></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/commons.js"></script>


</body>
</html>
