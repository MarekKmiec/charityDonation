<%--
  Created by IntelliJ IDEA.
  User: marek
  Date: 19.10.2022
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<jsp:include page="/fragments/header.jsp"/>--%>

<%--<section class="steps">--%>
<%--    <h2>Wystarczą 4 proste kroki</h2>--%>

<form:form method="post" action="/donation/add" modelAttribute="donation"><br>

    categories <form:checkboxes path="categories" items="${categories}" itemLabel="name" itemValue="id"/><br>
    institution <form:select path="institution" items="${institutions}" itemLabel="name" itemValue="id"/><br>
    zipCode <form:input path="zipCode"/><br>
    street <form:input path="street"/><br>
    city <form:input path="city"/><br>
    quantity <form:input path="quantity"/><br>
    pickUpComment <form:textarea path="pickUpComment"/><br>
    pickUpDate <form:input type="date" path="pickUpDate"/><br>
    pickUpTime <form:input type="time" path="pickUpTime"/><br>

    <form:hidden path="id"/>
    <%--    <form:errors path="*" />--%>
    <button type="submit">Save</button>
</form:form>

<%--<jsp:include page="/fragments/footer.jsp"/>--%>

</body>
</html>
