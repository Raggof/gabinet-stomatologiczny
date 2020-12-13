<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Patient List</title>
</head>
<body>
<table border="1">
    <thead>
    <th>Visit id</th>
    <th>Dentist Name and Surname</th>
    <th>Patient Name and Surname</th>
    <th>Date of visit</th>
    <th>Description</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${visit.id}"/></td>
        <td><c:out value="${visit.dentNameSur}"/></td>
        <td><c:out value="${visit.patNameSur}"/></td>
        <td><c:out value="${visit.data}"/></td>
        <td><c:out value="${visit.description}"/></td>
    </tr>
    </tbody>
</table>
</body>
</html>
