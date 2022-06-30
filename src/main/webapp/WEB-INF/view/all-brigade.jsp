<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Brigade</h2>
<br>

<table border="10">
    <tr>
        <th>Name</th>
        <th>Functional feature</th>
        <th>Other</th>
    </tr>

    <c:forEach var="brigade" items="${allBrigade}">

        <c:url var="peopleButton" value="/course/peopleInBrigade">
            <c:param name="brigadeId" value="${brigade.id}"/>
        </c:url>


        <tr>
            <td><c:out value="${brigade.name}"/></td>
            <td><c:out value="${brigade.functionalFeature}"/></td>

            <td>

                <input type="button" value="person"
                       onclick="window.location.href = '${peopleButton}'"/>
            </td>
        </tr>
    </c:forEach>

</table>
<br>


</body>
</html>