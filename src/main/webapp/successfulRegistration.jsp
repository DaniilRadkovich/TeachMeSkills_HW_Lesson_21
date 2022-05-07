<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container h-100">
    <div class="row align-items-center h-100">
        <div class="col-6 mx-auto">
            <p id="center_text_first">Вы успешно зарегистрировались! Теперь вы можете войти в систему и перейти к
                калькулятору.</p>
            <div class="col-6 mx-auto">
                <a href="${pageContext.request.contextPath}/authorization" class="btn btn-warning" role="button">Авторизироваться</a>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>