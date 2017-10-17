package webapp;

import appLayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

        request.getRequestDispatcher("/WatchlistPage.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
