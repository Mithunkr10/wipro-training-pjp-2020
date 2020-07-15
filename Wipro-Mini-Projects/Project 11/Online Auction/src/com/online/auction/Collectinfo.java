package com.online.auction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Collectinformation", urlPatterns = { "/Collectinformation" })
public class Collectinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter p=response.getWriter();
			String item_id=request.getParameter("item_id");
			String uname=request.getParameter("uname");
			String item_name=request.getParameter("item_name");
			String email=request.getParameter("email_id");
			String bid_amt=request.getParameter("bid_amt");
			float b_amt=Float.parseFloat(bid_amt);
			request.setAttribute("item_id", item_id);
			request.setAttribute("uname", uname);
			request.setAttribute("item_name", item_name);
			request.setAttribute("email",email);
			request.setAttribute("bid_amt", b_amt);
			request.getRequestDispatcher("displaycontent.jsp").forward(request, response);
			p.close();
			
		}
	}

