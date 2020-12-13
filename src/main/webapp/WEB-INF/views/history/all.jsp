<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>

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
<table border="1">
    <thead>
    <th>Dentist Name</th>
    <th>Patient Name</th>
    <th>History</th>
    </thead>
    <tbody>
    <c:forEach items="${histories}" var="history">
        <tr>
            <td><c:out value="${history.dentName}"/></td>
            <td><c:out value="${history.patName}"/></td>
            <td><c:out value="${history.history}"/></td>
            <td>
                <a href="<c:out value="/history/edit/${history.id}"/>">Edit</a>
                <a href="<c:out value="/history/delete/${history.id}"/>">Delete</a>
                <a href="<c:out value="/history/show/${history.id}"/>">Show</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<%@ include file="footer.jsp" %>