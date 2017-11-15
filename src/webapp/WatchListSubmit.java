package webapp;

import appLayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "watchList")
public class WatchListSubmit extends HttpServlet {
    User user = new User();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Do post: \ntodo:"+ request.getParameter("todoBox"));


        //todo newItem = new todo();
        //newItem.setUser(request.getParameter("username"));
        //newItem.setTodo(request.getParameter("todoBox"));
        //user.setTodo(newItem);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
    public void getSessionofUser(HttpServletRequest request) {
        //Obtain the session object, create a new session if doesn't exist
        HttpSession session = request.getSession(true);
        //get a string sessson attribute
        String strParam = (String) session.getAttribute("MySessionVariable");
        //get an integer sessioin attribute
        Integer param = (Integer) session.getAttribute("MySessionVariable");
        //set an integer session attribute
        session.setAttribute("MySessionVariable",new Integer(param.intValue() +1));
    }
}
