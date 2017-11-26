<%@ page import="appLayer.watchList" %>
<%@ page import="webapp.models.movieModel" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <script>
        function copyText(){
                document.getElementById("output").value=document.getElementById("input").value;
         }
    </script>

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
<h1 style="text-align: center; font-size: 64px; color: white; font-family: Helvetica;">${username} WatchList</h1>
<hr>

    <p style="color: white; font-size: 24px;">Instructions: To add movies to your watchlist, click on the "Search Movies" tab located on the Top Menu. Then, search for a movie you would like to add,
    then click "Add Movie to Watchlist".
    </p>
<%
    if(session.getAttribute("MySession") == null){
       response.sendRedirect("login.jsp");
    }

    watchList wl = new watchList();
    int userId = (Integer) request.getAttribute("userID");
    ArrayList<movieModel> MyList = wl.getMyMovies(userId);
    int x = 0;
    int maxNew = MyList.size();
    request.setAttribute("MyMovieList",MyList);
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
