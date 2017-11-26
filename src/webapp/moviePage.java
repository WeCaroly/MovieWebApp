package webapp;

import dataLayer.DBuser;
import webapp.models.movieCommentModel;
import webapp.models.movieModel;
import webapp.models.userModel;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebService(name = "moviePage")
public class moviePage extends HttpServlet {
    HttpSession session;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Obtain the session object, create a new session if doesn't exist
        HttpSession session = request.getSession(true);
        DBuser db = new DBuser();

        // request.setAttribute("input", request.getParameter("input"));
        // request.setAttribute("output", request.getParameter("output"));

        ArrayList<movieModel> myList = (ArrayList<movieModel>) session.getAttribute("MyMovieList"); //all movies from user list

        //Todo position id??????
        int positionId = 0;//get the while list position of the movie list

        movieCommentModel movie = new movieCommentModel();
        movie.setIduser( (Integer) session.getAttribute("userID"));
        //TODO get the right numbers
        movie.setIdmovie(myList.get(positionId).getIdmovie());
        movie.setComment(request.getParameter("input"+positionId));

        db.addComment(movie.getComment(),movie.getIdmovie(),movie.getIduser(),movie.getRating());

        request.getRequestDispatcher("/WatchlistPage.jsp").forward(request, response);

        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
}

