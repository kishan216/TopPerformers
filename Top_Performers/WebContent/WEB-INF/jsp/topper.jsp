<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TOP 3 STUDENTS</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

<table>

       <tr>

              <th>ID</th>

              <th>Name</th>

              <th>Marks Obtained</th>

              <th>Papers Presented</th>

              <th>Sports Participated</th>

              <th>Culturals Participated</th>
        </tr>

  <c:forEach items="${topper}" var="stud">
 

    <tr>

      <td>${stud.id}</td>

      <td>${stud.name}</td>

      <td>${stud.marks}</td>

      <td>${stud.papers}</td>

      <td>${stud.sports}</td>

      <td>${stud.cultural}</td>

    </tr>

  </c:forEach>

 </table> 
  
</body>
</html>


