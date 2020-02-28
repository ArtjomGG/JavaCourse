package lesson9.lesson9Observer;

import java.util.ArrayList;
import java.util.Arrays;

public class MeteoSation {

    // ArrayList kolllekcija (hranilis'he=resinov6j massiv), kotor6ja rastet po mere dobavlenija elementov
    ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) { // metod dlja dobavlenija obozrevatelja po odnomu
        observers.add(observer);
    }

    public void addObserverS(Observer... observers) { // metod dlja dobavlenija obozrevatelEJ "(TIP...massiv)" vidit kak massiv
        this.observers.addAll(Arrays.asList(observers));
    }

    public void removeObserver (Observer observer) { // metod dlja udalenija obozrevatelja, naprimer esli propala podpiska
        observers.remove(observer);
    }

    public void  eventFired(String event) { // metod esli sluchilos' sob6tie
        for (Observer obs:observers ) { // drugoi metod progona po kollekcii: " for ( TIP peremennaja:arrayList) "
            obs.getEvent(event);
        }

    }

}
