<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
    <tr>
      <td>ID</td>
      <td>${depart.deptId}</td>
    </tr>
    <tr>
      <td>Name</td>
      <td>${depart.name}</td>
    </tr>
    <tr>
      <td>Total Marks</td>
      <td>${depart.total_Marks}</td>
    </tr>
    <tr>
      <td>Total Papers</td>
      <td>${depart.total_Papers}</td>
    </tr>
    <tr>
      <td>Total Sports</td>
      <td>${depart.total_Sports}</td>
    </tr>
    <tr>
      <td>Total Culturals</td>
      <td>${depart.total_Cultural}</td>
    </tr>
  </table>
  <a href="addDept">ADD NEW DEPARTMENT</a>
  <a href="showAll">Top Performers</a>
</body>
</html>