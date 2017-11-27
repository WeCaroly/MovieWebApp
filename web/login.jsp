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
	<style>
		.login{
            border: solid white 3px;
			border-radius: 15px;
			background-color: #2E2E2E;
			padding-right: 50px;
			padding-left: 50px;
			padding-top: 50px;
			padding-bottom: 50px;
			top: 40%;
			left: 50%;
			transform: translate(-50%, -50%);
			position: fixed;
		}
		body{
			background-color: #2E2E2E;
			margin: 0;
		}
	</style>
</head>
<body>
	<div class = "Menu" style="display: block; background-color: black; padding-bottom: 80px;">
		<h1 style = "float: right; color: white; padding-top: 20px; margin: 0;">Fifth Brick Inc.</h1>
	</div>
	<div class="Login">
        <hr>
        <h1 style="text-align: center; font-size: 64px; color: white; font-family: Helvetica;">Log In</h1>
        <hr>

		<form action="/login" method="post" style="font-size: 24px; color: white; padding-top: 20px;">
    		User-name:&nbsp;<input type="text" name="loginname"  value="${applicationScope.username}" style="width: 300px; height: 40px; border: solid white;"/>
    		<br><br>
   			 &nbsp;&nbsp;Password:&nbsp;<input type="password" name="password" style="width: 301px; height: 40px; border: solid white;"/>
   			 <br><br>
			<p style="color: red; font-size: 20px; text-align: center;">${errorMessage}</p>
    		<div style="text-align:center;">
        		<input type="submit" value="Submit" style="cursor: pointer; font-size: 24px;"/>
        		</div>
		</form>



    	<form action="registrationPage.jsp" method="get">
    		<div style="text-align: center;">
    	   		<input type="submit" value="Do not have an account? Register now!" style="cursor: pointer; text-align: center; font-size: 24px;" src="registrationPage.jsp"/>
    	   </div>
    	</form>
</div>

</body>
</html>
