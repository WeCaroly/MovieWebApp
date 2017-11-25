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
    <table>
        <tr style ="padding-top: 5em; padding-bottom: 5em; border: solid white 3px; border-radius: 5em; margin-left: 50px;">
            <td style = "width:50%">
                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BMTA0OTQwMTIxNzheQTJeQWpwZ15BbWU4MDQ1MzI3OTMy._V1_UX182_CR0,0,182,268_AL_.jpg">
            </td>
            <td>
                <p><b style = "font-size:30px">Geostorm</b></p>
                <hr align = center width = 47%>
                <p><b style = "font-size:20px">Release Date: October 20, 2017</b></p>
                <p><b style = "font-size:20px">Plot Preview</b></p>
                <p>An experimental weather regulating system called Dutch Boy has been weaponized to take out countries by creating geostorms.</p>
                <input type="button" value="Add to Watchlist" style="color:black; background-color:white; font-size: 24px;">
             </td>
        </tr>
        <tr>
            <td>
                <br />
            </td>
        </tr>
        <tr style ="padding-top: 5em; padding-bottom: 5em; border: solid white 3px; border-radius: 5em; margin-left: 50px;">
            <td style = "width: 50%;">
                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BMjQ1MzcxNjg4N15BMl5BanBnXkFtZTgwNzgwMjY4MzI@._V1_UX182_CR0,0,182,268_AL_.jpg">
            </td>
            <td>
                <p><b style = "font-size:30px">Star Wars: The Last Jedi</b></p>
                <hr align = center; width = 47%>
                <p><b style = "font-size:20px">Release Date: December 15, 2017</b></p>
                <p><b style = "font-size:20px">Plot Preview</b></p>
                <p>Having taken her first steps into a larger world in Star Wars: The Force Awakens (2015), Rey continues her epic journey with Finn, Poe, and Luke Skywalker in the next chapter of the saga.</p>
                <input type="button" value="Add to Watchlist" style="color:black; background-color:white; font-size: 24px;">
            </td>
        </tr>
        <tr>
            <td>
                <br />
            </td>
        </tr>
        <tr style = "padding-top: 5em; padding-bottom: 5em; border: solid white 3px; border-radius: 5em; margin-left: 50px;">
            <td style = "width: 50%;">
                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BMjMyNDkzMzI1OF5BMl5BanBnXkFtZTgwODcxODg5MjI@._V1_UX182_CR0,0,182,268_AL_.jpg">
            </td>
            <td>
                <p><b style = "font-size:30px">Thor: Ragnarok</b></p>
                <hr align = center width = 47%>
                <p><b style = "font-size:20px">Release Date: November 3, 2017</b></p>
                <p><b style = "font-size:20px">Plot Preview</b></p>
                <p>In Marvel Studios' Thor: Ragnarok, Thor is imprisoned on the other side of the universe without his mighty hammer and finds himself in a race against time to get back to Asgard to stop Ragnarok-the destruction of his homeworld and the end of Asgardian civilization-at the hands of an all-powerful new threat, the ruthless Hela. But first he must survive a deadly gladiatorial contest that pits him against his former ally and fellow Avenger-the Incredible Hulk!</p>
                <input type="button" value="Add to Watchlist" style="color:black; background-color:white; font-size: 24px;">
            </td>

        </tr>
        <tr>
            <td>
                <br />
            </td>
        </tr>
        <tr style ="padding-top: 5em; padding-bottom: 5em; border: solid white 3px; border-radius: 5em; margin-left: 50px;">
            <td style ="width:50%;">
                <img src="https://images-na.ssl-images-amazon.com/images/M/MV5BNGFmM2NmYjYtMjAwNy00ZDkzLWI3ZWMtOGZhOTRhYzQwMTA0XkEyXkFqcGdeQXVyNzU2MzMyNTI@._V1_UX182_CR0,0,182,268_AL_.jpg">
            </td>
            <td>
                <p><b style = "font-size:30px">Murder on the Orient Express</b></p>
                <hr align = center width = 47%>
                <p><b style = "font-size:20px">Release Date: November 10, 2017</b></p>
                <p><b style = "font-size:20px">Plot Preview</b></p>
                <p>What starts out as a lavish train ride through Europe quickly unfolds into one of the most stylish, suspenseful and thrilling mysteries ever told. From the novel by best selling author Agatha Christie, "Murder on the Orient Express" tells the tale of thirteen strangers stranded on a train, where everyone's a suspect. One man must race against time to solve the puzzle before the murderer strikes again.</p>
                <input type="button" value="Add to Watchlist" style="color:black; background-color:white; font-size: 24px;">
            </td>
        </tr>
    </table>
</body>
</html>
