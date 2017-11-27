package webapp;

import dataLayer.DBuser;
import webapp.models.userModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "profile")
public class profile extends HttpServlet {

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
        }

}
