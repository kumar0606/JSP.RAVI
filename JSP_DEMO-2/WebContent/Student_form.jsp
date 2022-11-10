<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FILL THE STUDENT FORM</title>
</head>
<body style="background-color:powderblue">
<H1>FILL THE STUDENT FORM</H1>
<form action="student_response.jsp">
FIRSTNAME:<input type="text" name="firstname"><br></br>
LASTNAME:<input type="text" name="lastname"><br></br>
SELECTBRANCH:<br></br>
<select name="branch"><br></br>
<option>MECHANICAL</option><br></br>
<option>CIVIL</option><br></br>
<option>ELECTRICAL</option><br></br>
<option>COMPUTERS</option><br></br>

</select><br></br>
CHOSE COLLEGE:<br></br>
<input type="checkbox" name="clg" value="sivani">sivani<br></br>
<input type="checkbox" name="clg" value="sistam">sistam<br></br>
<input type="checkbox" name="clg" value="aitam">aitam<br></br>
<input type="checkbox" name="clg" value="gmrit">gmrit<br></br>
SELECT GENDER:<br></br>
<input type="radio" name="radio" value="MALE">MALE<br></br>
<input type="radio" name="radio" value="FEMALE">FEMALE<br></br>
ENTER DATE OF BIRTH:<br></br>
<label  for="birthday" >BirthDay:</label>
<input type="date" id="birthdate" name="dob"><br></br>
ENTER PHONE NUMBER:<br></br>
<label for="phone">ENTER NUMBER</label>
<input type="tel" name="phone" id="phone"><br></br>
ENTER EMAIL:<br></br>
<label for="mail"> ENTER MAIL</label>
<input type="gmail" id="gmail" name="mail"><br></br>
<input type="submit" value="SUBMIT"><br></br>


</input>
</form>
</body>
</html>