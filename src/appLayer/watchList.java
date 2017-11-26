package appLayer;

import dataLayer.DBuser;
import webapp.models.movieModel;

import java.util.ArrayList;

public class watchList {
    int iduser, idmovie, comment;
    private DBuser db_User = new DBuser();

    public ArrayList<movieModel> getMovies(){ return db_User.getMovies(); }

    public ArrayList<movieModel> getMyMovies(int id){ return  db_User.getMyMovies(id);}

    public void setMyMovie(int iduser, int idmovie) {
        db_User.addToMyMovies(idmovie, iduser);
    }


    public void getComments(int idmovie){db_User.getComment(idmovie);}
    //db.addComment
    public void addComments(){}

    //public void set TODO when it is clicked then this should be called to get the item id
    //TODO when the item id is found then call watchlist in appLayer
}
