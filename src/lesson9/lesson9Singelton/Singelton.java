package lesson9.lesson9Singelton;

public final class Singelton { // esli "final" to ego ne unasledovat'

    private Singelton() {

    }

    /*private static Singelton instance = new Singelton();
    public static Singelton getInstance(){ // metod kotor6j vozvras'haet objekt
        return instance;
    }
    */

    private static Singelton instance;

    public static Singelton getInstance() {
        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }
}
