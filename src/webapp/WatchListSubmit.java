package webapp;

import appLayer.watchList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="main")
public class WatchListSubmit extends HttpServlet {
    watchList list = new watchList();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Do post: \ntodo:"+ request.getParameter("todoBox"));


        //TODO call to the db to get the info

//        ArrayList<movieModel> movieList = new ArrayList<movieModel>();
//        movieList = list.getMovies();
//
//
//        ArrayList<movieModel> moviePersonalList = new ArrayList<movieModel>();
//        moviePersonalList = list.getMyMovies(Integer.parseInt(request.getParameter("userID")));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
//    public void getSessionofUser(HttpServletRequest request) {
//        //Obtain the session object, create a new session if doesn't exist
//        HttpSession session = request.getSession(true);
//        //get a string sessson attribute
//        String strParam = (String) session.getAttribute("MySessionVariable");
//        //get an integer sessioin attribute
//        Integer param = (Integer) session.getAttribute("MySessionVariable");
//        //set an integer session attribute
//        session.setAttribute("MySessionVariable",new Integer(param.intValue() +1));
//    }
}
