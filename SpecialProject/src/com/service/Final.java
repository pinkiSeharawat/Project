package com.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.PersonalInfo;
import com.DAO.PersonalInfoDBAccess;

/**
 * Servlet implementation class Final
 */
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Final() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session=request.getSession();
		PersonalInfoDBAccess personalInfoDB= new PersonalInfoDBAccess();
        PersonalInfo personalInf=new PersonalInfo();
        personalInf=(PersonalInfo)session.getAttribute("personalInfo");
		PersonalInfoDBAccess dbc=new PersonalInfoDBAccess();
		int id=0;
		try {
			
		id=	dbc.getId();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		personalInf.setId(id);
        dbc.insertPersonalDetails(personalInf);
    	
        session.setAttribute("sessionId", id);
        
        response.sendRedirect("final.jsp");  
	}

}
