package webapp.models;

public class recomendListModel {
    int idfreind, iduser, idmovie;

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdmovie() {
        return idmovie;
    }

    public int getIduser() {
        return iduser;
    }

    public int getIdfreind() {
        return idfreind;
    }

    public void setIdmovie(int idmovie) {
        this.idmovie = idmovie;
    }

    public void setIdfreind(int idfreind) {
        this.idfreind = idfreind;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
