<%@ page import="appLayer.watchList" %>
<%@ page import="webapp.models.movieModel" %>
<%@ page import="java.util.ArrayList" %><%--
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
<%@page language="java" session="true" %>
<!DOCTYPE html>
<html>
<head>
    <script>
        function myFunction() {
            // Declare variables
            var input, filter, table, tr, td, i;
            input = document.getElementById("myInput");
            filter = input.value.toUpperCase();
            table = document.getElementById("myTable");
            tr = table.getElementsByTagName("tr");

            // Loop through all table rows, and hide those who don't match the search query
            for (i = 0; i < tr.length; i++) {
                td = tr[i].getElementsByTagName("td")[0];
                if (td) {
                    if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                        tr[i].style.display = "";
                    } else {
                        tr[i].style.display = "none";
                    }
                }
            }
        }
    </script>
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
        img{
            display:block;
            margin: 0 auto;
        }
        table{
            color: white;
            text-align: center;
            border-collapse: collapse;
            width: 40%;
            margin: 0 auto;
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
<div class = "search" style=" padding-top: 20px; padding-bottom: 30px;  margin-left: 10px; margin-right: 10px;">
<input type="text" name="search" id="myInput" onkeyup="myFunction()"placeholder="Search" style="width: 100%; height: 30px;">
</div>

<%
    if(session.getAttribute("MySession") == null){
        response.sendRedirect("login.jsp");
    }

    watchList wl = new watchList();
    ArrayList<movieModel> MyList = wl.getMovies();
    int x = 0;
    int maxNew = MyList.size();
%>
<table id="myTable">
            <%
        while(x<maxNew) {
            %>

    <tr id="<%=x%>Tab" >
        <td style="border:solid white 3px;">
        <p><b style = "font-size:30px"> <%=MyList.get(x).getTitle()%></b></p>
            <hr style="width: 40%">
        <p><b style = "font-size:20px">Plot Preview:</b></p>
        <p><%=MyList.get(x).getDescription()%></p>
            <form action="/search" method="post">
                <div style="text-align:center;">
                    <input name="addBtn" value="<%=MyList.get(x).getIdmovie()%>" style="height: 0; width:0; visibility: hidden"/>
                    <input class="button" type="submit" value="Add to Watchlist" style="color:black; background-color:white; font-size: 24px;"/>
                </div>
                </form>
        </td>
    </tr>

    <tr>
        <td>
            <br>
        </td>
    </tr>

    <%
            x++;
        }
    %>
</table>
</body>
</html>
