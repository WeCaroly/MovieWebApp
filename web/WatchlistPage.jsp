<!DOCTYPE html>
<html>
<head>

    <style>
        .btn{
            background-color: white;
            color: black;
            font-family: Helvetica;
        }
        .modal {
            opacity: 0;
            visibility: hidden;
            position: fixed;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            text-align: left;
            background: rgba(0,0,0, .9);
            transition: opacity .25s ease;
        }

        .modal__bg {
            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            cursor: pointer;
        }


        .modal-state {
            display: none;
        }

        .modal-state:checked + .modal {
            opacity: 1;
            visibility: visible;
        }

        .modal-state:checked + .modal .modal__inner {
            top: 0;
        }

        .modal__inner {
            transition: top .25s ease;
            position: absolute;
            top: -20%;
            right: 0;
            bottom: 0;
            left: 0;
            width: 50%;
            margin: auto;
            overflow: auto;
            background: #fff;
            border-radius: 5px;
            padding: 1em 2em;
            height: 50%;
        }

        .modal__close {
            position: absolute;
            right: 1em;
            top: 1em;
            width: 1.1em;
            height: 1.1em;
            cursor: pointer;
        }

        .modal__close:after,
        .modal__close:before {
            content: '';
            position: absolute;
            width: 2px;
            height: 1.5em;
            background: #ccc;
            display: block;
            transform: rotate(45deg);
            left: 50%;
            margin: -3px 0 0 -1px;
            top: 0;
        }

        .modal__close:hover:after,
        .modal__close:hover:before {
            background: #aaa;
        }

        .modal__close:before {
            transform: rotate(-45deg);
        }

        a {
            padding: 10px;
            padding-top: 20px;
            padding-bottom: 20px;
            width: 100%;
            font-size: 32px;
            color: white;
            text-decoration: none;

        }
		p {
			text-align: center;
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

    <!-- TODO ADD IN A GENERIC FOR THIS !-->

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

            <!------------All Reviews Modal------------------------------->
            <label class="btn" for="modal-1.1" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Reviews</label>
            <input class="modal-state" id="modal-1.1" type="checkbox" />
            <div class="modal">
                <label class="modal__bg" for="modal-1.1"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-1.1"></label>
                    <h2 class="modal-title" style="color:black;">All Reviews</h2>
                </div>
            </div>

            <!-------------------------------------------------------->

            <!------------Write Review Modal-------------------------------->
            <label class="btn" for="modal-1.2" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Add Review</label>

            <input class="modal-state" id="modal-1.2" type="checkbox" />
            <div class="modal">
                <label class="modal__bg" for="modal-1.2"></label>

                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-1.2"></label>
                <h2 class="modal-title" style="color:black;">Add Review</h2>

                    <textarea name="Text" cols="40" rows="5" placeholder="Write Review" style="width:100%; height: 70%;"></textarea>
                    <button type="button" style="cursor: pointer; font-size: 24px;">Save Review</button>

                </div>
            </div>
            <!-------------------------------------------------------->

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

            <!------------All Reviews Modal-------------------------------->
            <label class="btn" for="modal-2.1" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Reviews</label>
            <input class="modal-state" id="modal-2.1" type="checkbox" />
            <div class="modal">
                <label class="modal__bg" for="modal-2.1"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-2.1"></label>
                    <h2 class="modal-title" style="color:black;">All Reviews</h2>
                </div>
            </div>
            <!-------------------------------------------------------->

            <!------------Write Review Modal-------------------------------->
            <label class="btn" for="modal-2.2" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Add Review</label>

            <input class="modal-state" id="modal-2.2" type="checkbox" />
            <div class="modal">
                <label class="modal__bg" for="modal-2.2"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-2.2"></label>
                    <h2 class="modal-title" style="color:black;">Add Review</h2>

                    <textarea name="Text" cols="40" rows="5" placeholder="Write Review" style="width:100%; height: 70%;"></textarea>
                    <button type="button" style="cursor: pointer; font-size: 24px;">Save Review</button>

                </div>
            </div>
            <!-------------------------------------------------------->
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

            <!------------All Reviews Modal-------------------------------->
            <label class="btn" for="modal-3.1" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Reviews</label>
            <input class="modal-state" id="modal-3.1" type="checkbox" />
            <div class="modal">
                <label class="modal__bg" for="modal-3.1"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-3.1"></label>
                    <h2 class="modal-title" style="color:black;">All Reviews</h2>
                </div>
            </div>
            <!-------------------------------------------------------->

            <!------------Write Review Modal-------------------------------->
            <label class="btn" for="modal-3.2" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Add Review</label>

            <input class="modal-state" id="modal-3.2" type="checkbox" />
            <div class="modal">
                <label class="modal__bg" for="modal-3.2"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-3.2"></label>
                    <h2 class="modal-title" style="color:black;">Add Review</h2>

                    <textarea name="Text" cols="40" rows="5" placeholder="Write Review" style="width:100%; height: 70%;"></textarea>
                    <button type="button" style="cursor: pointer; font-size: 24px;">Save Review</button>

                </div>
            </div>
            <!-------------------------------------------------------->
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

            <!------------All Reviews Modal-------------------------------->
            <label class="btn" for="modal-4.1" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Reviews</label>
            <input class="modal-state" id="modal-4.1" type="checkbox" />
            <div class="modal">
                <label class="modal__bg" for="modal-4.1"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-4.1"></label>
                    <h2 class="modal-title" style="color:black;">All Reviews</h2>
                </div>
            </div>
            <!-------------------------------------------------------->

            <!------------Write Review Modal------------------------------->
            <label class="btn" for="modal-4.2" type="button" style="padding-top: 10px; cursor: pointer; font-size: 24px;">Add Review</label>

            <input class="modal-state" id="modal-4.2" type="checkbox" />
            <div class="modal">
                <label class="modal__bg" for="modal-4.2"></label>
                <div class="modal__inner" style="text-align: center">
                    <label class="modal__close" for="modal-4.2"></label>
                    <h2 class="modal-title" style="color:black;">Add Review</h2>

                    <textarea name="Text" cols="40" rows="5" placeholder="Write Review" style="width:100%; height: 70%;"></textarea>
                    <button type="button" style="cursor: pointer; font-size: 24px;">Save Review</button>

                </div>
            </div>
            <!-------------------------------------------------------->
        </td>
    </tr>
</table>
</body>
</html>
