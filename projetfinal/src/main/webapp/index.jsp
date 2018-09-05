
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/static/css/styles.css" />" rel="stylesheet">

<link rel="stylesheet" href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" /> "/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class ="navbar navbar-inverse">
	  <div class ="container-fluid">
	    <div class ="navbar-header">
	      <a class="navbar-brand" href="#"><strong class="coleur">Sodi</strong><trong class="rouge">Bank</trong></a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="#">Loanee</a></li>
	      <li><a href="#"></a></li>
	      <li><a href="#"></a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	     <li class="dropdown">
	        <a class="dropdown-toggle glyphicon glyphicon-log-in" data-toggle="dropdown" href="#"> Login
	        <span class="caret"></span></a>
	        <ul class="dropdown-menu">
	          <li><a href="<c:url value="/home/welcome"/>" >Admin</a></li>
	          <li><a href="<c:url value="/courses/toCreate" />" >Banquier</a></li>
	          <li><a href="<c:url value="/courses/toCreate" />" >Client</a></li>
	           <li><a href="<c:url value="/courses/toCreate" />" >Product Owner</a></li>
	        </ul>
	      </li>
	    </ul>
	  </div>
</nav>
	<h2>Bienvenue sur Loanee!</h2> 
</body>
</html>
