package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//������ ���� Ioc ����. ������ �����ڰ��ƴ�, �����̳ʰ� ������ �����Ѵ�.
public class Firstservlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init() �����");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("service() ����Ǿ���.");
	}

}
