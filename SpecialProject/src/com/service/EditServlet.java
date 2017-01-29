package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.PersonalInfo;
import com.DAO.InformationDBAccess;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String customerName=request.getParameter("userName");
		String mobileNumber=request.getParameter("mobileNumber");
		int numberOfTimesRepaired=(Integer.parseInt(request.getParameter("numberOfTimesRepaired")));
		Double totalamount=(Double.parseDouble(request.getParameter("totalAmount")));
		String serialNumber=request.getParameter("serialNumber");
		
		PersonalInfo personal=new PersonalInfo();
		
		personal.setCustomerName(customerName);
		personal.setMobileNumber(mobileNumber);
		personal.setNumberOfTimesRepaired(numberOfTimesRepaired);
		personal.setTotalAmount(totalamount);
		personal.setSerialNumber(serialNumber);
		
		int status=InformationDBAccess.update(personal);
		
		if(status>0){  
		    response.sendRedirect("completeDetail.jsp");  
		}else{  
		    out.println("Sorry! unable to update record");  
		}  
		 
		
		
	}
}



/*String sid=request.getParameter("id");  
int id=Integer.parseInt(sid);  
String name=request.getParameter("name");  
String password=request.getParameter("password");  
String email=request.getParameter("email");  
String country=request.getParameter("country");  
  
Emp e=new Emp();  
e.setId(id);  
e.setName(name);  
e.setPassword(password);  
e.setEmail(email);  
e.setCountry(country);  
  
int status=EmpDao.update(e);  
if(status>0){  
    response.sendRedirect("ViewServlet");  
}else{  
    out.println("Sorry! unable to update record");  
}  
  
out.close();  
}  

}*/  