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
	System.out.println("�ι�° ����");
	resp.setContentType("text/html;charset=UTF-8");
	PrintWriter out = resp.getWriter();
	out.print("<HTML>");
	out.print("<head><title>Reqeust ������� </title></head>");
	out.print("<body>");
	out.print("<h1>��Ʈ��ũ ���� ����</h1>");
	out.print("request Scheme : "+ req.getScheme() +"<BR/>");
	out.print("server Address : "+ req.getLocalAddr()+"<BR/>");
	
	out.print("<h2>�մ� ���� ����</h2>");
	out.print("<p>Request URI : "+req.getRequestURI()+"<BR/>");
	out.print("Request URL : "+req.getRequestURL()+"<BR/>");
	out.print("Context path : "+req.getContextPath()+"<BR/>");
	out.print("clint Address : "+req.getLocalAddr()+"<BR/>");
	out.print("</p>");
	out.print("</body></HTML>");
	out.close();
}
}
