<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<script src="<c:url value="/static/js/scripts.js" />"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="home.welcome.title" /></title>
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
	
	<h2>Bienvenue sur Loanee !</h2> 
	
<!-- 	##################### ROLE CLIENT ############################### -->

<!-- ||||||||||||| PARTIE P5 |||||||||||||||||||||||||||||||||| -->
	
	<div class="container-fluid">
		<section>
			<h1 class="text-primary">
				<spring:message code="home.welcome.fundings" />
			</h1>
			<div class="table-responsive">
				<table class="table table-hover">
					<thead class="thead-light">
						<tr>
							<th><spring:message code="home.welcome.fundings.ref" /></th>
							<th><spring:message code="home.welcome.fundings.amount" /></th>
							<th><spring:message code="home.welcome.fundings.currency" /></th>
							<th><spring:message code="home.welcome.fundings.duration" /></th>
							<th><spring:message code="home.welcome.fundings.actualBeginDateWished" /></th>
							<th><spring:message code="home.welcome.fundings.fundingType" /></th>
							<th><spring:message code="home.welcome.fundings.requestDate" /></th>							<th><spring:message code="commons.symbols.nbsp" /></th>
						</tr>
					</thead>
					<tbody>
						<tr>
						<c:forEach items="${fundings}" var="funding">
							<tr>
								<td>${funding.ref}</td>
								<td>${funding.amount}</td>
								<td><spring:message code="commons.symbols.euro" />${funding.currency}</td>
								<td>${funding.duration}</td>
								<td>${funding.actualBeginDateWished}</td>
								<td>${funding.fundingType}</td>
								<td>${funding.requestDate}</td>
								<td>
								<a href="<c:url value="/fundings/toUpdate?id=${funding.ref}" />">
								<spring:message code="home.welcome.fundings.update" />
								</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</section>
	</div>
		<br><br/>
		<button>Demander un nouveau financement</button>
		<!-- ||||||||||||| PARTIE P3 |||||||||||||||||||||||||||||||||| -->
		<section>
	<table>	
		<form>
			  <div class="form-group row">
			    <label for="staticEmail" class="col-sm-2 col-form-label">ref</label>
			    <div class="col-sm-10">
			      <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="email@example.com">
			    </div>
			    
			 </div>
			  <div class="form-group row">
			    <label for="inputPassword" class="col-sm-2 col-form-label">amount</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control-plaintext" id="inputPassword" placeholder="Password">
			    </div>
			  </div>
			  
			  <div class="form-group row">
			    <label for="inputPassword" class="col-sm-2 col-form-label">currency</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control-plaintext" id="inputPassword" placeholder="Password">
			    </div>
			  </div>
			  
			  <div class="form-group row">
			    <label for="inputPassword" class="col-sm-2 col-form-label">duration</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control-plaintext" id="inputPassword" placeholder="Password">
			    </div>
			  </div>
			  
			  <div class="form-group row">
			    <label for="inputPassword" class="col-sm-2 col-form-label">actualBeginDateWished</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control-plaintext" id="inputPassword" placeholder="Password">
			    </div>
			  </div>
			  
			  <div class="form-group row">
			    <label for="inputPassword" class="col-sm-2 col-form-label">fundingType</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control-plaintext" id="inputPassword" placeholder="Password">
			    </div>
			  </div>
			  
			  <div class="form-group row">
			  		 <label for="inputPassword" class="col-sm-2 col-form-label">requestDate</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control-plaintext" id="inputPassword" placeholder="Password">
			    </div>
			  </div>
			
			<div class="form-group row">
			    <div class="col-sm-10">
			      <input type="submit" class="form-control-plaintext" id="inputPassword" value="Valider">
			    </div>
			  </div>
			 
	</form>
</table>
		
		
		</section>
		
		
		
		
	
	
	<!-- 	##################### ROLE banquier ############################### -->

<!-- ||||||||||||| PARTIE P4 |||||||||||||||||||||||||||||||||| -->


	<!-- 	##################### ROLE po ############################### -->

<!-- ||||||||||||| PARTIE P2 |||||||||||||||||||||||||||||||||| -->
	
</body>
</html>