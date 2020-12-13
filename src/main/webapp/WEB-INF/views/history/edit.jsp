<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>

<c:url var="edit_url" value="/history/edit"/>
<form:form method="post" modelAttribute="history" action="${edit_url}">
    <form:hidden path="id"/>
    Dentist Id:<form:input path="dentId"/>
    <form:errors path="dentId"/><br/>
    Patient Id:<form:input path="patId"/>
    <form:errors path="patId"/><br/>
    Dentist Name and Surname:<form:input path="dentName"/>
    <form:errors path="dentName"/><br/>
    Patient Name and Surname<form:input path="patName"/>
    <form:errors path="patName"/><br/>
    History: <form:input path="history"/>
    <form:errors path="history"/><br/>
    <input type="submit" value="Save">
</form:form>

<%@ include file="footer.jsp" %>