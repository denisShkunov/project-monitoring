<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>

<h2>People in brigade</h2>
<br>

<table border="10">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Qualification Level</th>
        <th>Training Level</th>
        <th>Task in progress</th>
    </tr>

    <c:forEach var="person" items="${peopleInBrigade}">

        <c:url var="stageButton" value="/course/stages">
            <c:param name="phaseId" value="${person.id}"/>
        </c:url>


        <tr>
        <tr>
            <td><c:out value="${person.name}">1</c:out></td>
            <td><c:out value="${person.surname}">2</c:out></td>
            <td><c:out value="${person.qualificationLevel}">3</c:out></td>
            <td><c:out value="${person.trainingLevel}">4</c:out></td>
            <td><c:out value="${person.personOperation.name}"/></td>


        </tr>
    </c:forEach>

</table>
<br>