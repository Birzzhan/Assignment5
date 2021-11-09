public class voyageFacade {
    private Voyage vol,
                  marin,
                  bus;

    public voyageFacade() {
        vol=new Vol();
        marin=new Marin();
        bus=new Bus();
    }
    public void reserverVol(){
        vol.reservation();
    }
    public void reserverBus(){
        bus.reservation();
    }
    public void reserverMarin(){
        marin.reservation();
    }

}
