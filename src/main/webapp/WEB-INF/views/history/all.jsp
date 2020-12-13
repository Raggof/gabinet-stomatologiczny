<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>
<a href="<c:url value="/dentist/all"/>">Dentist</a>
<a href="<c:url value="/patient/all"/>">Patient</a>
<a href="<c:url value="/visit/all"/>">Visit</a>
<a href="<c:url value="/history/all"/>">History</a>

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