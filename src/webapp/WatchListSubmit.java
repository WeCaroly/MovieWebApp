package webapp;

import appLayer.watchList;
import dataLayer.DBuser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="main")
public class WatchListSubmit extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DBuser db = new DBuser();
        HttpSession session = request.getSession(true);

        int iduser = (Integer) session.getAttribute("userID");
        int idmovie = Integer.parseInt(request.getParameter("removebtn"));

        db.addToMyMovies(idmovie, iduser);

        request.getRequestDispatcher("/search.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

}
