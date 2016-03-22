<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Student</title>
</head>
<body>
  <table>
    <tr>
      <td>ID</td>
      <td>${student.id}</td>
    </tr>
    <tr>
      <td>Name</td>
      <td>${student.name}</td>
    </tr>
    <tr>
      <td>Marks Obtained</td>
      <td>${student.marks}</td>
    </tr>
    <tr>
      <td>Papers Presented</td>
      <td>${student.papers}</td>
    </tr>
    <tr>
      <td>Sports Participated</td>
      <td>${student.sports}</td>
    </tr>
    <tr>
      <td>Culturals Participated</td>
      <td>${student.cultural}</td>
    </tr>
    <tr>
      <td>Department</td>
      <td>${student.dept.name}</td>
    </tr>
  </table>
  <a href="addStud">ADD NEW STUDENT</a>
  <a href="showAll">Top Performers</a>
</body>
</html>