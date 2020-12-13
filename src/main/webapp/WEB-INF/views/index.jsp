<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Landing Page</title>
</head>
<body>

<a href="<c:url value="/dentist/all"/>">Dentists</a><br/>
<a href="<c:url value="/patient/all"/>">Patients</a><br/>
<a href="<c:url value="/visit/all"/>">Visits</a><br/>
<a href="<c:url value="/history/all"/>">History</a><br/>

</body>
</html>
