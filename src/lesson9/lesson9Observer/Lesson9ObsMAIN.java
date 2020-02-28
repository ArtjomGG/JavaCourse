package lesson9.lesson9Observer;

public class Lesson9ObsMAIN {
    public static void main(String[] args) {

        Observer cnn = new CNN();
        Observer en = new EuroNews();
        Observer rbk = new RBK();

        MeteoSation meteo = new MeteoSation();

        /*meteo.addObserver(cnn);
        meteo.addObserver(en);
        meteo.addObserver(rbk);*/

        meteo.addObserverS(cnn,en,rbk);

        meteo.eventFired("Hurricane!!!");
        meteo.eventFired("Flood");
        meteo.removeObserver(rbk);
        meteo.eventFired("Hot!!!");


    }

}
