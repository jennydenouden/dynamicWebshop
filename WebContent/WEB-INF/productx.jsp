<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="model.Product" %>
<%@ page import="webpagina.Index" %>
<%@ page import="model.Voorraad" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<% 	int index = (int) request.getAttribute("id"); 
	Product product = Voorraad.get(index);

%>
<title><%= product.getNaam() %></title>
</head>
<body>
<h1><%= product.getNaam() %></h1>
<p><strong> <%= product.getDescription() %></strong></p>
<img src=<%= product.getImageURL() %>>
<p>Prijs: &euro;<%= product.getPrijsPerEenheid() %></p>

<% String msg = (String) request.getAttribute("error");
	if(msg != null){%>
		<strong><%=msg %></strong>
	<%}
%>
<form method = "post">
	<input type="number" name="aantal" value="1">
	<input type="submit" value="Bestel">
</form>
</body>
</html>