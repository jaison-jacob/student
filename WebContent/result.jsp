<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="studentsdatabase.reults"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STUDENTS APP</title>
</head>
<body>

<a href="index.html"><input type="submit" value="enter data"/></a>
<a href="result.html"><input type="submit" value="get result"/></a>
<table>
<tr>


</table>
<h2   style="text-align:center;">Students List</h2>
<table border ="1"  width = "500" align ="center">

<tr> 
<th> <b>STUDENT ID </b> </th>
<th> <b>STUDENT NAME </b> </th>
<th> <b>TAMIL MARK</b> </th>
<th> <b>ENGLISH MARK  </b> </th>
<th> <b>MATHS MARK </b> </th>
<th> <b>SCIENCE MARK </b> </th>
<th> <b>SOCIAL MARK </b> </th>
<th><b>TOTAL MARK</b></th>
<th><b>AVERAGE MARK</b></th>
<th><b>RESULT</b></th>
</tr>
<%

ArrayList<reults> result = (ArrayList<reults>)request.getAttribute("resultdata");
if(result != null){
for(reults results : result){%>
	<tr> 
<td><%=results.getid()%></td>
<td><%=results.getname()%></td>
<td><%=results.gettamil()%></td>
<td><%=results.getenglish()%></td>
<td><%=results.getmaths()%></td>
<td><%=results.getscience()%></td>
<td><%=results.getsocial()%></td> 
<td><%=results.gettotal()%></td>
<td><%=results.getavg()%></td>

<% 
if(results.getresult() == true){ %>
<td>PASS</td>
<%}else{ %>
<td>("FAIL")</td>
<%} %>
</tr>
<%} }%>



</body>
</html>