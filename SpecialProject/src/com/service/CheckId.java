package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.PersonalInfoDBAccess;

public class CheckId extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public CheckId() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		PersonalInfoDBAccess dbAccess=new PersonalInfoDBAccess();
		int id=Integer.parseInt(request.getParameter("userId"));
		
		try {
			if(dbAccess.checkId(id)==1)
			{
				
				UserDetails userDetail = new UserDetails();
				userDetail.doPost(request, response);
			 }
			else
			{ 
				response.sendRedirect("UserNotFound.jsp");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		
	} 
}

