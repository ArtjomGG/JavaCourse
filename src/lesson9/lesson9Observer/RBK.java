package lesson9.lesson9Observer;

public class RBK implements Observer {

    @Override
    public void getEvent(String forecast) {
            System.out.println("RBK report ...");
            System.out.println("Blah Blah " + "...weather is " + forecast);

        }
    }
