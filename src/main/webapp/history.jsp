<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container h-100">
    <div class="row align-items-center h-100">
        <div class="col-6 mx-auto">
            <br>
            <ul>
                <div class="alert alert-success" role="alert">
                    <br>
                    <ul>
                        <div class="alert alert-success" role="alert">
                            <c:set var="now" value="<%=new java.util.Date()%>"/>
                            <c:forEach var="operation" items="${requestScope.all}">
                                <li>${operation}</li>
                                <fmt:formatDate type="both" value="${now}"/>
                            </c:forEach>
                        </div>
                    </ul>
                </div>
            </ul>
        </div>
    </div>
</div>

<%--<ul class="list-group">--%>
<%--    <li class="list-group-item">An item</li>--%>
<%--    <li class="list-group-item">A second item</li>--%>
<%--    <li class="list-group-item">A third item</li>--%>
<%--    <li class="list-group-item">A fourth item</li>--%>
<%--    <li class="list-group-item">And a fifth one</li>--%>
<%--</ul>--%>

</body>
</html>