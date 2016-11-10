<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.DefaultProduct" %>
<% ArrayList<DefaultProduct> al = (ArrayList<DefaultProduct>)(request.getAttribute("voorraad")); %>

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
	<td>
		<%DefaultProduct vlinder = (DefaultProduct)(request.getAttribute("vlinder")); %>
		<th><%= vlinder.getNaam() %></th>
		<th><%= vlinder.getPrijsPerEenheid() %></th>
		<th> <img src=<%= vlinder.getImageURL() %>></th>	
	</td>
	<td>
		<%DefaultProduct lamp = (DefaultProduct)(request.getAttribute("lamp")); %>
		<th><%= lamp.getNaam() %></th>
		<th><%= lamp.getPrijsPerEenheid() %></th>
		<th> <img src=<%= lamp.getImageURL() %>></th>
	</td>
</table>

  
  

</body>
</html>