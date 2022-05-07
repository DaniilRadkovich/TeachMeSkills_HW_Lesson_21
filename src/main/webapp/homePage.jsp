<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container h-100">
    <div class="row align-items-center h-100">
        <div class="col-6 mx-auto">

            <p id="center_text_first">Добро пожаловать на сайт нашего калькулятора! Спасибо за ваш выбор. Пожалуйста
                зарегистрируйтесь или авторизируйтесь.</p>
            <div class="col-6 mx-auto">
            <a href="${pageContext.request.contextPath}/registration" class="btn btn-warning" role="button">Регистрация</a>
            <a href="${pageContext.request.contextPath}/authorization" class="btn btn-info" role="button">Авторизация</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>