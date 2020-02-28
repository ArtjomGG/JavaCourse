package lesson13;

import lesson11.generic.CitizenIns;
import lesson8.L8CarState;
import lesson8.L8Cars;
import lesson8.L8PassCars;

import java.util.Optional;

public class Lesson13 {
    public static void main(String[] args) {

        CitizenIns citizenNull = null;
        CitizenIns citizenForOp = new CitizenIns("Joe", 25, "WORK", 2500);
        CitizenIns citizenDefolt = new CitizenIns("NAME", 99, "Type", 0000);

        L8Cars carForOpt1 = null;
        L8Cars carForOpt2 = new L8PassCars("PASS", "SUBARU", 10, L8CarState.EXL,5);

        Optional optionalEmpty = Optional.empty(); //Object kotor6j ponimaet chto vnutri lezhit chto-to
        Optional<CitizenIns> optEmpty = Optional.empty();
        Optional<CitizenIns> optJoe = Optional.of(citizenForOp);
        Optional<CitizenIns> optNull = Optional.ofNullable(citizenNull);

        Optional<L8Cars> optionalL8Cars = Optional.of(carForOpt2);

        System.out.println(".get() from Optional: " + optJoe.get()); // chtob6 dostat. vnutrennisti Opt nuzhno ispolzovat' metod "get"
        // System.out.println(".get() from Optional: " + optEmpty.get());
        // System.out.println(".get() from Optional: " + optNull.get());

        if(optEmpty.isPresent() ){
            System.out.println(".get() from Optional: " + optEmpty.get());
        }

        if (optNull.isPresent()){
            System.out.println(".get() from Optional: " + optNull.get());
        }
// Beret objek i proverjaet est li Objekt i esli net to vozvras'haet DEFOLT
        System.out.println(".orElse(T t) from Optinal: " + optJoe.orElse(citizenDefolt));
        System.out.println(".orElse(T t) from Optinal: " + optNull.orElse(citizenDefolt));

// Variant s SUPPLIER
        System.out.println(".orElseGet(Supplier<T> t) from Optinal: "
                + optJoe.orElseGet(()->{
                    return citizenDefolt;}));

        // Uproshennaja versija zapisanija v kotoroj ne trebuetsja .orElse" Get", tak kak object b6l uzhe sozdan
        System.out.println(".orElseGet(Supplier<T> t) from Optinal: "
                + optJoe.orElse(citizenDefolt));


        System.out.println(".orElseGet(Supplier<T> t) from Optinal: "
                + optJoe.orElseGet(()->{
                    CitizenIns result = new CitizenIns("DEFOLT", 99, "DEFOLT",0000);
                    return result;
                }));
// Ispolzuja SUPPLIER m6 vpis6vaem logiku esli prihodit pustoj to objekt DEFOLT budet sozdan, a tak in ne zanimaet mesto
        System.out.println(".orElseGet(Supplier<T> t) from Optinal: "
                + optJoe.orElseGet(()-> new CitizenIns("DEFOLT", 99, "DEFOLT",0000)));

        // Eslipuluchaet objekt, to logika v6polnjaetsja
        optJoe.ifPresent((c)-> {
            System.out.println("Hello from Consumer!");
            System.out.println("I've consumed: " + c.getName());
            System.out.println("I'm very happy...");
        });

        optNull.ifPresent((c)-> {
            System.out.println("Hello from Consumer!");
            System.out.println("I've consumed: " + c.getName());
            System.out.println("I'm very happy...");
        });

    }
}
