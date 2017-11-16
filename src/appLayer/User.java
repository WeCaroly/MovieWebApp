package appLayer;

import dataLayer.DBuser;
import webapp.models.userModel;

import java.util.ArrayList;

public class User {
    private DBuser db_User = new DBuser();

    public boolean isValidUserCredentials(String sUserName, String sUserPassword) {
        return db_User.isValidUserLogin(sUserName, sUserPassword);
    }

    public ArrayList<userModel> getAllUser() {
        return db_User.getAllUsers();
    }

    //public void setTodo(todo newItem){
    //  System.out.println(newItem.getTodo() + " " + newItem.getUser());
    //  db_User.setTodo(newItem);
    // }

    public ArrayList<userModel> getFriends(int iduser){return db_User.getFriends(iduser);}
}
