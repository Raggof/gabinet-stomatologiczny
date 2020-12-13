<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Patient add</title>
</head>
<body>
<c:url var="edit_url" value="/visit/edit"/>
<form:form method="post" modelAttribute="visit" action="${edit_url}">
    <form:hidden path="id"/>
    Dentist Name and Surname:<form:input path="dentNameSur"/>
    <form:errors path="dentNameSur"/><br/>
    Patient Name and Surnaem:<form:input path="patNameSur"/>
    <form:errors path="patNameSur"/><br/>
    Data:<form:input path="data"/>
    <form:errors path="data"/><br/>
    Description:<form:input path="description"/>
    <form:errors path="description"/><br/>
    <input type="submit" value="Save">
</form:form>

</body>
</html>
