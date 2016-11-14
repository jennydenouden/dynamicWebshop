<%@page import="bestel.ProductHoeveelheid"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
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

	HashMap<Product, Integer> voorraad = (HashMap<Product, Integer>)(request.getAttribute("voorraad"));
	int index = 0;
	for(Product p : voorraad.keySet()){%>
		
			<tr>
				<td><%= voorraad.get(p) %></td>
				<td><a href="Product?id=<%=index %>" ><%= p.getNaam() %></a></td>
				<td><%= p.getPrijsPerEenheid() %></td>
				<td> <img src=<%= p.getImageURL() %> width="200" height="200"></td>
			</tr>
		
	<%
		index++;
	}

%>
</table>

<%
	Winkelwagen winkelwagen = (Winkelwagen)(request.getAttribute("winkelwagen"));
	if(winkelwagen.getBestellingen().size() > 0){
%>

	<h3>Winkelwagen</h3>
	<table>
		<tr>
			<th>Product</th>
			<th>Aantal</th>
			<th>Prijs</th>
		</tr>
	<%
	
		
		
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
<% } %>
  
  

</body>
</html>