package webpagina;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DefaultProduct;
import model.Product;

/**
 * Servlet implementation class Index
 */
@WebServlet("/")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<DefaultProduct> voorraad = new ArrayList<>();
	{
		voorraad.add(new DefaultProduct("Opgezette vlinder", 120, "images/atalanta.jpg", Product.STUK));
		voorraad.add(new DefaultProduct("Industriële bouwlamp", 160, "https://s.s-bol.com/imgbase0/imagebase/large/FC/9/0/8/3/9200000010483809.jpg", Product.STUK));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("vlinder", voorraad.get(0));
		request.setAttribute("lamp", voorraad.get(1));
		
		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
}
