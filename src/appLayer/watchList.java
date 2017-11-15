package appLayer;

import dataLayer.DBuser;
import webapp.userModel;

import java.util.ArrayList;

public class watchList {
    private DBuser db_User = new DBuser();

    public ArrayList<userModel> getMovies(){ return db_User.getMovies(); }

}
