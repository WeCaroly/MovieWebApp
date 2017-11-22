<%--
  Created by IntelliJ IDEA.
  User: Jordan Fay
  Date: 11/20/2017
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%><%--
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
    </style>
</head>
<body style="background-color: #2E2E2E; margin: 0;">
<div style="background-color: black; ">
      <div class = "Menu" style="display: block; background-color: black; padding-top: 20px; padding-bottom: 20px;">
        <h1 style = "float: right; color: white; margin: 0;">Fifth Brick Inc.</h1>
        <a href="WatchlistPage.jsp">My Watchlist   |</a>
        <a href="profile.jsp">My Profile   |</a>
        <a href="search.jsp" style="font-weight: bold;">Search Movies   |</a>
        <a href="login.jsp">Log Out</a>
    </div>
</div>
<hr>
<h1 style="text-align: center; font-size: 64px; color: white; font-family: Helvetica;">Search Movies </h1>
<hr>
<div class = "search" style=" padding-top: 20px; margin-left: 10px; margin-right: 10px;">
<input type="text" name="search" placeholder="Search" style="width: 100%; height: 30px;">
</div>
</body>
</html>
