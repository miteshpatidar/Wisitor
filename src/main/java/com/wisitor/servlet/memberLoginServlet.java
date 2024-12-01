package com.wisitor.servlet;

import com.wisitor.dao.VisitorDao;
import jakarta.servlet.http.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.wisitor.entities.*;

import com.wisitor.dao.UserDao;

/**
 * Servlet implementation class memberLoginServlet
 */
@WebServlet("/memberLoginServlet")
public class memberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public memberLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String memberemail = request.getParameter("memberemail");
		UserDao dao = new com.wisitor.dao.UserDao(com.wisitor.helper.ConnectionProvider.getConnection());
		Usermember usermember = dao.getUsermember(memberemail);
		
		if(usermember==null) {
		
			response.sendRedirect("memberRegister.jsp");
		}
		else {
		
		VisitorDao obj = new VisitorDao(com.wisitor.helper.ConnectionProvider.getConnection());
		java.sql.ResultSet rs = obj.getVisitor(memberemail);
		
		//check the column name of result
		ResultSetMetaData rsmd;
		try {
			rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++) {
			    System.out.println("Column " + i + ": " + rsmd.getColumnName(i));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		HttpSession session = request.getSession();
		session.setAttribute("usermember", usermember);
		session.setAttribute("visitordata", rs);
		//request.setAttribute("usermember", usermember);
		jakarta.servlet.RequestDispatcher rd = request.getRequestDispatcher("memberhome.jsp");
		rd.forward(request, response);
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
