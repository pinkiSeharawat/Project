<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import = "com.PersonalInfo" %> 
<%  PersonalInfo personal=(PersonalInfo)session.getAttribute("personalInf"); %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href='css\second.css' type='text/css' rel='stylesheet'/>


</head>
<body>
<h1 align="center"> User Details</h1>
<table border="1" cellspacing="2" cellpadding ="2" style="border:none;" >
<!-- <tr> -->
<!-- <th> Personal Information </th> </tr> -->
<!-- <caption>Customer Details</caption> </br></br> -->

<tr><td> Customer Name </td><td><%=personal.getCustomerName() %></td></tr>
<tr><td>Customer EmailId </td><td><%=personal.getCustomerEmailId()%></td></tr>
<tr><td>Mobile Number </td><td> <%=personal.getMobileNumber()%></td></tr>
<tr><td> Address  </td><td> <%=personal.getAddress() %> </td></tr>
<tr><td> Model Number </td><td> <%=personal.getModelNumber() %></td></tr>
<tr><td> Serial Number </td><td> <%=personal.getSerialNumber() %></td></tr>
<tr><td> Purchase Date </td><td> <%=personal.getPurchaseDate() %> </td></tr>
<tr><td>Warrenty Date </td><td> <%=personal.getWarrentyDate() %> </td></tr>
<tr><td> Damage Part Name </td><td> <%=personal.getDamagePartName() %></td></tr>
<tr><td> Number Of Times Repaired </td><td> <%=personal.getNumberOfTimesRepaired()%> </td></tr>
<tr><td> AMC </td><td> <%=personal.getAMC() %> </td></tr>
<tr><td> Total Amount </td><td> <%=personal.getTotalAmount() %> </td></tr> 

</table>

<!-- <a href="final.jsp">Submit</a> -->



</body>
</html>