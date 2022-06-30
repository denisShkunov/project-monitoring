<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>

<h2>Phase of project</h2>
<br>

<table border="10">
    <tr>
        <th>Name</th>
        <th>Deadline</th>
        <th>Other</th>
    </tr>

    <c:forEach var="phase" items="${phaseOfProject}">

        <c:url var="stageButton" value="/course/stages">
            <c:param name="phaseId" value="${phase.id}"/>
        </c:url>


        <tr>
            <td><c:out value="${phase.name}"/></td>
            <td><c:out value="${phase.deadline}"/></td>
            <td>

                <input type="button" value="Stages"
                       onclick="window.location.href = '${stageButton}'"/>

            </td>


        </tr>
    </c:forEach>

</table>
<br>