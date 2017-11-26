package webapp.models;

public class commentFormatObject {
    int idmovie, iduser;
    String rating, comment, uname;
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdmovie() {
        return idmovie;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIdmovie(int idmovie) {
        this.idmovie = idmovie;
    }

    public String getComment() {
        return comment;
    }

    public String getRating() {
        return rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
