<%--
  Created by IntelliJ IDEA.
  User: carol_8wybosj
  Date: 10/17/2017
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <style>
        a {
             padding: 10px;
             padding-top: 20px;
             padding-bottom: 20px;
             width: 100%;
             font-size: 32px;
             color: white;
             text-decoration: none;

        }
        .box{
            border: solid white 3px;
            border-radius: 15px;
            text-align: center;
            margin: 0 auto;
            width: 35%;
        }
    </style>
</head>
<body style="background-color: #2E2E2E; margin: 0;">
<div style="background-color: black; ">
        <div class = "Menu" style="display: block; background-color: black; padding-top: 20px; padding-bottom: 20px;">
            <h1 style = "float: right; color: white; margin: 0;">Fifth Brick Inc.</h1>
                 <a href="WatchlistPage.jsp">My Watchlist   |</a>
                 <a href="profile.jsp" style="font-weight: bold;">My Profile   |</a>
                 <a href="search.jsp">Search Movies   |</a>
                 <a href="login.jsp">Log Out</a>
        </div>
</div>
<hr>
<h1 style="text-align: center; font-size: 64px; color: white; font-family: Helvetica;">My Profile</h1>
<hr>

<div class="box">
    <hr>
    <h1 style="text-align: center; font-size: 64px; color: white; font-family: Helvetica;">Profile Information</h1>
    <hr>

    <!--form action="WatchlistPage.jsp?reqType=register" method="post" style="font-size: 24px; font-family: Helvetica;"!-->
    <form action="/register" method="post" style="font-size: 24px; font-family: Helvetica; color: white; padding-top: 20px;">

        <div class="information" style="text-align: center; font-family: Helvetica;">
            First name:&nbsp;<input type="text" name="fname"  style="width: 300px; height: 40px; border: solid white;" />
            <br/><br/>
            Last name:&nbsp;<input type="text" name="lname"style="width: 302px; height: 40px; border: solid white;" />
            <br/><br/>
            Username:&nbsp;<input type="text" name="uname"style="width: 302px; height: 40px; border: solid white;" />
            <br/><br/>
            &nbsp;Password:&nbsp;<input type="password" name="pass"style="width: 305px; height: 40px; border: solid white;"/>
            <br/><br/>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Age:&nbsp;<input type="number" name="age" min="1" max="105" style="width: 300px; height: 40px; border: solid white;"/>
            <br/><br/>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email:&nbsp;<input type="text" name="ename" style="width: 300px; height: 40px; border: solid white;"/>
            <br/><br/>
            <h4>Would you like to get email?</h4>
            <input type="checkbox" name="reciveEmail" style="width: 30px; height: 20px; border: solid white;" /> Yes

            <br/>
            <p>
                <input type="submit" value="Update Profile Information" style="cursor: pointer; font-size: 24px;"/>
                    <form action="WatchlistPage.jsp" method="get">
                        <input type="submit" value="Cancel" style="cursor: pointer; font-size: 24px;"/>
                   </form>
            </p>
        </div>
    </form>
</div>
</body>
</html>
