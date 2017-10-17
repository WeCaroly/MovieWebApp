<html>
<head>
    <title>Registration Page</title>
</head>
<body style="background-color: #2E2E2E; position: fixed; top: 40%; left: 50%; transform: translate(-50%, -50%);">

<div class="box" style="background-color: white; border-radius: 50px;">
<h1 style="text-align: center; font-size: 64px; font-family: Helvetica;">Registration Details</h1>

<form action="WatchlistPage.jsp?reqType=register" method="POST" style="font-size: 24px; font-family: Helvetica;">
    <div class="information" style="text-align: center;">
        First name:&nbsp;<input type="text" name="fname" style="width: 300px; height: 40px; border: solid black;" />
        <br/><br/>
        Last name:&nbsp;<input type="text" name="lname"style="width: 302px; height: 40px; border: solid black;" />
        <br/><br/>
        Username:&nbsp;<input type="text" name="uname"style="width: 302px; height: 40px; border: solid black;" />
        <br/><br/>
        &nbsp;Password:&nbsp;<input type="password" name="pass"style="width: 305px; height: 40px; border: solid black;"/>
        <br/><br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Age:&nbsp;<input type="number" name="age" min="1" max="105" style="width: 300px; height: 40px; border: solid black;"/>
        <br/><br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email:&nbsp;<input type="text" name="ename" style="width: 300px; height: 40px; border: solid black;"/>   
        <br/><br/>
        <h4>Would you like to get email?</h4>
        <input type="checkbox" name="reciveEmail" style="width: 30px; height: 20px; border: solid black;" /> Yes

        <br/>
        <p><input type="image" value="Submit" src="http://www.pngmart.com/files/3/Submit-Button-Transparent-PNG.png"
        	style="width: 200px; padding-bottom: 50px;"/></p>
    </div>
</form>
</div>
</body>
<style>
body{
	background-color: #ECE8E8;
    width: 700px;
    border: 15px solid #F51616;
    border-radius: 15px;
}
</style>
</html>