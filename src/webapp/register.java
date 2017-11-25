package webapp;

import appLayer.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
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
        Boolean notNull = false;
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

        if(newUser.getAge()>0 && newUser.getUname() != null && newUser.getPAss()!=null
                && newUser.getEname()!= null && newUser.getFname()!=null && newUser.getLname()!=null
                ){
            notNull = true;
            newUser.setUname("test");
            newUser.setPass("test");
            newUser.setFname("test");
            newUser.setLname("test");
            newUser.setEname("test@gm");

        }

        if(user.validEmail(newUser.getEname()) && notNull){
            //call to user that is connected to DB
            user.register(newUser);
            newUser.setId(user.getAllUser().size()+1);
            request.setAttribute("userID", newUser.getId());
            request.getRequestDispatcher("/WatchlistPage.jsp").forward(request, response);
        }else{
            request.setAttribute("errorMessage","Invalid information. Try again.");
            request.getRequestDispatcher("/registrationPage.jsp").forward(request,response);
        }

//
//        if(user.isValidUserCredentials(request.getParameter("loginname"),request.getParameter("password"))) {
//            request.setAttribute("userID", user.getID());
//            request.getRequestDispatcher("/WatchlistPage.jsp").forward(request, response);
//        }else{
//            request.setAttribute("errorMessage","Invalid Log in information. Try again.");
//            request.getRequestDispatcher("/login.jsp").forward(request,response);
//
//        }

        //Obtain the session object, create a new session if doesn't exist
        HttpSession session = request.getSession(true);

        //set a string session attribute
        session.setAttribute("MySessionVariable", "MySessionAtrValue");

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
