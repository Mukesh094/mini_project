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


@WebServlet("/verifyLogin")
public class VerifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public VerifyController() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		 String password=request.getParameter("password");
		 DAOService service=new DAOServiceImpl();
		 service.connectDB();
		 boolean status=service.verifyCredential(email, password);
		 if(status) {
			 RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/view.jsp");
			 rd.forward(request, response);
		 }else {
			 request.setAttribute("Error", "----INVALID ID/PASS---");
				RequestDispatcher rd=request.getRequestDispatcher("prac.jsp");
				rd.forward(request, response);
		 }
	}

}
