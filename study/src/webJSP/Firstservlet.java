package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//제어의 역전 Ioc 개념. 서블릿은 개발자가아닌, 컨테이너가 순서를 제어한다.
public class Firstservlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init() 실행됨");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("service() 실행되었음.");
	}

}
