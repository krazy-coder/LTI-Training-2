package com.first.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet")                                    //IF NOT USING THIS THEN USE LEGACY APPROACH IN web.xml
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String str = "";
		out.println("<html>");
		out.println("<head>");
		out.println("<title> First Servlet </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> My first Servlet D-: </h1>");
		out.println(str);
		out.println("</body>");
		out.println("</html>");
		
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		
//		if(uname.equals("aaryan") && pass.equals("123456")) {
//			RequestDispatcher rd = request.getRequestDispatcher("Welcome");
//			rd.forward(request, response);
//			HttpSession	s = request.getSession();
//			s.setAttribute("name", "uname");
//		} else {
//			str = "Incorrect Login";
//			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
//			rd.include(request, response);
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
