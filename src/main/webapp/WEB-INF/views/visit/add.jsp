<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>
Visit:<br/>
<form:form method="post" modelAttribute="visit">
    Dentist: <form:input path="dentNameSur"/>
    <form:errors path="dentNameSur"/><br/>
    Patient: <form:input path="patNameSur"/>
    <form:errors path="patNameSur"/><br/>
    Date: <form:input path="data"/>
    <form:errors path="data"/><br/>
    Description: <form:input path="description"/>
    <form:errors path="dentNameSur"/><br/>
    <input type="submit" value="Save">
</form:form>

<%@ include file="footer.jsp" %>