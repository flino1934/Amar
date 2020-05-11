<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Participantes</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>

<header>

		<nav class="navbar navbar-expand-md navbar-light bg-primary">

			<div class="container">

				<h2>Cadastrar Participantes</h2>
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
	
	
	<div class="container">
	
			<form:form action="saveParticipante" modelAttribute="participantes" method="POST">

			<div class="form-row">

				<div class="form-group col-md-6">

					<label>Nome</label>
					<form:input class="form-control" placeholder="Nome"
						path="nome" />


				</div>

				<div class="form-group col-md-6">

					<label>Sobre nome</label>
					<form:input class="form-control"
						placeholder="Sobre nome" path="sobreNome" />

				</div>

				<div class="form-group col-md-6">


					<label>Matricula(*)</label>
					<form:input class="form-control" placeholder="51821583"
						path="matricula" />
					<form:errors path="matricula"/>	


				</div>

				<div class="form-group col-md-6">


					<label>Email</label>
					<form:input class="form-control" placeholder="f.lino1934@hotmail.com"
						path="email" />
					

				</div>

				<div class="form-group col-md-6">


					<label>Idade</label>
					<form:input class="form-control" placeholder="Somente numeros"
						path="idade" />
					<form:errors path="idade"/>	

				</div>

				<div class="form-group col-md-6">


					<label>Curso</label>
					<form:input class="form-control" placeholder=""
						path="curso" />

				</div>
				
				<div class="form-group col-md-6">


					<label>CPF(*)</label>
					<form:input class="form-control" placeholder="493.669.018-08"
						path="cpf" />
					<form:errors path = "cpf"/>	

				</div>

			</div>

			<button type="submit" class="btn btn-outline-primary"
				onclick="if(!(confirm('Deseja cadastrar o Participante?'))) return false">Salvar</button>

		</form:form>


	</div>
	
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
	
</body>
</html>