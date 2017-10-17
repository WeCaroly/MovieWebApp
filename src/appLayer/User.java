package appLayer;

import dataLayer.DBuser;
import webapp.*;
import java.util.ArrayList;

public class User {
    private DBuser db_User = new DBuser();
    public boolean isValidUserCredentials(String sUserName, String sUserPassword){
        return db_User.isValidUserLogin(sUserName,sUserPassword);
    }
   public ArrayList<userModel> getTodoUser(){
       return db_User.getUser();
    }
    //public void setTodo(todo newItem){
      //  System.out.println(newItem.getTodo() + " " + newItem.getUser());
      //  db_User.setTodo(newItem);
   // }
}
