package dataLayer;

import webapp.userModel;
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

    public boolean isValidUserLogin(String sUsername, String sPassowrd){
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
    public ArrayList<userModel> getUser(){
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
                String id = rs.getString("id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String uname = rs.getString("uname");
                String ename = rs.getString("ename");
                String edoman = rs.getString("edoman");
                String ecom = rs.getString("ecom");
                int age = rs.getInt("age");
                char gender = rs.getString("gender").charAt(0);
                boolean reciveEmail = rs.getBoolean("reciveEmail");
                String pass = rs.getString("pass");

                newUser.setAge(age);
                newUser.setEcom(ecom);
                newUser.setEdoman(edoman);
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


}
