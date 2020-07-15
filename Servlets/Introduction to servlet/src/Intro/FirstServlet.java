 //Write a servlet to display “My First Servlet program” on browser.
 package Intro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		p.println("<html>");
	//	p.println("<head> Intro to Servlets. <head>");
		p.println("<body> <h3> My First Servlet Program </h3></<body></html>");
		p.close();
	}

}
