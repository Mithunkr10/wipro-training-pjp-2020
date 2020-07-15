/* Write a servlet to show all the parameters sent to the servlet via either GET or POST.
Note: consider all types of form fields.
*/
package GetPost;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetPost2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub doPost(request,response);
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * }
	 */

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();

		Enumeration <String> hname=request.getParameterNames();
		
		while(hname.hasMoreElements())
		{
			String h=hname.nextElement();
			String v[]=request.getParameterValues(h);
			p.println(h+":");
			for(int i=0;i<v.length;i++)
			p.println(v[i]+"<br>");
		}
		p.close();
	}

}
