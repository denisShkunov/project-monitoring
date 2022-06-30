<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>

<h2>All Employees</h2>
<br>

<table border="10">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Qualification Level</th>
        <th>Training Level</th>
        <th>Operations</th>

    </tr>

    <c:forEach var="person" items="${allPeople}">

        <c:url var="updateButton" value="/course/updateEmployee">
            <c:param name="personId" value="${person.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/course/deleteEmployee">
            <c:param name="personId" value="${person.id}"/>
        </c:url>


        <tr>
            <td><c:out value="${person.name}">1</c:out></td>
            <td><c:out value="${person.surname}">2</c:out></td>
            <td><c:out value="${person.qualificationLevel}">3</c:out></td>
            <td><c:out value="${person.trainingLevel}">4</c:out></td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>

        </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href = 'addNewEmployee'"/>
<br>
<input type="button" value="All Project"
       onclick="window.location.href = 'projects'"/>



</body>
</html>