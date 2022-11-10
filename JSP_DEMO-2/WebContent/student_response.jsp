<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FILL THE STUDENT FORM</title>
</head>
<body style="background-color:pink">
<h1>STUDENT DETAILS</h1>
 <% 
 String fn=request.getParameter("firstname").toUpperCase();
 String ln=request.getParameter("lastname").toUpperCase();
 out.print(fn+" "+ln);
 %><br></br>
 <% String branch=request.getParameter("branch");
 out.print("BRANCH:"+branch);
 %><br></br>
 <%
 String cl=request.getParameter("clg");
 out.print("COLLEGE:"+cl); %><br></br>
 <%String g=request.getParameter("radio");
 out.print("GENDER :"+g);
 %><br></br>
 <% String dob=request.getParameter("dob");
 out.print("DOB:"+dob);
 %><br></br>
 <% String ph=request.getParameter("phone");
 out.print("phone number:"+ph);
 %><br></br>
 <% String mail=request.getParameter("mail");
 out.print("gmail:"+mail);
 %><br></br>
 <%
 out.print("<table border=2>");
 out.print("<tr>"+"<td>firstname</td>"+"<td>lastname</td>"+"<td>branch</td>"+"<td>clg</td>"+"<td>radio</td>"+"<td>dob</td>"+"<td>phone</td>"+"<td>mail</td>");
 out.print("<tr>"+"<td>"+fn+"</td>"+"<td>"+ln+"</td>"+"<td>"+branch+"</td>"+"<td>"+cl+"</td>"+"<td>" +g+"</td>"+"<td>"+dob+"</td>"+"<td>"+ph+"</td>"+"<td>"+mail+"</td>"+"</tr>");
 %>
</body>
</html>