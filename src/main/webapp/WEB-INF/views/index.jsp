<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>  --%>
    
    
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	
	 

    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<title>Spring Boot</title>

</head>
<body>
<div id="resp">
<h1>Spring Boot - Web Application Example</h1>
<hr>



<a class="btn btn-default" href="/home">Add a Todo</a>

<div class="form">
	<form id="listarForm"  action="home" method="post" onsubmit="return validate()">
	
	    <table >
	    	<tr>
	    		<td>Enter your name</td>
	    		<td><input id="name" name="name"></td>
	    		<td><input type="submit" value="Submit"></td>
	    	</tr>
	    </table>
	    <input type="button" id="listado" name="listado" value="Listar" onclick="doAjaxPost()">
</form>
</div>

<%-- <c:out value = "${name}"/> --%>


<c:set var="today" value="<%=new java.util.Date()%>" />
<fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${today}" />

<%
// session.setAttribute("nombre", request.getParameter("name"));
session.setAttribute("name", request.getParameter("name"));

%>
</div>
<div id="resp"></div>
</body>
</html>