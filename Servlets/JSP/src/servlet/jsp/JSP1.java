package servlet.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;

/*
Create a HTML Page, which asks the user to enter a number in a textbox. 
On clicking the submit button, it places the request to a Servlet. 
The Servlet generates all Prime numbers which are less than the given 
number and adds them to an ArrayList and forwards the control to a JSP page. 
The JSP page iterates through the ArrayList and prints them in a tabular format.
 */


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSP1
 */
@WebServlet("/JSP1")
public class JSP1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int number = Integer.parseInt(request.getParameter("number"));
		
		ArrayList<Integer> primeList = new ArrayList<>();
		
		for (int i = 1; i < number; i++) {
			if (isPrime(i))
				primeList.add(i);
		}

		request.setAttribute("primeList", primeList);
		request.getRequestDispatcher("JSP1.jsp").forward(request, response);
		
		out.close();
	}
	
	public static boolean isPrime (int input1) {
		if (1 == input1) return false;
		
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
