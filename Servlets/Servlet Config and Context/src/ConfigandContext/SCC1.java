//Write a Servlet Program that prints the Servlet Config and Servlet Context Parameters
package ConfigandContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SCC1
 */
@WebServlet("/SCC1")
public class SCC1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		      
		    ServletConfig config=getServletConfig();  
		    String driver=config.getInitParameter("driver");  
		    out.print("Driver is: "+driver);  
		          
		    out.close();
	}

	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub doGet(request, response); }
	 */

}
