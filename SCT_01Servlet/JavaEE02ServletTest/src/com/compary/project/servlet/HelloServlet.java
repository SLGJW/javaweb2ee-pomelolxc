package com.compary.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");//设置服务器给客户端响应的内容类型，指定编码方式解决返回给客户端中文乱码的问题
        request.setCharacterEncoding("UTF-8");//解决Post请求的中文乱码问题

		String tel = request.getParameter("tel");
		String bir = request.getParameter("bir");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		PrintWriter out = response.getWriter();
		out.println("学号:" + tel + "<br />");
		out.println("生日:" + bir + "<br />");
		out.println("姓名:" + name + "<br />");
		out.println("性别:" + sex + "<br />");
		

		String[] active = request.getParameterValues("active");

		out.println("爱好:" +"<br />");
		for (String string : active) {
			out.println( string);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
