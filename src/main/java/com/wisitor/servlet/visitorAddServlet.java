package com.wisitor.servlet;

import 	com.wisitor.entities.Visitormember;
import com.wisitor.helper.ConnectionProvider;
import 		com.wisitor.dao.VisitorDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class visitorAddServlet
 */
@WebServlet("/visitorAddServlet")
public class visitorAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public visitorAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String visitorname = request.getParameter("visitorname");
		String visitorphone= request.getParameter("visitorphone");
		String visitorpurpose= request.getParameter("visitorpurpose");
		String memberemail= request.getParameter("memberemail");
		
		Visitormember visitormember = new Visitormember(visitorname,visitorphone,visitorpurpose,memberemail);
		VisitorDao dao = new VisitorDao(ConnectionProvider.getConnection());
		dao.saveVisitor(visitormember);
		request.setAttribute("visitordata", dao);
		jakarta.servlet.RequestDispatcher rd = request.getRequestDispatcher("memberLoginServlet");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
