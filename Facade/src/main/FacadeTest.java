public class FacadeTest {
    public static void main (String [] args){
        voyageFacade vf = new voyageFacade();
        vf.reserverBus();
        vf.reserverMarin();
        vf.reserverVol();
    }
}
