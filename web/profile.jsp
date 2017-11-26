<%@ page import="webapp.models.userModel" %>
<%@ page import="appLayer.User" %><%--
  Created by IntelliJ IDEA.
  User: carol_8wybosj
  Date: 10/17/2017
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" session="true" %>
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
    <%


    %>

</div>
</body>
</html>
