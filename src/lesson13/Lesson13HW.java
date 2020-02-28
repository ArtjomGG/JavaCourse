/*
------------Lesson 13:------------
        1. create account in Github
        2. Modify Citizen and Employee: add birthDay (type: java.time.LocalDate;)
        3. Create static method, that use BiFunction to return the oldest Person
        from two People (based on Birth Day).
        4. Create static method, that use BiFunction to return the youngest Person
        from two People (based on Birth Day).
        5. Modify Car: instead of "int year;"  use:  java.time.LocalDate produceDate;
        6 Create static method, that use BiPredicate to define which car
        from two is older (based on produceDate).
*/

package lesson13;

import lesson11.generic.CitizenIns;
import lesson11.generic.PersonIns;
import lesson8.L8Cars;
import lesson8.L8PassCars;

import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Lesson13HW {

    static void findOldestOfPersonWithLocalDate(BiFunction<PersonIns, PersonIns, Boolean> biFun,
                                                PersonIns citForBiFun1,
                                                PersonIns citForBiFun2) {
        System.out.println(biFun.apply(citForBiFun1, citForBiFun2));
    }

    static void findOldestOfPersonWitConsumer(BiFunction<PersonIns, PersonIns, PersonIns> biFun,
                                              PersonIns citForBiFun1,
                                              PersonIns citForBiFun2, Consumer<PersonIns> persCons) {
        PersonIns personIns = biFun.apply(citForBiFun1, citForBiFun2);
        persCons.accept(personIns);
    }

    static void findOldestOfPerson(BiFunction<PersonIns, PersonIns, PersonIns> biFun,
                                   PersonIns citForBiFun1,
                                   PersonIns citForBiFun2) {
        System.out.println(biFun.apply(citForBiFun1, citForBiFun2));
    }

    static void findoldestCarWithPredicate(BiPredicate<L8PassCars, L8PassCars> carsPred, L8PassCars testCar1, L8PassCars testCar2) {
        boolean isOlder = carsPred.test(testCar1, testCar2);
        System.out.println((isOlder ? "car1 is Older and " + testCar1.getBrand() : "car2 is Older and " + testCar2.getBrand()));
    }

    public static void main(String[] args) {

        PersonIns anton = new CitizenIns("Anton", LocalDate.of(1980, 10, 10));
        PersonIns kostja = new CitizenIns("Kostja", LocalDate.of(1988, 2, 28));
        PersonIns gleb = new CitizenIns("Gleb", LocalDate.of(1978, 8, 30));

        findOldestOfPersonWithLocalDate((cit1, cit2) -> {

            LocalDate cit1Birth = cit1.getBirthday();
            LocalDate cit2Birth = cit2.getBirthday();
            boolean result;

            if (result = (cit1Birth.isBefore(cit2Birth))) {
                System.out.println("oldest is " + cit1.getName() + " " + cit1.getBirthday());

            } else {
                System.out.println("Oldest is " + cit2.getName() + " " + cit2.getBirthday());
            }

            return result;

        }, anton, kostja);

        findOldestOfPersonWithLocalDate((cit1, cit2) ->
                        (cit1.getBirthday().isAfter(cit2.getBirthday())),
                kostja, gleb);

        findOldestOfPerson((cit1, cit2) -> {
                    if (cit1.getBirthday().isAfter(cit2.getBirthday())) {
                        return cit2;
                    }
                    else return cit1;
                },
                kostja, gleb);

        findOldestOfPersonWitConsumer((cit1, cit2) -> {
            if (cit1.getBirthday().isAfter(cit2.getBirthday())) {
                return cit2;
            }
                    else return cit1;
                }, kostja, anton, (oldest) ->
                        System.out.println("Hello from consumr!!! " + oldest)
        );

        L8PassCars nissan = new L8PassCars("Nissan", LocalDate.of(2000, 02, 01));
        L8PassCars toyota = new L8PassCars("Toyota", LocalDate.of(2000, 01, 01));
        L8PassCars mazda = new L8PassCars("Mazda", LocalDate.of(2010, 01, 01));

        BiPredicate<L8PassCars,L8PassCars> classBiPred = new MyBiPredicate();

        findoldestCarWithPredicate(classBiPred,nissan,toyota);
    }

    private static class MyBiPredicate implements BiPredicate<L8PassCars,L8PassCars> {
        @Override
        public boolean test(L8PassCars l8PassCars, L8PassCars l8PassCars2) {
            return l8PassCars.getProdyceDate().isAfter(l8PassCars2.getProdyceDate()) ;
        }
    }}