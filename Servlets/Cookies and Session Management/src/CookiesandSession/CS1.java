/* Create a Servlet that recognizes the first time visitor to a web application and responds by saying "Welcome, you are visiting for the first time, you are visiting for the first time".

When the page is visited for the second time, it should say 'Welcome Back'.*/
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
 * Servlet implementation class CS1
 */
@WebServlet("/CS1")
public class CS1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Cookie[] cookies = req.getCookies();
		
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("testCookie")) {
					out.println("Welcome back");
					break;
				}		
			}
			//out.println("Welcome back");
		} else {
			Cookie testCookie = new Cookie("testCookie", "cookieValue");
			resp.addCookie(testCookie);
			out.println("Welcome, you are visiting for the first time");
		}
		
		out.close();
	}


}
