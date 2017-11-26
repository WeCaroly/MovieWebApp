package dataLayer;

import webapp.models.*;

import java.sql.*;
import java.util.ArrayList;

public class DBuser {

    //JDB driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    //static final String DB_URL = "jdbc:mysql://localhost/fithbrichinc";
  //  static final String DB_URL = "jdbc:mysql://aa19qfog95k5ari.cmg7kglbmqka.us-east-1.rds.amazonaws.com:3306/webbapplogin";
    //static final String DB_URL = "jdbc:mysql://dbmovieinstance.cmg7kglbmqka.us-east-1.rds.amazonaws.com:3306/MasterMovieDB";
   static final String DB_URL = "jdbc:mysql://fithbrichinc.cmg7kglbmqka.us-east-1.rds.amazonaws.com:3306/fithbrichinc";
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

            System.out.print("Connecting to db....\n");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... \n");
            stmt = con.createStatement();

            sql = "SELECT * FROM user WHERE uname = \"" + sUsername
                    + "\" AND password = \"" + sPassowrd+ "\"" ;
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
        System.out.print("closed the DB!\n");
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
        ArrayList<userModel> UserList = new ArrayList<>();
        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{//step 3 open connection

            System.out.print("Connecting to db....\n");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... \n");
            stmt = con.createStatement();

            sql = "SELECT * FROM user";
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                newUser = new userModel();
                int id = rs.getInt("iduser");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String uname = rs.getString("uname");
                String ename = rs.getString("ename");
                int age = rs.getInt("age");
                char gender = 'N';
                boolean reciveEmail = rs.getBoolean("reciveEmail");
                String pass = rs.getString("password");

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

           System.out.print("Connecting to db....\n");
           con = DriverManager.getConnection(DB_URL,USER,PASS);

           //step 4
           System.out.print("creating statement.... \n");
           stmt = con.createStatement();


           sql = "INSERT INTO user " +
                   "(fname, lname, ename, age, password, uname)" +
                   "VALUES (\'"+newUser.getFname()+"\', \'"+newUser.getLname()+"\', \'" +
                   newUser.getEname()+"\', \'"+newUser.getAge()+"\', \'"+newUser.getPAss()+"\', \'"+newUser.getUname()+"\')";

           stmt.executeUpdate(sql);

           // rs.close();
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
        System.out.print("closed the DB!\n");
    }

    /**
     * gets all the movies from the DB
     * @return all movies in a list
     * **/
    public ArrayList<movieModel> getMovies(){
        Connection con = null;
        Statement stmt = null;
        String sql;
        ArrayList<movieModel> allMovieList = new ArrayList<>();
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


            sql = "SELECT * FROM movie";
            ResultSet rs = stmt.executeQuery(sql);
            //String sql2 = "SELECT * FROM moviecommt WHERE idmovie = "+idmovie;
            //ResultSet rs2 = stmt.executeQuery(sql2);
            while (rs.next()){
                movieModel movie = new movieModel();
                movie.setComment(rs.getString("comment"));
                movie.setDescription(rs.getString("description"));
                movie.setIdmovie(rs.getInt("idmovie"));
                movie.setRating(rs.getString("rating"));
                movie.setTitle(rs.getString("title"));
                movie.setUrl(rs.getString("image"));
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
        System.out.print("closed the DB!\n");
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
        ArrayList<movieModel> myMovies = new ArrayList<>();
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


            sql = "SELECT * FROM movielist where isuser ="+iduser+";";
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
                        break;
                    }
                    i++;
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

    /**
     * gets the user informtion
     * @return the information of the user
     * @params iduser the id of the user logged in
     **/
    public userModel getUserInfo (int iduser){
        Connection con = null;
        Statement stmt = null;
        String sql;
        userModel user = new userModel();

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
            sql = "SELECT * FROM user WHERE iduser ="+iduser;
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int id = rs.getInt("iduser");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String uname = rs.getString("uname");
                String ename = rs.getString("ename");
                int age = rs.getInt("age");
                boolean reciveEmail = rs.getBoolean("reciveEmail");
                String pass = rs.getString("password");

                user.setAge(age);
                user.setFname(fname);
                user.setEname(ename);
                user.setPass(pass);
                user.setUname(uname);
                user.setLname(lname);
                user.setReciveEmail(reciveEmail);
                user.setId(id);
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
        return user;
    }

    /**
     * Adds Movie to DB
     * @params movie is the movieModel
     * */
    public void addMoviesToDB(movieModel movie){
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

            sql = "INSERT INTO movie (title, description) "+
             "VALUES (\'"+movie.getTitle()+"\', \'"+movie.getDescription()+"\')";
            int rs = stmt.executeUpdate(sql);
            //rs.close();
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
     * Add My Movies
     * @param idmovie
     * @param iduser
     * */
    public void addToMyMovies(int idmovie, int iduser){
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

            sql = "INSERT INTO movieList (idmovie, iduser) VALUES (\'"+idmovie+"\', '"+iduser+"\');";
            int rs = stmt.executeUpdate(sql);

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
     * Add comments to movies
     * @param comment
     * @param idmovie
     * @param iduser
     * */
    public void addComment(String comment, int idmovie, int iduser, String rating){
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

            sql = "INSERT INTO moviecomment (idmovie, iduser, rating, comment) " +
                    "VALUES (\'"+idmovie+"\', \'"+iduser+"\', \'"+rating+"\', \'"+comment+"\');";
            int rs = stmt.executeUpdate(sql);

            //rs.close();
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

}
