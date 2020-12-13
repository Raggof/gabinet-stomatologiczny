<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dentist Edit</title>
</head>
<body>
<c:url var="edit_url" value="/dentist/edit"/>
<form:form method="post" modelAttribute="dentist" action="${edit_url}">
    <form:hidden path="id"/>
    Name and Surname: <form:input path="nameSurname"/>
    <form:errors path="nameSurname"/><br/>
    <input type="submit" value="Save">
</form:form>

</body>
</html>
