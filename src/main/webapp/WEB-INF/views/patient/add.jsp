<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>

<form:form method="post" modelAttribute="patient">
    Name and surname: <form:input path="nameSurname"/>
    <form:errors path="nameSurname"/><br/>
    <input type="submit" value="Save">
</form:form>

<%@ include file="footer.jsp" %>