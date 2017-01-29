package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.PersonalInfo;
import com.DAO.InformationDBAccess;
import com.DAO.PersonalInfoDBAccess;

/**
 * Servlet implementation class GetAllUserDetail
 */
@WebServlet("/GetAllUserDetail")
public class GetAllUserDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllUserDetail() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		
		List<PersonalInfo> personalInf=InformationDBAccess.getAllUser();
		
		
		for(PersonalInfo information:personalInf)
		{
			session.setAttribute("personalInf", information);
			response.sendRedirect("GetAllUser.jsp");
		}
	}

}

/*HttpSession session=request.getSession();  
int id= Integer.parseInt(request.getParameter("userId"));

PersonalInfoDBAccess personalInfoDB= new PersonalInfoDBAccess();
PersonalInfo personalInf=new PersonalInfo();
personalInf=personalInfoDB.getDetails(id);

session.setAttribute("personalInf", personalInf);
response.sendRedirect("fourth.jsp");*/
