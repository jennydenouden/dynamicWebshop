<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="bestel.Winkelwagen" %>
<%@ page import="bestel.ProductHoeveelheid" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Winkelwagen</title>
</head>
<body>
<h2>Overzicht winkelwagen</h2>

<table>
<%
	Winkelwagen winkelwagen = (Winkelwagen) request.getAttribute("winkelwagen");
	for(ProductHoeveelheid ph : winkelwagen.getBestellingen()){ %>
		<tr>
			<td><%= ph.getHoeveelheid() %>x</td>
			<td><%= ph.getProductNaam() %></td>
			<td>&euro;<%= ph.getPrijs() %></td>
			<td>
				<form method="post">
					<input type="submit" value="Verwijder" name="delete<%=ph.getProductNaam()%>">
				</form>
			</td>
		</tr>
	<%}

%>

	<tr>
		<th>Totaal</th>
		<th></th>
		<th>&euro;<%= winkelwagen.getTotaalPrijs() %></th>
	</tr>

</table>

<form method = "post">
	<input type="submit" value = "BESTEL" name="bestel">
</form>

</body>
</html>