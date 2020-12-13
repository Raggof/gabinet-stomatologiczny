<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>History List</title>
</head>
<body>
<table border="1">
    <thead>
    <th>ID</th>
    <th>Date and time</th>
    <th>History</th>

    </thead>
    <tbody>
    <tr>
        <td><c:out value="${history.id}"/></td>
        <td><c:out value="${history.data}"/></td>
        <td><c:out value="${history.history}"/></td>
    </tr>
    </tbody>
</table>
</body>
</html>
