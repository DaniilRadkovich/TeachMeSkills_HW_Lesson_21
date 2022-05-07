<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>unsuccessful</title
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container h-100">
    <div class="row align-items-center h-100">
        <div class="col-6 mx-auto">
            <div class="col-6 mx-auto">
                <p1>Пожалуйста, проверьте введённые вами данные. Возможно пользователь с таким именем уже существует.
                </p1>
            </div>
            <div class="col-6 mx-auto mt-3 btn-block">
                <button type="submit" class="btn btn-warning" onclick="location.href = '/registration';">Попробовать ещё раз</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
