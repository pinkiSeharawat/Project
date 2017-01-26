<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href='css\third.css' type='text/css' rel='stylesheet'/>
</head>
<body>
<div>
<h1> your form is successfully submitted</h1>
<h2>your registration id is  </h2>
<%   
out.println(session.getAttribute("sessionId"));  %>
</div>
<button value="GoToHomePage"><a href="StartingPage.html" style=" color:green; text-align:center; text-decoration: none;">Go To Home Page</a></button>
<button value="submit"><a href="completeDetail.jsp" style=" color:green; text-align:center; text-decoration: none;">submit</a></button>
</body>
</html>