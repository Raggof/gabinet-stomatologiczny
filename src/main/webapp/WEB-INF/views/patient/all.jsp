<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>

<a href="<c:url value="/patient/add"/>">Dodaj</a>

<table border="1">
    <thead>
    <th>Name and Surname</th>
    </thead>
    <tbody>
    <c:forEach items="${patients}" var="patient">
        <tr>
            <td><c:out value="${patient.nameSurname}"/></td>
            <td>
                <a href="<c:out value="/patient/edit/${patient.id}"/>">Edytuj</a>
                <a href="<c:out value="/patient/delete/${patient.id}"/>">Usuń</a>
                <a href="<c:out value="/patient/show/${patient.id}"/>">Pokaż</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<%@ include file="footer.jsp" %>