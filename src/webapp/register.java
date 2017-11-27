package webapp;

import appLayer.User;
import webapp.models.userModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name="registerServ")
public class register extends HttpServlet{
    User user = new User();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //dispatch
        //Obtain the session object, create a new session if doesn't exist
        HttpSession session = request.getSession(true);

        request.setAttribute("uname", request.getParameter("uname"));
        request.setAttribute("pass", request.getParameter("pass"));
        request.setAttribute("fname", request.getParameter("fname"));
        request.setAttribute("lname", request.getParameter("lname"));

        request.setAttribute("email", request.getParameter("ename"));
        request.setAttribute("age", request.getParameter("age"));
        request.setAttribute("reciveEmail", request.getParameter("reciveEmail"));

        userModel newUser = new userModel();
        newUser.setAge(Integer.parseInt(request.getParameter("age")));
        newUser.setUname(request.getParameter("uname"));
        newUser.setFname(request.getParameter("fname"));
        newUser.setLname(request.getParameter("lname"));
        newUser.setEname(request.getParameter("ename"));
        newUser.setPass(request.getParameter("pass"));
        newUser.setReciveEmail(Boolean.parseBoolean(request.getParameter("reciveEmailEmail")));


        if(user.validEmail(newUser.getEname())){
            //call to user that is connected to DB
            user.register(newUser);
            newUser.setId(user.getAllUser().size());
            request.setAttribute("userID", newUser.getId());
            session.setAttribute("userID", newUser.getId());
            request.getRequestDispatcher("/WatchlistPage.jsp").forward(request, response);
        }else{
            request.setAttribute("errorMessage","Invalid information. Try again.");
            request.getRequestDispatcher("/registrationPage.jsp").forward(request,response);
        }


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
