<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: carol_8wybosj
  Date: 9/12/2017
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index Page</title>
  </head>
  <body>
    Landing page -> add /login.jsp to the url and use the log in
    -> user, test
  <%
    Date date = new Date();
    out.print("<h2>" + " It is: "+ date.toString() +"</h2>");
  %>
  </body>
</html>
