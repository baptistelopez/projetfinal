
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Connexion</title>
<link href="<c:url value="/static/css/styles.css" />" rel="stylesheet">
<link rel="stylesheet" href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" /> "/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

	<c:import url="header.jsp" />

	<div class="container-fluid">
		<section>
			<h1 class="text-primary">
				<spring:message code="login.title" />
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
				<button type="submit" class="btn btn-primary mb-3"><a href=""><spring:message code="login.submit" /></a></button>
				<span><a href="<c:url value="/users/toCreate" />"><spring:message code="login.users.toCreate" /></a></span>
			</form>
		</section>
	</div>
</body>
</html>