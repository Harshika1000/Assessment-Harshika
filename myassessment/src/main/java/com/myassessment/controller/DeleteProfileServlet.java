package com.myassessment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myassessment.entity.MyWebEntity;
import com.myassessment.service.MyWebService;
import com.myassessment.service.MyWebServiceInterface;

public class DeleteProfileServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s=request.getSession(true);
		Object oo=s.getAttribute("id");
		String email=oo.toString();
		
		MyWebEntity m=new MyWebEntity();
		m.setEmail(email);
		
		MyWebServiceInterface ms=new MyWebService();
		int mm=ms.deleteprofile(m);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body><center>");
				if(mm>0) {
					out.println("profile deleted  ");
					
				}
				else {
					out.println("could not delete record");
				}
		out.println("</center></body></html>");
	}

}