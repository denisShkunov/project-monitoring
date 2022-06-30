<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Employee info</h2>
<br>

<form:form action="saveEmployee" modelAttribute="person">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Qualification Level <form:input path="qualificationLevel"/>
    <br><br>
    Training Level <form:input path="trainingLevel"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>


</body>

</html>