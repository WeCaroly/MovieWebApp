package dataLayer;

import webapp.*;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class DBuser {

    //JDB driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    //static final String DB_URL = "jdbc:mysql://localhost/webbapplogin";
  //  static final String DB_URL = "jdbc:mysql://aa19qfog95k5ari.cmg7kglbmqka.us-east-1.rds.amazonaws.com:3306/webbapplogin";
    static final String DB_URL = "jdbc:mysql://dbmovieinstance.cmg7kglbmqka.us-east-1.rds.amazonaws.com:3306/MasterMovieDB";
    private static final String USER = "root";
    static final String PASS = "password";

    /**
     * Return is the user is found in the DB
     **/
    public boolean isValidUserLogin(String sUsername, String sPassowrd) {
        boolean isValid = false;

        Connection con = null;
        Statement stmt = null;
        String sql;

        //look up in dataBase

            //step 2 register JDBC driver
            try {
                Class.forName(JDBC_DRIVER);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try{//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();

            sql = "SELECT * FROM users WHERE uname = \"" + sUsername
                    + "\" AND pass = \"" + sPassowrd+ "\"" ;
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //step 5 extract data from result set
            if(rs.next()){
                isValid = true;
            }
            //step 6 close up db
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
        return isValid;
    }
    /**
     * Returns all th user in the DB
     **/
    public ArrayList<userModel> getAllUsers(){
        Connection con = null;
        Statement stmt = null;
        String sql;
        userModel newUser;
        ArrayList<userModel> UserList = null;
        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();

            sql = "SELECT * FROM users";
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                newUser = new userModel();
                int id = rs.getInt("id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String uname = rs.getString("uname");
                String ename = rs.getString("ename");
                int age = rs.getInt("age");
                char gender = rs.getString("gender").charAt(0);
                boolean reciveEmail = rs.getBoolean("reciveEmail");
                String pass = rs.getString("pass");

                newUser.setAge(age);
                newUser.setFname(fname);
                newUser.setEname(ename);
                newUser.setGender(gender);
                newUser.setPass(pass);
                newUser.setUname(uname);
                newUser.setLname(lname);
                newUser.setReciveEmail(reciveEmail);
                newUser.setId(id);

                UserList.add(newUser);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
        return UserList;
    }

    /**
     * Registers the new User with the DB
     * **/
    public void registerUser (userModel newUser){
       Connection con = null;
       Statement stmt = null;
       String sql;
       //step 2 register JDBC driver
       try {
           Class.forName(JDBC_DRIVER);
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       try{//step 3 open connection

           System.out.print("Connecting to db....");
           con = DriverManager.getConnection(DB_URL,USER,PASS);

           //step 4
           System.out.print("creating statement.... ");
           stmt = con.createStatement();


           sql = "INSERT INTO user " +
                   "(`fname`, `lname`, `uname`, `age`, `ename`, `gender`, `reciveEmail`, `password`) " +
                   "VALUES ('"+newUser.getFname()+"', '"+newUser.getFname()+"', '" +
                   newUser.getUname()+"', '"+newUser.getAge()+"', '"+newUser.getEname()+"', '"+
                   newUser.getGender()+"', '"+newUser.isReciveEmail()+"', '"+newUser.getPAss()+"')";
           ResultSet rs = stmt.executeQuery(sql);


            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
    }

    /**
     * gets all the movies from the DB
     * @return all movies in a list
     * **/
    public ArrayList<movieModel> getMovies(){
        Connection con = null;
        Statement stmt = null;
        String sql;
        ArrayList<movieModel> allMovieList = null;
        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();


            sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            //String sql2 = "SELECT * FROM moviecommt WHERE idmovie = "+idmovie;
            //ResultSet rs2 = stmt.executeQuery(sql2);
            while (rs.next()){
                movieModel movie = new movieModel();
                movie.setComment(rs.getString("comments"));
                movie.setDescription(rs.getString("description"));
                movie.setIdmovie(rs.getInt("idmovie"));
                movie.setRating(rs.getString("rating"));
                movie.setTitle(rs.getString("title"));

                allMovieList.add(movie);
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
        return allMovieList;
    }

    /**
     * Gets all movies from the user by id
     * @params iduser the users id is passed in for the sql
     * @return MyMovies is returned as a list of movieModel objects
     * **/
    public ArrayList<movieModel> getMyMovies(int iduser){
        Connection con = null;
        Statement stmt = null;
        String sql;
        ArrayList<movieModel> myMovies = null;
        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();

            ArrayList<movieModel> allMovies = getMovies();


            sql = "SELECT * FROM movielist where isuser ="+iduser;
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                movieListModel addedMovie = new movieListModel();
                addedMovie.setIdmovie(rs.getInt("idmovie"));
                addedMovie.setIduser(rs.getInt("iduser"));
                int i = 0;
                while (allMovies.size() > i){
                    if (addedMovie.getIdmovie() == allMovies.get(i).getIdmovie()) {
                        myMovies.add(allMovies.get(i));
                    }
                }
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
        return myMovies;
    }


    public ArrayList<userModel> getFriends(int iduser) {
        Connection con = null;
        Statement stmt = null;
        String sql;
        userModel newUser;
        ArrayList<friendListModel> friendList = null;
        ArrayList<userModel> friendInfo = null;
        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();

            ArrayList<userModel> allUsers = getAllUsers();

            sql = "SELECT * FROM friendlist WHERE userid = "+iduser+";";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                friendListModel newfriend = new friendListModel();
                newfriend.setIdmovie(rs.getInt("idmovie"));
                newfriend.setIdfriend(rs.getInt("idfriend"));
                newfriend.setIduser(rs.getInt("iduser"));
                int i = 0;
                while (allUsers.size() > i) {
                    if (allUsers.get(i).getId() == newfriend.getIduser()){

                    }
                    i++;
                }
                friendList.add(newfriend);
            }



            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
        return friendList;
    }
    /**
     * Recomend List Call for the user
     * @param isuser is the is for the user who is logged in
     * @return returns all the users rec from their friends
     * **/
    public ArrayList<recomendListModel> getRec(int iduser){
        Connection con = null;
        Statement stmt = null;
        String sql;
        userModel newUser;
        ArrayList<recomendListModel> RecListArry = null;
        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();

            sql = "SELECT * FROM recomendlist WHERE iduser = "+ iduser +";";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                recomendListModel recList = new recomendListModel();
                recList.setIduser(rs.getInt("iduser"));
                recList.setIdmovie(rs.getInt("idmovie"));
                recList.setIdfreind(rs.getInt("idfriend"));
                RecListArry.add(recList);
            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //use to close
            try {
                if (stmt != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return RecListArry;
    }

}
