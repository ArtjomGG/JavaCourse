package utils;

import lesson8.L8CarState;
import lesson8.L8Cars;
import lesson8.L8PassCars;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class CarUtils {

    public static List<L8Cars> generListCar(int amount) {
        List<L8Cars> result = new ArrayList<>();
        for (int i = 0; i <= amount; i++) {
            result.add(generateCar());
        }
        return result;
    }

    public static L8Cars generateCar() {
        String type = getType();
        int age = getRandomAge();
        String brand = getBrand();
        L8CarState state = getCarStateRnd();
        int passAmount = getrandomPassengers();
        return new L8PassCars(type, brand, age, state, passAmount);
    }

    public static L8Cars findOneCarByState(L8CarState state, List<L8Cars> cars) {
        L8Cars result = null;
        for (L8Cars car : cars) {
            if (car.getCarState() == state) {
                result = car;
                break; // najdet pervuju i sdelaet "brake", nado ubrat' chto v6vel vse
            }
        }
        return result;
    }

    public static L8Cars findOneCarStream(L8CarState state, List<L8Cars> cars) {
        Predicate<L8Cars> predicate = new Predicate<L8Cars>() {
            @Override
            public boolean test(L8Cars l8Cars) {
                return l8Cars.getCarState() == state;
            }
        };
        // vsjali "stream", dobavili "filter(s predikatom)", vozvras'haet "Optional" i metodom "get()" dostaem i korobochki
        return cars.stream().filter(predicate).findFirst().get();

    }
// Upros'hennaja zapis s "lamda"
    public static L8Cars findOneCarStreamLamda(L8CarState state, List<L8Cars> cars) {
        return cars.stream().filter(car -> car.getCarState()==state ).findFirst().get();
    }

    public static String getType() {
        String type = "PASS";
        return type;
    }


    public static int getRandomAge() {
        return (int) ((Math.random() * 25) + 1990);
    }


    public static String getBrand() {
        return UUID.randomUUID().toString();
    } // generator randomn6h String-ov

    public static int getrandomPassengers() {
        return (int) ((Math.random() * 4) + 1);
    }

    public static L8CarState getCarStateRnd() {
        int randomState = (int) (Math.random() * 5); // generit massiv
        return L8CarState.values()[randomState]; //vozvrashaet massiv i sootvetstvenno dostup po indeksu
    }

}
