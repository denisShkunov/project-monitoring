<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>

<h2>Operation of stage</h2>
<br>

<table border="10">
    <tr>
        <th>Name</th>
        <th>Deadline</th>
        <th>Person</th>
    </tr>

    <c:forEach var="operation" items="${operationOfStage}">

        <c:url var="operationButton" value="/course/stages">
            <c:param name="operationId" value="${operation.id}"/>
        </c:url>



        <tr>
            <td><c:out value="${operation.name}"/></td>
            <td><c:out value="${operation.time}"/></td>
            <td><c:out value="${operation.operationPerson.surname}"/></td>

        </tr>
    </c:forEach>

</table>
<br>