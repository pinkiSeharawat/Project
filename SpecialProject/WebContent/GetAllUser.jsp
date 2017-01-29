<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "com.PersonalInfo" %> 
<%  PersonalInfo personal=(PersonalInfo)session.getAttribute("personalInfo"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href='css\second.css' type='text/css' rel='stylesheet'/>
</head>
<body>
<h1 align="center">SM Electronics Company</h1>


<table>
<tr><th>Id</th><th>Name</th><th>EmailId</th><th>Mobile Number</th><th>Address</th>  
<th>Model Number</th><th>Serial Number</th><th>Damage Part Name</th><th>Total Amount</th>
<th>NumberOfTimesRepaired</th><th>Purchase Date</th><th>Warrenty Date</th><th>AMC</th></tr>

<tr>

<td><%=personal.getId() %></td><td><%=personal.getCustomerName() %></td><td><%=personal.getCustomerEmailId() %></td>
<td><%=personal.getMobileNumber() %></td><td><%=personal.getAddress() %></td><td><%=personal.getModelNumber() %></td>
<td><%=personal.getSerialNumber() %></td><td><%=personal.getDamagePartName() %></td><td><%=personal.getTotalAmount() %></td>
<td><%=personal.getNumberOfTimesRepaired() %></td><td><%=personal.getPurchaseDate() %></td><td><%=personal.getWarrentyDate() %></td>
<td><%=personal.getAMC() %></td>

</tr>

</table>>

</body>
</html>