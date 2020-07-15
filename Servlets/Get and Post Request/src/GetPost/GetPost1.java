// Create a servlet that prints all the request headers it receives, along with their associated values.
package GetPost;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetPost1
 */
public class GetPost1 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		p.println("<html>");
		p.println("header<hr/>");
		Enumeration <String> hname=request.getHeaderNames();
		
		while(hname.hasMoreElements())
		{
			String h=hname.nextElement();
			String v=request.getHeader(h);
			p.println("Name:<em>"+h);
			p.println("</em>, Value:<em>"+v+"</em><br/>");
		}
		p.close();
		
	}

}
