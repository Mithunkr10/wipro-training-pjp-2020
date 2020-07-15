package com.login.module;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.Util.DBUtil;

@WebServlet("/Newuser")
public class Newuser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String pass=request.getParameter("pswd");
		if(DBUtil.newuser(name, pass))
		{	request.setAttribute("name", name);
			request.getRequestDispatcher("newuser.jsp").forward(request, response);
			
		}
		else
		{
			pw.println("Could not change password!");
			request.getRequestDispatcher("newuser.html").include(request, response);
		}
	}

}
