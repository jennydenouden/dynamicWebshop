<%@page import="bestel.ProductHoeveelheid"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Product" %>
<%@ page import="bestel.Winkelwagen" %>

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

<h3>Winkelwagen</h3>
<table>
	<tr>
		<th>Product</th>
		<th>Aantal</th>
		<th>Prijs</th>
	</tr>
<%

	Winkelwagen winkelwagen = (Winkelwagen)(request.getAttribute("winkelwagen"));
	
	for(ProductHoeveelheid ph : winkelwagen.getBestellingen()){%>
		<tr>
			<td><%= ph.getProductNaam() %></td>
			<td><%= ph.getHoeveelheid()%></td>
			<td> &euro; <%= ph.getPrijs() %></td>
		</tr>
	<%}

%>
	<tr>
		<th>Totaal</th>
		<th></th>
		<th> &euro;<%= winkelwagen.getTotaalPrijs() %></th>
	</tr>

</table>
  
  

</body>
</html>