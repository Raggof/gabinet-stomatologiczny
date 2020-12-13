<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dentist add</title>
</head>
<body>

<%--@elvariable id="dentist" type="pl.coderslab.entity.Dentist"--%>
<form:form method="post" modelAttribute="dentist">
    Name and Surname: <form:input path="nameSurname"/>
    <form:errors path="nameSurname"/><br/>
    <input type="submit" value="Save">
</form:form>

</body>
</html>
