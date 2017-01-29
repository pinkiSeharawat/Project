package com.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.PersonalInfo;
import com.DAO.InformationDBAccess;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	HttpSession session=request.getSession();
	PersonalInfo personalInfo=new PersonalInfo();
	
	String mobileNumber= request.getParameter("mobileNumber");
	String serialNumber= request.getParameter("serialNumber");
	
	InformationDBAccess.delete(mobileNumber,serialNumber);
	
	response.sendRedirect("Delete.jsp");
	
	}
}
