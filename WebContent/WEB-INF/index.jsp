<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Product" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BLACK BOW TIE</title>
</head>
<body>
<h1>BLACK BOW TIE. </h1>
<p>Welkom in de web store van BLACK BOW TIE. U kunt hier terecht voor al
uw hipster-benodigdheden.</p>

<h3>Ons assortiment</h3>
<p>Bladiebla, dit kun je bij ons kopen, vul later maar.</p>


<table>
	<tr>
		<th>Naam</th>
		<th>Prijs</th>
		<th>Plaatje</th>
	</tr>
<%

	ArrayList<Product> voorraad = (ArrayList<Product>)(request.getAttribute("voorraad"));
	
	for(Product p : voorraad){%>
		<tr>
			<td><%= p.getNaam() %></td>
			<td><%= p.getPrijsPerEenheid() %></td>
			<td> <img src=<%= p.getImageURL() %> width="200" height="200"></td>
		</tr>
	<%}

%>
</table>
  
  

</body>
</html>