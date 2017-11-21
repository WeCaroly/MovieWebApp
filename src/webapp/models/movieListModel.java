package webapp.models;

public class movieListModel {
    int idList, iduser, idmovie;

    public int getIdList() {
        return idList;
    }

    public void setIdList(int idList) {
        this.idList = idList;
    }

    public void setIdmovie(int idmovie) {
        this.idmovie = idmovie;
    }

    public int getIduser() {
        return iduser;
    }

    public int getIdmovie() {
        return idmovie;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
