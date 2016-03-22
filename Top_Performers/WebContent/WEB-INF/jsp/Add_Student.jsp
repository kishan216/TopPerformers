<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
  <h1>ADD NEW STUDENT</h1><br>
  <form:form action="addStud" method="post">
    Student Id: <form:input path="id"/><br>
    Student Name: <form:input path="name"/><br>
    Marks Obtained: <form:input path="marks"/><br>
    Papers Presented: <form:input path="papers"/><br>
    Sports Participated: <form:input path="sports"/><br>
    Culturals Participated: <form:input path="cultural"/><br>
    Department:<form:select path="dept.deptId" items="${deptList}" itemLabel="name" itemValue="deptId"></form:select> 
    <input type="submit" value="Add">
  </form:form>
</body>
</html>