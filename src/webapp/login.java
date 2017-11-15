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
@WebServlet(name="login")
public class login extends HttpServlet {
    User user = new User();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //from form
        PrintWriter out = response.getWriter();
        out.print("Do post: \nlogin-name:"+ request.getParameter("loginname")+
                " \nPassword:" + request.getParameter("password"));


        //dispatch
        request.setAttribute("username", request.getParameter("loginname"));
        request.setAttribute("password", request.getParameter("password"));

        if(user.isValidUserCredentials(request.getParameter("loginname"),request.getParameter("password"))) {
            request.getRequestDispatcher("/WatchlistPage.jsp").forward(request, response);
        }else{
            request.setAttribute("errorMessage","Invalid Log in information. Try again.");
            request.getRequestDispatcher("/login.jsp").forward(request,response);

        }
        //Obtain the session object, create a new session if doesn't exist
        HttpSession session = request.getSession(true);

        //set a string session attribute
        session.setAttribute("MySessionVariable", "MySessionAtrValue");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //from url direct
        PrintWriter out = response.getWriter();
        out.print("do get: \nlogin-name:"+ request.getParameter("loginname")+
        " \npassword"+ request.getParameter("password"));
        doPost(request,response);
    }
}
