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
		response.setContentType("text/html;charset=UTF-8");//���÷��������ͻ�����Ӧ���������ͣ�ָ�����뷽ʽ������ظ��ͻ����������������
        request.setCharacterEncoding("UTF-8");//���Post�����������������

		String tel = request.getParameter("tel");
		String bir = request.getParameter("bir");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		PrintWriter out = response.getWriter();
		out.println("ѧ��:" + tel + "<br />");
		out.println("����:" + bir + "<br />");
		out.println("����:" + name + "<br />");
		out.println("�Ա�:" + sex + "<br />");
		

		String[] active = request.getParameterValues("active");

		out.println("����:" +"<br />");
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
