package webapp;

import dataLayer.DBuser;
import webapp.models.commentFormatObject;
import webapp.models.movieCommentModel;
import webapp.models.movieModel;
import webapp.models.userModel;

import javax.jws.WebService;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebService(name = "moviePage")
public class moviePage extends HttpServlet {
    DBuser db = new DBuser();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Obtain the session object, create a new session if doesn't exist
        HttpSession session = request.getSession(true);

        int id = (Integer) session.getAttribute("userID");

        movieCommentModel movie = new movieCommentModel();
        movie.setIduser( id );
        movie.setComment(request.getParameter("input"));
        movie.setIdmovie(Integer.parseInt(request.getParameter("addReview")));


        db.addComment(movie.getComment(),movie.getIdmovie(),movie.getIduser(),movie.getRating());

        request.getRequestDispatcher("/WatchlistPage.jsp").forward(request, response);

        }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
    }
}

