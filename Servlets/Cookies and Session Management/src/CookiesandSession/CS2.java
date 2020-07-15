/* Display all the cookies available for the given application in a tabular format.
If there are no cookies available with the application, display  “No Cookies”.*/
package CookiesandSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CS2
 */
@WebServlet("/CS2")
public class CS2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Cookie[] cookies = req.getCookies();
		
		if (cookies != null) {
			out.println("<h1>List of cookies</h1>");
			out.println("<table border='1'>");
			for (int i = 0; i < cookies.length; i++) {
				out.println("<tr>");
				out.println("<td>" + cookies[i].getName() + "</td>");
				out.println("<td>" + cookies[i].getValue() + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} else {
			out.println("No Cookies");
		}
		
		out.close();
	}


}
