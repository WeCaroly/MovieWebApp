package webapp;

import webapp.models.userModel;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebService(name = "moviePage")
public class moviePage extends HttpServlet {
    public class search {
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            request.setAttribute("uname", request.getParameter("uname"));
            request.setAttribute("pass", request.getParameter("pass"));
            request.setAttribute("fname", request.getParameter("fname"));

            userModel newUser = new userModel();
            newUser.setAge(Integer.parseInt(request.getParameter("age")));
            newUser.setUname(request.getParameter("uname"));
            newUser.setFname(request.getParameter("fname"));
            newUser.setLname(request.getParameter("lname"));
            newUser.setReciveEmail(Boolean.parseBoolean(request.getParameter("reciveEmailEmail")));


            //call to watchlist that is connected to DB
           /* user.register(newUser);
             newUser.setId(user.getAllUser().size()+1);
            request.setAttribute("userID", newUser.getId());
            request.getRequestDispatcher("/WatchlistPage.jsp").forward(request, response);
            */
            //Obtain the session object, create a new session if doesn't exist
            HttpSession session = request.getSession(true);

            //set a string session attribute
            session.setAttribute("MySessionVariable", "MySessionAtrValue");
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request, response);
        }
    }
}
