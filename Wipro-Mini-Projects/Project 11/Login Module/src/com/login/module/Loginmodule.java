package com.login.module;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.Util.DBUtil;

public class Loginmodule extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String pass=request.getParameter("pswd");
		if(DBUtil.validate(name, pass))
		{	request.setAttribute("name", name);
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}
		else
		{
			pw.println("Incorrect Username or password!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		pw.close();
	}

}
