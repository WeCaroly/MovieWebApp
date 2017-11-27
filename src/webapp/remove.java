package webapp;

import dataLayer.DBuser;
import webapp.models.movieCommentModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "remove")
public class remove extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBuser db = new DBuser();
        HttpSession session = request.getSession(true);

        int iduser = (Integer) session.getAttribute("userID");
        int idmovie = Integer.parseInt(request.getParameter(""));

        db.removeFromMyList(idmovie, iduser);

        request.getRequestDispatcher("/WatchList.jsp").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
