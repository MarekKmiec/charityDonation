<%--
  Created by IntelliJ IDEA.
  User: marek
  Date: 18.10.2022
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/fragments/header.jsp"/>




<table class="table table-striped ">
    <tr>
        <th>name</th>
        <th>description</th>

        <%--        <th>AllCost</th>--%>

    </tr>
    <c:forEach items="${institutions}" var="i">
        <tr>

            <td><c:out value="${i.name}"/></td>
            <td><c:out value="${i.description}"/></td>
                <%--            <td><c:out value="${e.allCost}"/></td>--%>
                <%--      <td><c:out value="${e.users}"/></td>--%>

<%--            <td><a href="<c:url value="/expense/delete/${e.id}"/>"--%>
<%--                   onclick="return confirm('Are you sure you want to delete expense \'${e.description}\'?')">Delete</a>--%>
<%--                <br><a href="<c:url value="/expense/edit/${e.id}"/>">Edit</a></td>--%>
        </tr>
    </c:forEach>


</table>


<jsp:include page="/fragments/footer.jsp"/>