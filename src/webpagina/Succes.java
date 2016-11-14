package webpagina;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Succes
 */
@WebServlet("/succes")
public class Succes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/succes.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Adresgegevens agg = (Adresgegevens) session.getAttribute("adresgegevens");
		if(agg == null){
			agg = new Adresgegevens();
			session.setAttribute("adresgegevens", agg);
		}
		
		String naam = request.getParameter("naam");
		String adres = request.getParameter("adres");
		String postcode = request.getParameter("postcode");
		String telNr = request.getParameter("telNr");
		
		agg.setNaam(naam);
		agg.setAdres(adres);
		agg.setPostcode(postcode);
		agg.setTelNr(telNr);
		
		session.setAttribute("adresgegevens", agg);
		request.setAttribute("adresgegevens", agg);
		
		
		if(agg.nameValid() && agg.adresValid() && agg.postcodeValid() && agg.telNrValid()){
			doGet(request, response);			
		}
		else{
			request.getRequestDispatcher("/WEB-INF/adresgegevens.jsp").forward(request, response);
		}		
			
	}
	


}
