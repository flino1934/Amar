<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page Projeto A-mar</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>

	<header>

		<nav class="navbar navbar-expand-md navbar-light bg-primary">

			<div class="container">

				<h2>Inicio</h2>
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