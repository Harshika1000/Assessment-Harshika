package com.myassessment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myassessment.entity.MyWebEntity;
import com.myassessment.service.MyWebService;
import com.myassessment.service.MyWebServiceInterface;


public class RegistrationServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nm");
		String password=request.getParameter("pass");
		String email=request.getParameter("em");
		String address=request.getParameter("ad");
		
		MyWebEntity w=new MyWebEntity();
		w.setAddress(address);
		w.setEmail(email);
		w.setPassword(password);
		w.setName(name);
		
		MyWebServiceInterface ms=new MyWebService();
		int i=ms.createProfileService(w);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body><center>");
			if(i>0) {
				out.println("Profile created <a href=login.html>Sign In</a>");
			}
			else {
				out.println("could not create profile");
			}
		out.println("</center></body></html>");
		
	}

}
