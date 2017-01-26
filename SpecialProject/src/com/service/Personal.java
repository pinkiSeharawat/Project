package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.PersonalInfo;
import com.DAO.PersonalInfoDBAccess;

/**
 * Servlet implementation class personal
 */
public class Personal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Personal() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
//        double id=0;
		
//		PersonalInfoDBAccess dbc=new PersonalInfoDBAccess();
//		try {
//			
//		id=	dbc.getId();
//		} catch (SQLException e1) {
//			
//			e1.printStackTrace();
//		}
        
       // id=Math.random();
		
		HttpSession session=request.getSession();
//		session.setAttribute("sessionId",id);
		
		PersonalInfo personalInfo=new PersonalInfo();
		//personalInfo.setId(id);
		personalInfo.setCustomerName(request.getParameter("userName"));
		personalInfo.setCustomerEmailId(request.getParameter("userEmail"));
		personalInfo.setMobileNumber(request.getParameter("mobileNumber"));
		personalInfo.setAddress(request.getParameter("address"));
		personalInfo.setModelNumber(request.getParameter("modelNumber"));
		personalInfo.setSerialNumber(request.getParameter("serialNumber"));
		personalInfo.setPurchaseDate(Date.valueOf(request.getParameter("purchaseDate")));
		personalInfo.setWarrentyDate(Date.valueOf(request.getParameter("warrentyDate")));
		personalInfo.setDamagePartName(request.getParameter("damagePartName"));
		personalInfo.setNumberOfTimesRepaired(Integer.parseInt(request.getParameter("numberOfTimesRepaired")));
		personalInfo.setAMC(Double.parseDouble(request.getParameter("amc")));
		personalInfo.setTotalAmount(Double.parseDouble(request.getParameter("totalAmount")));
		
		//PersonalInfoDBAccess personalInfoDB = new PersonalInfoDBAccess();
      //  personalInfoDB.insertPersonalDetails(personalInfo);
		session.setAttribute("personalInfo", personalInfo);
        
        System.out.println("goyyyy");
        response.sendRedirect("ReviewPage.jsp"); 
        
	}

}
