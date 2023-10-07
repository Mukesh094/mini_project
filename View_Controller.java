package com.jsp_Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp_mvc_modelLayer.DAOService;
import jsp_mvc_modelLayer.DAOServiceImpl;


@WebServlet("/view")
public class View_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/view.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String mobno=request.getParameter("mobno");
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		service.view(name,age,city,email,mobno);
		request.setAttribute("msg", "Your Record is Saved...!!");
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/view.jsp");
		rd.forward(request, response);
	}

}
