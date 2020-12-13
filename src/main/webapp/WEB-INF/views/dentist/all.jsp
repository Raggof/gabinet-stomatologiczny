<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>

<table border="1">
    <thead>
    <th>Name and Surname</th>
    </thead>
    <tbody>
    <c:forEach items="${dentists}" var="dentist">
        <tr>
            <td><c:out value="${dentist.nameSurname}"/></td>
            <td>
                <a href="<c:out value="/dentist/edit/${dentist.id}"/>">Edytuj</a>
                <a href="<c:out value="/dentist/delete/${dentist.id}"/>">Usuń</a>
                <a href="<c:out value="/dentist/show/${dentist.id}"/>">Pokaż</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%@ include file="footer.jsp" %>