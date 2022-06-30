<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>

<h2>Stage in phase</h2>
<br>

<table border="10">
    <tr>
        <th>Name</th>
        <th>Deadline</th>
        <th>Brigade id</th>
        <th>Operation</th>
        <th>Other</th>
    </tr>

    <c:forEach var="stage" items="${stageOfPhase}">

        <c:url var="operationButton" value="/course/operations">
            <c:param name="stageId" value="${stage.id}"/>
        </c:url>

        <c:url var="peopleButton" value="/course/peopleInBrigade">
            <c:param name="brigadeId" value="${stage.brigade.id}"/>
        </c:url>


        <tr>
            <td><c:out value="${stage.name}"/></td>
            <td><c:out value="${stage.time}"/></td>
            <td><c:out value="${stage.brigade.name}"/></td>
            <td>
                <input type="button" value="See operation"
                       onclick="window.location.href = '${operationButton}'"/>
            </td>
            <td>
                <input type="button" value="People in this brigade"
                       onclick="window.location.href = '${peopleButton}'"/>
            </td>


        </tr>
    </c:forEach>

</table>
<br>