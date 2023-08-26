<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
# _rt is required for jakarta and tomcat 10 ! ! !
<!DOCTYPE html>
<html>
<body>

<h2>All employees</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="employee" items="${allEmployees}">

        <c:url var="updateButton" value="updateInfo">
        <c:param name="employeeId" value="${employee.id}"/>
        </c:url>

        <c:url var="deleteButton" value="deleteEmployee">
            <c:param name="employeeId" value="${employee.id}"/>
        </c:url>

        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href = '${updateButton}'">

                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'">
            </td>
        </tr>

    </c:forEach>
</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href = 'addNewEmployee'"
/>


</body>
</html>