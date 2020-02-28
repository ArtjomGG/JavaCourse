package lesson9.lesson9Observer;

public class CNN implements Observer {

    @Override
    public void getEvent(String forecast) {
            System.out.println("CNN report ...");
            System.out.println("Blah Blah " + "...weather is " + forecast);
        }

    }

