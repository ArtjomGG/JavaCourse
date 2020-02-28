package lesson9.lesson9Observer;

public class EuroNews implements Observer {

    @Override
    public void getEvent(String forecast) {
        System.out.println("EuroNews report ...");
        System.out.println("Blah Blah " + "...weather is " + forecast);

    }
}
