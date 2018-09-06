<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="${pageContext.response.locale.language}">
<head>
<title><spring:message code="login.title" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="<c:url value="/static/css/styles.css" />">

<script src="<c:url value="/static/js/scripts.js" />"></script>
<%-- <c:import url="./commonsNav.jsp" /> --%>
</head>
<body>

	<nav class ="navbar navbar-inverse">
	  <div class ="container-fluid">
	    <div class ="navbar-header">
	      <a class="navbar-brand" href="#"><strong class="couleur">Sodi</strong><strong class="rouge">Bank</strong></a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="#">Loanee</a></li>
	      <li><a href="#"></a></li>
	      <li><a href="#"></a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
      <li><a href=""><span class="glyphicon glyphicon-log-in"></span> Deconnexion</a></li>
    </ul>
	  </div>
</nav>
	<div class="container-fluid">
		<section>
			<h1 class="text-primary">
				<spring:message code="commons.nav.home" />
			</h1>
			<form method="POST" action="<c:url value="/login" />">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<div class="form-group">
					<label for="username"><spring:message code="login.username" /></label>
					<input type="text" name="username" value="" maxlength="255" class="form-control">
				</div>
				<div class="form-group">
					<label for="password"><spring:message code="login.password" /></label>
					<input type="password" name="password" value="" maxlength="12" autocomplete="off" class="form-control">
				</div>
				<button type="submit" class="btn btn-primary mb-3"><spring:message code="commons.forms.submit" /></button>
				<span><a href="<c:url value="/home/welcome" />"></a></span>
				<button type="reset" class="btn btn-primary mb-3"><spring:message code="commons.forms.reset" /></button>
			
			</form>
		</section>
	</div>
<%-- 	<c:import url="/footerNav.jsp" /> --%>
</body>
</html>