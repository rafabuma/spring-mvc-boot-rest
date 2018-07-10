<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resouces/css/style.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
<h1>Spring Boot - Web Application Example</h1>
<hr>
<h3>Your name is ${name}</h3>
<% 
String nombre="hl";
nombre=request.getParameter("name");
System.out.println("nombre: "+nombre);

 %> 
<h3>value = <%=session.getAttribute("name")%></h3>

 <c:out value = "${name}"/>
 
<%--  <c:out value = "<%=session.getAttribute("nombre")%>"/>   --%>
<div class="container">
	    <a href="/addCliente"  class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>Agregar</a>
	    			<table class="table table-striped">
				<thead>
					<th>Id</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Email</th>
					<th>Direccion</th>
					<th>editar</th>
					<th>agregar</th>
				</thead>
				<tbody>
					
				  <tr>
				      <th scope="row">1</th>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				    </tr>
									
					
				</tbody>
			
			</table>
</div>
</body>
</html>