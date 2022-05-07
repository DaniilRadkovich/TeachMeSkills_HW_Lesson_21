                                    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
    <jsp:include page="_header.jsp"/>
<body>

<div class="container h-100">
    <div class="row align-items-center h-100">
        <div class="col-6 mx-auto">

            <form action="${pageContext.request.contextPath}/authorization" method="post">
                <div class="mb-6">
                    <label class="form-label">Login</label>
                    <input type="text" name="login" class="form-control">
                </div>
                <div class="mb-6">
                    <label class="form-label">Password</label>
                    <input type="password" name="password" class="form-control">
                </div>
                <div class="mt-2">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>

        </div>
    </div>
</div>

</body>
</html>
