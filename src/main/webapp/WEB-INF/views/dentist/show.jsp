<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Show Dentist</title>
</head>
<body>
<table border="1">
    <thead>
    <th>ID</th>
    <th>Name and Surname</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${dentist.id}"/></td>
        <td><c:out value="${dentist.nameSurname}"/></td>
    </tr>
    </tbody>
</table>
</body>
</html>
