<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="${pageContext.response.locale.language}">
<head>
<title><spring:message code="login.title" /></title>
<%-- <c:import url="WEB-INF/jspf/commonsNav.jsp" /> --%>
<%-- <c:import url="./commonsNav.jsp" /> --%>
</head>
<body>
<%-- 	<c:import url="./headerNav.jsp" /> --%>
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
				<span><a href="<c:url value="/users/toCreate" />"><spring:message code="commons.forms.submit" /></a></span>
				<button type="reset" class="btn btn-primary mb-3"><spring:message code="commons.forms.reset" /></button>
				<span><a href="<c:url value="/users/toCreate" />"><spring:message code="commons.forms.reset" /></a></span>
			</form>
		</section>
	</div>
<%-- 	<c:import url="/footerNav.jsp" /> --%>
</body>
</html>