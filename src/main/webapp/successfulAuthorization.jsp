<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success authorization</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container h-100">
    <div class="row align-items-center h-100">
        <div class="col-6 mx-auto">
            <p id="center_text_first">Вы успешно авторизировались! Теперь вы можете перейти к калькулятору или вернуться
                на главную страницу.</p>
            <div class="col-6 mx-auto">
                <a href="${pageContext.request.contextPath}/calc" class="btn btn-warning" role="button">Калькулятор</a>
                <a href="${pageContext.request.contextPath}/homePage.jsp" class="btn btn-info" role="button">На главную</a>
            </div>
        </div>

    </div>
</div>
</div>

</body>
</html>
