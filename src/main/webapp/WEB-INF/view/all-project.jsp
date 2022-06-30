<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Project</h2>
<br>

<table border="10">
    <tr>
        <th>Name</th>
        <th>Scope</th>
        <th>Technical parameters</th>
        <th>Deadline</th>
        <th>Other</th>
    </tr>

    <c:forEach var="project" items="${allProjects}">

        <c:url var="phasesButton" value="/course/phases">
            <c:param name="projectId" value="${project.id}"/>
        </c:url>


        <tr>
            <td><c:out value="${project.name}"/></td>
            <td><c:out value="${project.scope}"/></td>
            <td><c:out value="${project.technicalParameters}"/></td>
            <td><c:out value="${project.deadline}"/></td>
            <td>

                <input type="button" value="Phases"
                       onclick="window.location.href = '${phasesButton}'"/>

            </td>


        </tr>
    </c:forEach>

</table>
<br>


</body>
</html>