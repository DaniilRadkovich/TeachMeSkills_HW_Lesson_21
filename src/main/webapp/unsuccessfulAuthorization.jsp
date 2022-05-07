<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container h-100">
    <div class="row align-items-center h-100">
        <div class="col-6 mx-auto">
            <div class="col-6 mx-auto mt-3">
                <p1>Что-то пошло не так. Пожалуйста, попробуйте ещё раз.</p1>
            </div>
            <div class="col-6 mx-auto mt-3">
                <button type="submit" class="btn btn-warning" onclick="location.href = '/authorization';">Попробовать ещё
                    раз
                </button>
            </div>
        </div>
    </div>
</div>

</body>
</html>