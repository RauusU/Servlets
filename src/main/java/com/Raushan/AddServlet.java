package com.Raushan;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import javax.servlet.http.HttpServlet;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		
		
		
		//Session Management 
		req.setAttribute("k",k);
		
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
		
	}
	
	
	
}



//query string url => http://localhost:8080/DemoApp/add?num1=3&num2=2

