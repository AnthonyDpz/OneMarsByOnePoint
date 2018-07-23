<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<br>
<!-- ------------------------ utilisateur loggé ------------------------ -->
<c:if test="${userBean.status}">
	<c:out value="Bonjour, ${userBean.userName}." />
	<form action="Home" method="post"> 
		<input type="submit" name="action" value="Disconnection" />
	</form>
</c:if>

<!-- ------------------------ Visiteur ------------------------ -->
<c:if test="${not userBean.status}">
	<c:out value="Bonjour, Visiteur." />
	<form action="Home" method="post">

		<label for="userLogin">Login :</label>
		<input type="text" name="userLogin" id="userLogin" value="Anthony" size="10" maxlength="10">
		<c:out value="${userBean.getErrors()['userLogin']}" />
		<br>
		
		<label for="userPassword">Password :</label>
		<input type="password" name="userPassword" id="userPassword" value="5Tr!d3r2" size="10" maxlength="20">
		<c:out value="${userBean.getErrors()['userPassword']}" />
		<br>
		
		<input type="submit" name="action" value="Connection">
		<br>
		
	</form>
	<button data-toggle="modal" href="#infos">Aide</button>
</c:if>
<br>


<div class="modal fade" id="infos">
	<div class="modal-dialog">
		<div class="modal-content" id="help_login">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">x</button>
				<h4 class="modal-title">Assistance</h4>
			</div>
			<div class="modal-body">
				Le <b>login</b>, doit être une chaine de caractère de maximum 20.<br>
				Le <b>mot de passe</b> quand a lui, ne doit pas faire moins de 4
				caratères et 20 caractères maximum.
			</div>
			<div class="modal-footer">
				<button class="btn btn-info" data-dismiss="modal">Fermer</button>
			</div>
		</div>
	</div>
</div>