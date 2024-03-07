<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="design.jsp"/>
     <%
    personpojo pojo=(personpojo) request.getAttribute("person");
    String msg=(String)request.getAttribute("msg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="./search" method="post">
<fieldset>
<legend>Search person Details</legend>
<table>
<tr>
<td>Enter ID </td>
<td> <input type="text" name="id"></td>
</tr>
</table>
</fieldset>
<input type="submit" value="SEARCH">

</form>
<%
if(msg!=null){
%>
<h4><%=msg %></h4>
<%
}
%>
<%
if(pojo != null){
%>
<table>
<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		

</tr>
<tr>
	<td><%=pojo.getId() %></td>
	<td><%=pojo.getName() %></td>
	<td><%=pojo.getEmail() %></td>
	
	</tr>
	
	
</table>
<%
}
%>
</div>

</body>
</html>