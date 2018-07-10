<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	 <script type="text/javascript" src="/resources/js/app.js"></script>
	 <script src="/resources/js/datatable.js"></script>
	 
	 
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
	<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
		 
	<title>Examen</title>
	
</head>
<body>

	<div class="container">
		<div class="row">
		<h1>Mantenimiento de clientes</h1>
		<p>
			<a href="add.htm" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>Agregar</a>
			</p>
   <div class="row">
   ${name}
  <div class="row">
			<table class="table table-bordered table-striped table-hover">
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
					
					<c:forEach items="${lista}" var="cliente" >
					
						<tr> 
							
							<td><c:out value="${cliente.id}"></c:out></td>
							<td><c:out value="${cliente.nombre}"></c:out></td>
							<td><c:out value="${cliente.apellido}"></c:out></td>
							<td><c:out value="${cliente.email}"></c:out></td>
							<td><c:out value="${cliente.direccion}"></c:out></td>
							<td><a href='<c:url value="edit.htm?id=${cliente.id}"/>' class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></a></td>
							<td><a href='<c:url value="delete.htm?id=${cliente.id}"/>' class="btn btn-success"><span class="glyphicon glyphicon-trash"></span></a></td>
						</tr>
					</c:forEach>
					
					
				</tbody>
			
			</table>
		
		
		</div>
	</div>
	
	<h1>Employees Table</h1>
	<div class="demo-html">
					<a class="editor_create"><span class="glyphicon glyphicon-plus"></span>Create new record</a>
	</div>
	<table id="employeesTable" class="table table-bordered table-striped table-hover" >
      
       <!-- Header Table -->
       <thead>
            <tr>
                <th>Id</th>
				<th>Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>direction</th>
                <th>editar</th>
                <th>eliminar</th>
               
            </tr>
        </thead>
        <!-- Footer Table -->
        <tfoot>
            <tr>
                <th>idCliente</th>
				<th>nombre</th>
                <th>apellido</th>
                <th>email</th>
                <th>direccion</th>
				<td>editar</span></a></td>
				<td>eliminar</td>
				

            </tr>
        </tfoot>
    </table>
	
</body>
</html>