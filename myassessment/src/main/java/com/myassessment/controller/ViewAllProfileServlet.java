package com.myassessment.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myassessment.entity.MyWebEntity;
import com.myassessment.service.MyWebService;
import com.myassessment.service.MyWebServiceInterface;


public class ViewAllProfileServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s=request.getSession(true);
		Object oo=s.getAttribute("id");
		String email=oo.toString();
		
		MyWebEntity m=new MyWebEntity();
		m.setEmail(email);
		
		MyWebServiceInterface ms=new MyWebService();
		List<MyWebEntity> mm=ms.viewallprofile(m);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body><center>");
				for(MyWebEntity mm1:mm) {
					out.println("Name is "+mm1.getName());
					out.println("<br>Password is "+mm1.getPassword());
					out.println("<br>Email is "+mm1.getEmail());
					out.println("<br>Address is "+mm1.getAddress());
				}
				
		out.println("</center></body></html>");
	}

}
