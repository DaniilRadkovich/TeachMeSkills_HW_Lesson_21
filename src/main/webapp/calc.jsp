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

            <form action="${pageContext.request.contextPath}/calc" method="post">
                <div class="mb-3">
                    <label class="form-label">Введите первое число</label>
                    <input type="text" name="num1" class="form-control" required id="exampleInputPassword1">
                </div>
                <div class="mb-3">
                    <label class="form-label">Выберите операцию</label>
                    <select class="form-select" required name="operand" aria-label="Default select example">
                        <option name="sum" value="sum">Сумма</option>
                        <option name="diff" value="diff">Разность</option>
                        <option name="div" value="div">Деление</option>
                        <option name="mult" value="mult">Умножение</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label class="form-label">Введите второе число</label>
                    <input type="number" name="num2" class="form-control" required id="exampleInputPassword2">
                </div>
                <button type="submit" class="btn btn-primary">Calculate</button>
            </form>

            <%
                if (request.getAttribute("result") != null) {
            %>
            <div class="alert alert-success" role="alert">
                <label class="form-label">Результат:</label>
                <% out.print(request.getAttribute("result")); %>
            </div>
            <% }
            %>
        </div>
    </div>

</div>

</body>
</html>