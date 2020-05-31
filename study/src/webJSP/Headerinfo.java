package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/info")
public class Headerinfo extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Request all info</title></head>");
		out.print("<body>");
		Enumeration<String> em = req.getHeaderNames();
		while(em.hasMoreElements()) {
			String s =em.nextElement();
			out.println(s+" : "+req.getHeader(s)+"<br/>");
		}
		
		out.print("<h2> �ٸ� ���� </h2>");
		out.print("��û�� ��� :"+req.getMethod() + "<br/>");
		out.print("?�������� ���� ������ ��� :"+req.getQueryString() +"<br/>");
		
		out.print("</body></html>");
		out.close(); //�ڿ�����
		
	}
}
