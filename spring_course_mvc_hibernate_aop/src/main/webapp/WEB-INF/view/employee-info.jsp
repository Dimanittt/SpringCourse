<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
# _rt is required for jakarta and tomcat 10 ! ! !
<!DOCTYPE html>
<html>
<body>

<h2>Write employee info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">

  <form:hidden path="id"/>

  Name <form:input path="name"/>
  <br>  <br>
  Surname <form:input path="surname"/>
  <br>  <br>
  Department <form:input path="department"/>
  <br>  <br>
  Salary <form:input path="salary"/>
  <br>  <br>
  <input type="submit" value="OK">


</form:form>


</body>
</html>