<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- Required meta tags -->
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="CSS/styles.css" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		
		<title>
			OneMars
		</title>
		
	</head>
	
	<body>
		
		<div class="container-fluid">
		
			<!-- -----------------------------   header   -------------------------------------- -->
			<div class="row" id="mainHeader">
				
				<div class="col-1" class="margeGauche">
					
				</div>
				
				<div class="col-6" id="titre">
					<br>
					<h1>
						OneMars, l'aventure est au bout du clic !
					</h1>
					<br>
				</div>
				
				<div class="col-4" id="mainLogin">
					<%@ include file="login.jsp" %>
				</div>
				
				<div class="col-1" class="margeDroite">
					
				</div>
				
			</div>
			<!-- --------------------------   fin de header   ---------------------------------- -->
			
			<!-- -------------------- ---------   body   ---- ---------------------------------- -->
			<div class="row" id="mainBody">
				
				<div class="col-1" class="margeGauche">
					
				</div>
				
				<div class="col-10" class="centralBody">
					<br>
						<b>
							TODO :
							<br>
							Mettre ici une page de présentation de l'activité OneMars.
						</b>
					<br>
				</div>
				
				<div class="col-1" class="margeDroite">
					
				</div>
				
			</div>
			<!-- ---------------------- ----   fin de body   ---- ------------------------------ -->
		
		</div><!-- fin de container bootstrap -->
	
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	</body>
	
</html>