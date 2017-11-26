package appLayer;

import dataLayer.DBuser;
import webapp.models.movieModel;

import java.util.ArrayList;

public class watchList {
    private DBuser db_User = new DBuser();

    public ArrayList<movieModel> getMovies(){ return db_User.getMovies(); }

    public ArrayList<movieModel> getMyMovies(int id){ return  db_User.getMyMovies(id);}

    public void setMyMovie(int iduser, int idmovie) {
        db_User.addToMyMovies(idmovie, iduser);
    }




}
