package webpagina;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;

/**
 * Servlet implementation class ProductPage
 */
@WebServlet("/Product/*")
public class ProductPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String query = request.getQueryString();
		if(query != null){
			int index = Integer.parseInt(query.substring(3));
			request.setAttribute("id", index);
			request.getRequestDispatcher("/WEB-INF/productx.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int aantal = Integer.parseInt(request.getParameter("aantal"));		
		int productIndex = Integer.parseInt(request.getQueryString().substring(3));	
		if(aantal > 0){
			Product product = Index.voorraad.get(productIndex);		
			Index.winkelwagen.bestel(product, aantal);			
			response.sendRedirect("winkelwagen");
		}
		else{
			request.setAttribute("error", "Foutieve input: je kunt alleen "
					+ "een positief aantal producten bestellen");
			doGet(request, response);
		}
	}

}
