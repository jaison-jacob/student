
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="studentsdatabase.students" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student detail adding </title>
</head>

<body>
<a href="index.html"><input type="submit" value="enter data"/></a>
<a href="result.html"><input type="submit" value="get result"/></a>

<h2   style="text-align:center;">Students List</h2>
<table border ="1"  width = "500" align ="center">

<tr> 
<th> <b>STUDENT ID </b> </th>
<th> <b>STUDENT NAME </b> </th>
<th> <b>TAMIL</b> </th>
<th> <b>ENGLISH  </b> </th>
<th> <b>MATHS  </b> </th>
<th> <b>SCIENCE  </b> </th>
<th> <b>SOCIAL </b> </th>
</tr>

<%
ArrayList<students> getdata = (ArrayList<students>)request.getAttribute("data");
if(getdata != null){
for(students data: getdata){%>

<tr> 
<td><%=data.getid()%></td>
<td><%=data.getname()%></td>
<td><%=data.gettamil()%></td>
<td><%=data.getenglish()%></td>
<td><%=data.getmaths()%></td>
<td><%=data.getscience()%></td>
<td><%=data.getsocial()%></td> 

</tr>
<% }} %>
</table>


	
	
	




 



</body>
</html>