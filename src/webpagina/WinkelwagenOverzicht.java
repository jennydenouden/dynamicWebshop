package webpagina;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WinkelwagenOverzicht
 */
@WebServlet("/winkelwagen")
public class WinkelwagenOverzicht extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.setAttribute("winkelwagen", Index.winkelwagen);
		request.getRequestDispatcher("/WEB-INF/winkelwagen.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("POST WINKELWAGENOVERZICHT");
	}

}
