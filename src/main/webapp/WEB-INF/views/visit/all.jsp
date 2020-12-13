<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Patient List</title>
</head>
<body>
<a href="<c:url value="/visit/add"/>">Dodaj</a><br/>
<a href="<c:url value="/dentist/all"/>">Dentists</a><br/>
<a href="<c:url value="/patient/all"/>">Patients</a><br/>
<a href="<c:url value="/visit/all"/>">Visits</a><br/>
<a href="<c:url value="/history/all"/>">History</a>
<table border="1">
    <thead>
    <th>Dentist Name</th>
    <th>Patient Name</th>
    <th>Date</th>
    <th>Description</th>
    </thead>
    <tbody>
    <c:forEach items="${visits}" var="visit">
        <tr>
            <td><c:out value="${visit.dentNameSur}"/></td>
            <td><c:out value="${visit.patNameSur}"/></td>
            <td><c:out value="${visit.data}"/></td>
            <td><c:out value="${visit.description}"/></td>
            <td>
                <a href="<c:out value="/visit/edit/${visit.id}"/>">Edytuj</a>
                <a href="<c:out value="/visit/delete/${visit.id}"/>">Usuń</a>
                <a href="<c:out value="/visit/show/${visit.id}"/>">Pokaż</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
