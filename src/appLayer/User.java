package appLayer;

import dataLayer.DBuser;
import webapp.models.userModel;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private DBuser db_User = new DBuser();
    int id;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean isValidUserCredentials(String sUserName, String sUserPassword) {
        return db_User.isValidUserLogin(sUserName, sUserPassword);
    }

    public void register(userModel newUser){
        db_User.registerUser(newUser);
    }

    public int getId(String sUserName,String sUserPsss){
        userModel IDuser = db_User.findId( sUserName, sUserPsss);
        return IDuser.getId();
    }

    public ArrayList<userModel> getAllUser() {
        return db_User.getAllUsers();
    }

    public boolean validEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }
}
