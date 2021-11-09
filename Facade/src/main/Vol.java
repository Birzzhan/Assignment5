public class Vol implements Voyage {

    private String idVol;
    private int nbPlace;

    public Vol() {
    }

    public Vol(String idVol, int nbPlace) {
        this.idVol = idVol;
        this.nbPlace = nbPlace;
    }

    public String getIdVol() {
        return idVol;
    }

    public void setIdVol(String idVol) {
        this.idVol = idVol;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public void reservation() {
        System.out.println("Vous avez réserver une place dans ce vol ");

    }
}
