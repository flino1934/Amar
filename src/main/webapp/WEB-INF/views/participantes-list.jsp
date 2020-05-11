<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<head>
<meta charset="ISO-8859-1">
<title>Participantes</title>
</head>
<body>

<header>

		<nav class="navbar navbar-expand-md navbar-light bg-primary">

			<div class="container">

				<h2>Participantes</h2>
				<button class="navbar-toggler" data-toggle="collapse"
					data-target="#nav-principal">
					<span class="navbar-toggler-icon"></span>

				</button>

				<div id="nav-principal" class="collapse navbar-collapse">

					<ul class="navbar-nav ml-auto">

						<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
						<li class="nav-item"><a class="nav-link"
							href="/participantes/list">Participantes</a></li>	
						<li class="nav-item"><a class="nav-link" href="/eventos/list">Eventos</a></li>
						

						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
							role="button" aria-haspopup="true" aria-expanded="false">Cadastrar</a>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="/participantes/showFormForAddParticipantes">Participantes</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="/eventos/showFormForAddEvento">Evento</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item"
									href="/casaDeShow/showFormForAddLiderDeEvento">Lider de Evento</a>

							</div></li>

					</ul>

				</div>

			</div>

		</nav>


	</header>

		<table class="table table-hover table-bordered">
		
		<thead class="thead-dark">
			<tr>
				<th scope="col">Nome</th>
				<th scope="col">Sobrenome</th>
				<th scope="col">Matricula</th>
				<th scope="col">Email</th>
				<th scope="col">Idade</th>
				<th scope="col">CURSO</th>
				<th scope="col">CPF</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		
		<c:forEach var="tempParticipantes" items="${participantes}">
		
		
			<c:url var="deleteLink" value="/participantes/delete">

				<c:param name="participanteId" value="${tempParticipantes.id}"></c:param>

			</c:url>
		
		
			<tr>
				<td>${tempParticipantes.nome}</td>
				<td>${tempParticipantes.sobreNome}</td>
				<td>${tempParticipantes.matricula}</td>
				<td>${tempParticipantes.email}</td>
				<td>${tempParticipantes.idade}</td>
				<td>${tempParticipantes.curso}</td>
				<td>${tempParticipantes.cpf}</td>
				<!-- Display the update link -->
				<td><a href="${deleteLink}"
					onclick="if(!(confirm('Deseja deletar o participante?'))) return false">Delete</a></td>
			</tr>
		
		</c:forEach>
		
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
	
		
</table>


</body>
</html>