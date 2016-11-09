package webpagina;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<title>BLA</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>DOE IETS PLZZZ</h1>"
				+ "</body>"
				+ "</html>");
		//request.getRequestDispatcher("WebContent/Winkelwagen.html").forward(request, response);
	}
}
