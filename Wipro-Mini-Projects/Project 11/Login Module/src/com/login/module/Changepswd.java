package com.login.module;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.Util.DBUtil;


@WebServlet("/Changepswd")
public class Changepswd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String pass=request.getParameter("pswd");
		String npswd=request.getParameter("npswd");
		if(DBUtil.changepswd(name, pass, npswd))
		{	request.setAttribute("name", name);
			request.getRequestDispatcher("changepswd.jsp").forward(request, response);
			
		}
		else
		{
			pw.println("Could not change password!");
			request.getRequestDispatcher("forgotpswd.html").include(request, response);
		}
	}
}
