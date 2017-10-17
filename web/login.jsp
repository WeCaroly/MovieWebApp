<%--
  Created by IntelliJ IDEA.
  User: carol_8wybosj
  Date: 9/12/2017
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In</title>
</head>
<body style="background-color: #2E2E2E; position: fixed; top: 40%; left: 50%; transform: translate(-50%, -50%);  border-radius: 15px;">
<div style="border: 10px solid #F51616; border-radius: 15px; background-color: aliceblue; padding-right: 50px; padding-left: 50px; padding-top: 5px; padding-bottom: 50px;">
	<h1 style="font-size: 64px; text-align: center; font-family: Helvetica;">Log In</h1>
		<form action="/login" method="post" style="font-size: 24px;">
    		User-name:&nbsp;<input type="text" name="loginname" style="width: 300px; height: 40px; border: solid black;"/>
    		<br><br>
   			 &nbsp;&nbsp;Password:&nbsp;<input type="text" name="password" style="width: 301px; height: 40px; border: solid black;"/>
   			 <br><br>
    		<div style="text-align:center;">
        		<input type="submit" value="Submit" src="http://www.pngmart.com/files/3/Submit-Button-Transparent-PNG.png" style="cursor: pointer; font-size: 24px;"/>
        		</div>
		</form>
    	<form action="registrationPage.jsp" method="get">
    		<div style="text-align: center;">
    	   		<input type="submit" value="Do not have an account? Register now!" style="cursor: pointer; text-align: center; font-size: 24px;" src="registrationPage.jsp"/>
    	   </div>
    	</form>
</div>
<p style="color: red">${errorMessage}</p>
</body>
</html>
v