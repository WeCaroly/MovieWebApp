<%@ page import="appLayer.watchList" %>
<%@ page import="webapp.models.movieModel" %>
<%@ page import="java.util.ArrayList" %>
<link  rel="stylesheet" href="watchlist.css">
<%@page language="java" session="true" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body style="background-color: #2E2E2E; margin: 0;">

    <div class = "Menu" style="display: block; background-color: black; padding-top: 20px; padding-bottom: 20px;">
        <h1 style = "float: right; color: white; margin: 0;">Fifth Brick Inc.</h1>
        <a href="WatchlistPage.jsp" style="font-weight: bold;">My Watchlist   |</a>
        <a href="profile.jsp">My Profile   |</a>
        <a href="search.jsp">Search Movies   |</a>
        <a href="login.jsp">Log Out</a>
    </div>


<hr>
<h1 style="text-align: center; font-size: 64px; color: white; font-family: Helvetica;">My WatchList</h1>
<hr>

    <p style="color: white; font-size: 24px;">Instructions: To add movies to your watchlist, click on the "Search Movies" tab located on the Top Menu. Then, search for a movie you would like to add,
    then click "Add Movie to Watchlist".
    </p>
<%
    if(session.getAttribute("MySession") == null){
       response.sendRedirect("login.jsp");
    }
    int x = 0, maxNew = 0;
    ArrayList<movieModel> MyList= null;
    watchList wl = new watchList();
    if(session.getAttribute("MyMovieList") == null) {
        int userId = (Integer) session.getAttribute("userID");
        MyList = wl.getMyMovies(userId);
        x = 0;
        maxNew = MyList.size();
        session.setAttribute("MyMovieList",MyList);
    }else{
        try {
            MyList = wl.getMyMovies((Integer) session.getAttribute("userID"));
            maxNew = MyList.size();
            session.setAttribute("MyMovieList",MyList);
        }catch (Exception e){
            System.out.println("Error Code\n\n"+e+"\n\n");
        }
    }
%>
    <table>

                <%
        while(x<maxNew) {
            %>

        <tr id="<%=x%>Tab" >
        <td style="border:solid white 3px;">
            <p style="padding-top:20px;"><b style = "font-size:30px;"> <%=MyList.get(x).getTitle()%></b></p>
            <hr style="width: 40%">
            <p><b style = "font-size:20px">Plot Preview:</b></p>
            <p><%=MyList.get(x).getDescription()%></p>
            <!------------Button-------------------------------->
            <label class="btn" for="modal-<%=x%>.1" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;" id="allReview" value="<%=MyList.get(x).getIdmovie()%>">All Reviews</label>
            <input class="modal-state" id="modal-<%=x%>.1" type="checkbox"/>
            <form action="/moviePage" method="get">
            <div class="modal">
                <label class="modal__bg" for="modal-<%=x%>.1"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-<%=x%>.1"></label>
                    <h2 class="modal-title" style="color:black;">All Reviews</h2>
                    <input readonly type="text" id="output" style="width: 100%; border:none;">
                </div>
            </div>
            </form>
            <!-- Button!-->
            <label class="btn" for="modal-<%=x%>.2" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;" >Add Review</label>
            <input class="modal-state" id="modal-<%=x%>.2" type="checkbox"/>
            <div class="modal">
                <label class="modal__bg" for="modal-<%=x%>.2"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-<%=x%>.2"></label>
                    <h2 class="modal-title" style="color:black;">Add Review</h2>
                        <form action="/moviePage" method="post" style="font-size: 24px; color: white; padding-top: 20px;">
                        <textarea name="input" id="input" maxlength="550" cols="40" rows="5" placeholder="Write Review" style="width:100%; height: 70%;"></textarea>
                            <input type="submit" value="Save Review" style="cursor: pointer; font-size: 24px;"/>
                            <input name="addReview" value="<%=MyList.get(x).getIdmovie()%>" style="height: 0; width:0; visibility: hidden"/>

                        </form>
                    <br/>
                </div>
            </div>
            <label class="btn" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Remove from Watchlist</label>

        </td>
        </tr>
        <br/>
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
