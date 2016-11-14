<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page import="webpagina.Adresgegevens" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bestelling afronden - uw gegevens</title>
</head>
<body>
<h2>Bestelling afronden - uw gegevens</h2>
	<form method = "post" action = "succes">
		<%
			Adresgegevens agg = (Adresgegevens) request.getAttribute("adresgegevens");	
			//boolean allFieldsEmpty = agg.allFieldsEmpty();
		%>
		
		<c:if test="${ !agg.allFieldsEmpty && !agg.nameValid}">
			Bla
			<strong>${ agg.naamerror }</strong><br>
		</c:if>
		Naam : <input type="text" name = "naam" value = <c:if test="${agg.NameValid()}">"${agg.naam }"</c:if>> <br>
		
		
		<c:if test="${ !agg.AdresValid()&& !agg.allFieldsEmpty}">
			<strong>${ agg.getAdresError() }</strong><br>
		</c:if>
		Adres : <input type="text" name = "adres"> <br>
		<c:if test="${ !agg.PostcodeValid()&& !agg.allFieldsEmpty }">
			<strong>${ agg.postcodeerror }</strong><br>
		</c:if>
		Postcode : <input type="text" name = "postcode"> <br>
		<c:if test="${ !agg.telNrValid() && !agg.allFieldsEmpty}">
			<strong>${ agg.telnrerror }</strong><br>
		</c:if>
		Telefoonnummer :  <input type="text" name = "telNr"> <br>
		<input type="submit" value = "Bevestig">
	</form>
</body>
</html>