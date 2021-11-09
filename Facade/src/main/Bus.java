public class Bus implements Voyage{
    private String idBus ;
    private int nbPlace;

    public Bus() {
    }

    public Bus(String idBus, int nbPlace) {
        this.idBus=idBus;
        this.nbPlace = nbPlace;
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public void reservation() {
        System.out.println("Vous avez réserver une place dans ce bus ");
    }
}
