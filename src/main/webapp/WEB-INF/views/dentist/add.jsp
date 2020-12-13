<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>

<%--@elvariable id="dentist" type="pl.coderslab.entity.Dentist"
<form:form method="post" modelAttribute="dentist">
    Name and Surname: <form:input path="nameSurname"/>
    <form:errors path="nameSurname"/><br/>
    <input type="submit" value="Save">
</form:form>--%>


<div class="container-fluid">

    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Users</h1>
        <a href="/user/list" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i>Users list</a>
    </div>
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Add User</h6>
        </div>
        <div class="card-body">
            <%--@elvariable id="dentist" type="pl.coderslab.entity.Dentist"--%>
            <form:form method="post" modelAttribute="dentist">
                <div class="form-group">
                    Name and Surname: <form:input path="nameSurname"/>
                    <form:errors path="nameSurname"/><br/>
                </div>
                <input type="submit" value="Save">
            </form:form>
        </div>
    </div>
</div>
<%@ include file="footer.jsp" %>