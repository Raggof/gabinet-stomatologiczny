<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>

<form:form method="post"
           modelAttribute="history">
    Dentist Id:<form:input  path="dentId"/>
    <form:errors path="dentId"/><br/>
    Patient Id:<form:input path="patId"/>
    <form:errors path="patId"/><br/>
    Dentist Name and Surname:<form:input path="dentName"/>
    <form:errors path="dentName"/><br/>
    Patient Name and Surname<form:input path="patName"/>
    <form:errors path="patName"/><br/>
    Date and time: <form:input path="data"/>
    <form:errors path="data"/><br/>
    Patient history:<form:input path="history"/>
    <form:errors path="history"/><br/>
    <input type="submit" value="Save">
</form:form>


<%@ include file="footer.jsp" %>