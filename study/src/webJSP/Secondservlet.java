package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class Secondservlet extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println("두번째 서블릿");
	resp.setContentType("text/html;charset=UTF-8");
	PrintWriter out = resp.getWriter();
	out.print("<HTML>");
	out.print("<head><title>Reqeust 정보출력 </title></head>");
	out.print("<body>");
	out.print("<h1>네트워크 관련 정보</h1>");
	out.print("request Scheme : "+ req.getScheme() +"<BR/>");
	out.print("server Address : "+ req.getLocalAddr()+"<BR/>");
	
	out.print("<h2>손님 관련 정보</h2>");
	out.print("<p>Request URI : "+req.getRequestURI()+"<BR/>");
	out.print("Request URL : "+req.getRequestURL()+"<BR/>");
	out.print("Context path : "+req.getContextPath()+"<BR/>");
	out.print("clint Address : "+req.getLocalAddr()+"<BR/>");
	out.print("</p>");
	out.print("</body></HTML>");
	out.close();
}
}
