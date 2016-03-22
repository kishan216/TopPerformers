<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Department</title>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
  <h1>ADD NEW DEPARTMENT</h1><br>
  <form:form action="addDept" method="post">
    <label>Department Id:</label> <form:input path="deptId"/><br>
    Department Name: <form:input path="name"/><br>
    Total Marks: <form:input path="total_Marks"/><br>
    Total Papers: <form:input path="total_Papers"/><br>
    Total Sports: <form:input path="total_Sports"/><br>
    Total Cultural: <form:input path="total_Cultural"/><br>
    <input type="submit" value="Add">
  </form:form>
</body>
</html>