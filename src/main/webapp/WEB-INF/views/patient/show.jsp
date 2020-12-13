<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="header.jsp" %>


<table border="1">
    <thead>
    <th>Id</th>
    <th>Name and Surname</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${patient.id}"/></td>
        <td><c:out value="${patient.nameSurname}"/></td>
    </tr>
    </tbody>
</table>
Historia:
<table border="1">
    <thead>
    <th>Historia:</th>
    </thead>
    <tbody>
    <c:forEach items="${histList}" var="histList">
            <tr>
                <td>Data: <c:out value="${histList}"/></td>
            </tr>
    </c:forEach>
    </tbody>
</table>


<%@ include file="footer.jsp" %>