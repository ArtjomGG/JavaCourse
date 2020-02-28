package lesson14;

import lesson8.L8CarState;
import lesson8.L8Cars;
import utils.CarUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static lesson8.L8CarState.*;
import static utils.CarUtils.generateCar;

public class Lesson14 {

    public static void main(String[] args) {
        List<L8Cars> cars = CarUtils.generListCar(5);

        System.out.println(cars);

        //System.out.println("REPAIR CAR: " + CarUtils.findOneCarByState(L8CarState.REPAIR, cars));
        //System.out.println("EXL: " + CarUtils.findOneCarStream(L8CarState.EXL, cars));
        //System.out.println("AVRG: " + CarUtils.findOneCarStreamLamda(L8CarState.AVRG, cars));

        System.out.println("XLAM : " + cars.stream()
                .filter(car -> car.getCarState() == XLAM)
                .findFirst().get());
        System.out.println("**********************************************");

        System.out.println("2000 : " + cars.stream()
                .filter(car -> car.getAge() == 2000)
                .findFirst().orElse(null));
        System.out.println("**********************************************");

        System.out.println("2000 or  : " + cars.stream()
                .filter(car -> car.getAge() == 2000)
                .findFirst().orElse(generateCar()));
        System.out.println("**********************************************");

        cars.stream().forEach(car -> System.out.println(car));
        cars.stream().filter(car -> car.getCarState() == XLAM)
                .forEach(car -> System.out.println(car));
        System.out.println("**********************************************");

        System.out.println("EXL count : " + cars.stream()
                .filter(car -> car.getCarState() == EXL).count());
        System.out.println("**********************************************");

        System.out.println("EXL count : " + cars.stream()
                .filter(car -> car.getCarState() == EXL)
                .peek(car -> System.out.println("peek()... Yeare" + car.getAge()))
                .peek(car -> System.out.println("peek()... Brand" + car.getBrand()))
                .count());
        System.out.println("**********************************************");


        System.out.println("XLAM count : " + cars.stream()
                .peek(car -> System.out.println("peek()... Year" + car.getAge()))
                .peek(car -> System.out.println("peek()... Brand" + car.getBrand()))
                .filter(car -> car.getCarState() == XLAM)
                .peek(car -> System.out.println("peek()... Year" + car.getAge()))
                .peek(car -> System.out.println("peek()... Brand" + car.getBrand()))
                .count());
        System.out.println("**********************************************");

        int year = LocalDate.now().getYear();

        System.out.println("EXL count : " + cars.stream()
                .filter(car -> car.getCarState() == EXL)
                .peek(car -> System.out.println("exl Car is " + car.getBrand() + "exl Age is " + (year - car.getAge())))
                .count());
        System.out.println("**********************************************");

        //long count = cars.stream();

        cars.stream().filter(c -> c.getCarState() == XLAM)
                .forEach(c -> System.out.println("XLAM BRAND : " + c.getBrand() + " : XLAM AGE : "
                        + (year - c.getAge())));

// vorma zapisi Ternarn6j operator
        boolean hasAvrg = cars.stream().anyMatch(car -> car.getCarState() == AVRG);
        String massage = hasAvrg ? "We have a AVRG car " : "All cars GOOD ";
        System.out.println(massage);

        boolean anyMatch = cars.stream().anyMatch(car -> car.getCarState() == REPAIR);
        System.out.println(anyMatch ? "We have a REPAIR car " : "All cars GOOD ");

        boolean allMatch = cars.stream().allMatch(car -> car.getCarState() == EXL);
        System.out.println(allMatch ? "All Cars EXL " : "All cars GOOD ");

        boolean anyOlder18Years = cars.stream().anyMatch(car -> ((year - car.getAge()) == 18));
        System.out.println(anyOlder18Years ? "Have car 18 years " : "All cars Younger 18 ");

        boolean allYounger24Years = cars.stream().allMatch(car -> ((year - car.getAge()) < 24));
        System.out.println(allYounger24Years ? "Have car 25 years " : "All cars Younger 24 ");

        boolean allYounger5Years = cars.stream().allMatch(car -> getAgeOtdelno(car) < 5); // ispolzuet otdeln6j metod po podshetu goda
        System.out.println(allYounger5Years ? "Have car 5 years " : "All cars Younger 5 ");


        List <L8CarState> listOfStates = cars.stream() // LIST v6vodit vse v spiske
                .map(car -> car.getCarState())
                .peek(L8CarState -> System.out.println("Car Statefrom PEAK " + L8CarState)) // promeshutochnoe dejstvie
                .collect(Collectors.toList()); // vozvras'haet collekciju
        System.out.println(listOfStates);

        Set<L8CarState> setOfStates = cars.stream() // SET ne budet dublikatov!!!
                .map(car -> car.getCarState())
                .collect(Collectors.toSet());
        System.out.println(setOfStates);
        System.out.println("**********************************************");

        cars.stream().peek(car -> System.out.println("Car State from PEAK " + car))
                .map(car-> car.getAge())
                .peek( y -> System.out.println("CARS ages peek : " + y))
                .map(y->y+3)
                .peek(ny -> System.out.println( "New CAR Yere peek : " + ny))
                .count(); // eli ne v6zvali zavershajushj operacii NE SRABOTAET
    }



    // Staticheskij metod iniciliziruetsja srazu i dostupen v ljubom meste

    private static int getAgeOtdelno(L8Cars car) {
        return LocalDateTime.now().getYear() - car.getAge();
    }
}
