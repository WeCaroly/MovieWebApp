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
<div class = "search" style=" padding-top: 20px; padding-bottom: 20px; margin-left: 10px; margin-right: 10px;">
<input type="text" name="search" placeholder="Search" style="width: 100%; height: 30px;">
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
<table>
    <td style ="padding-top: 5em; padding-bottom: 5em;  margin-left: 50px;">
            <%
        while(x<maxNew) {
            %>

    <td id="<%=x%>Tab" >
        <p><b style = "font-size:30px"> <%=MyList.get(x).getTitle()%></b></p>
        <p><b style = "font-size:20px">Plot Preview:</b></p>
        <p><%=MyList.get(x).getDescription()%></p>
        <!------------Button-------------------------------->
        <label class="btn" for="modal-<%=x%>.1" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Reviews</label>
        <input class="modal-state" id="modal-<%=x%>>.1" type="checkbox" />
        <div class="modal">
            <label class="modal__bg" for="modal-<%=x%>.1"></label>
            <div class="modal__inner" style="text-align: center">
                <label class="modal__close" for="modal-<%=x%>.1"></label>
                <h2 class="modal-title" style="color:black;">All Reviews</h2>
                <input type="text" id="output<%=x%>" style="width: 100%;">
            </div>
        </div>
        <label class="btn" for="modal-<%=x%>.2" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Add Review</label>
        <!-- Button!-->
        <input class="modal-state" id="modal-<%=x%>.2" type="checkbox" />
        <div class="modal">
            <label class="modal__bg" for="modal-<%=x%>.2"></label>
            <div class="modal__inner" style="text-align: center">
                <label class="modal__close" for="modal-<%=x%>.2"></label>
                <h2 class="modal-title" style="color:black;">Add Review</h2>

                <form action="/moviePage" method="post">
                    <textarea name="Text" id="input<%=x%>" cols="40" rows="5" placeholder="Write Review" style="width:100%; height: 70%;"></textarea>
                    <button type="button" onclick="copyText();" style="cursor: pointer; font-size: 24px;">Save Review</button>
                </form>
                <br/>
            </div>
        </div>
    </td>
    <br/>
    <%
            x++;
        }
    %>
</table>


</body>
</html>
