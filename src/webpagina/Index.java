package webpagina;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bestel.Winkelwagen;
import model.DefaultProduct;
import model.Product;
import model.Voorraad;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index.html")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static Winkelwagen winkelwagen = new Winkelwagen();	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.setAttribute("voorraad", Voorraad.voorraad);
		request.setAttribute("winkelwagen", winkelwagen);
		
		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
}
