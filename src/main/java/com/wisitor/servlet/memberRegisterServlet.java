package com.wisitor.servlet;
import java.io.IOException;

import com.wisitor.dao.UserDao;
//import com.wisitor.entities.User;
import com.wisitor.entities.Usermember;
import com.wisitor.helper.ConnectionProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class memberRegisterServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public memberRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		java.io.PrintWriter out = response.getWriter();
		String check = request.getParameter("check");
		//check if user accepted condition
		if(check==null) {
			out.println("box not checked");
		}
		else {
			String membername = request.getParameter("membername");
			String memberemail = request.getParameter("memberemail");
			//String memberpassword = request.getParameter("memberpassword");
			String memberaddress = request.getParameter("memberaddress");
			String membercity = request.getParameter("membercity");
			String memberstate = request.getParameter("memberstate");
			String memberzip = request.getParameter("memberzip");
			String memberphone = request.getParameter("memberphone");

			//creating new user
			Usermember user = new Usermember(membername,memberemail,memberaddress,memberstate,membercity,memberzip,memberphone);

			//user dao
			UserDao userdao = new UserDao(ConnectionProvider.getConnection());
			if(userdao.saveUsermember(user)) {
				out.println("register execution done");
				response.sendRedirect("memberLogin.jsp");
			}
			else {
				out.println("error");
			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
