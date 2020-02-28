package Lesson12;

import lesson11.generic.CitizenIns;
import lesson11.generic.EmployeeIns;
import lesson8.L8CarState;
import lesson8.L8Cars;
import lesson8.L8PassCars;
import myClasses.Person;

import java.util.function.*;

public class Lesson12FunctionalInerface {

    static String supplyStringForPrint() {
        return 1 == 3 ? "RR" : "FF";
    }

    static void printSmth(String forPrint) {
        System.out.println(forPrint);
    }

    static void printSmthWithSuplier(Supplier<String> stringSupplier) {
        System.out.println(stringSupplier.get());
    }

    // M6 v6z6vaem v parametre funciju kotoraja implementiruet Supplier
    static void printSmthSupp(Supplier<String> stringSupplier) {
        System.out.println(stringSupplier.get());
    }

    //
    static String useFunction(Function<Integer, String> function, Integer integer) {
        return function.apply(integer);
    }

    static void usePredicate(Predicate<L8Cars> carsPredicate, L8Cars testCar) {
        boolean isOK = carsPredicate.test(testCar);
        System.out.println(isOK ? "Car is OK" : "Not Good One");
    }

    // Unarn6jOperator cherez class unarn6j operator, chtob6 menjal SALARY na 100

    static void useUmaryOperator(UnaryOperator<Person> unaryOperator, Person person) {
        System.out.println("Pers sel before UO " + person);
        unaryOperator.apply(person);
        System.out.println("Pers sel After UO " + person);
    }

    // UnaryOper dlja v6zova v Lamda
    static void activeUseofCar(UnaryOperator<L8Cars> unOpeForCar, L8Cars l8CarsForUO) {
        System.out.println("Car sel before UO " + l8CarsForUO);
        unOpeForCar.apply(l8CarsForUO);
        System.out.println("Car sel AFTER UO " + l8CarsForUO);
    }

    // BiFunktion dlja poscheta srednego vozrosta
    static void getAvrgAgeOfInsClientsBiFun(BiFunction<CitizenIns, EmployeeIns, Double> biFun,
                                            CitizenIns citizenForBiFun,
                                            EmployeeIns employeeForBiFun) {
        System.out.println(("Avarage age is STATIC VOID" + biFun.apply(citizenForBiFun, employeeForBiFun)));
    }

    //BiConsumer dlja togo chtob6 pozhinit' dvuh Person
    static void marriage(BiConsumer<CitizenIns, CitizenIns> zags, CitizenIns groom, CitizenIns bride) {
        System.out.println("Before merriage " + groom + " and " + bride);
        zags.accept(groom, bride);
        System.out.println("After merriage " + groom + " and " + bride);
    }


    public static void main(String[] args) {

        // Cherez class MySupplier
        Supplier<String> classSuplier = new MySupplier();

        // V6zov cherez anonimn6j Suplier
        Supplier<String> anonymosSupplier = new Supplier<String>() {

            @Override
            public String get() {
                return "From Anonymos Supplier";
            }
        };

        // V6zov cherez Lamda
        Supplier<String> lamdaSupp = () -> "From Lamda Supplier";


        printSmth("Ho-ho");
        printSmth("Bla");
        System.out.println("***************************");

        printSmthSupp(lamdaSupp);
        printSmthSupp(classSuplier);
        printSmthSupp(anonymosSupplier);
        System.out.println("***************************");

        //printSmthWithSuplier (()->( int i = 100;return ("A" + i;)));

        int age = 1300;
        printSmthWithSuplier(() -> "Age " + age);
        System.out.println("***************************");

        // Cherez class MyFunctio
        Function<Integer, String> classFunction = new MyFunction();

        // Anonim
        Function<Integer, String> anonymosFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "String From Anonymos Function " + integer.toString();
            }
        };
        // LAMDA use
        Function<Integer, String> lamdaFunction = (zadadimParametr) -> "From Lamda " + zadadimParametr.toString();

        System.out.println(useFunction(classFunction, 100));
        System.out.println(useFunction(anonymosFunction, 200));
        System.out.println(useFunction(lamdaFunction, 500));
        System.out.println("***************************");

        System.out.println(useFunction((i) -> i + "FromInLine Lamda", 222));
        System.out.println(useFunction((i) -> "FromInLine Lamda" + i, 222));
        System.out.println("***************************");

        Predicate<L8Cars> classPredicate = new MyPridacete();
        L8Cars carForPredicate1 = new L8PassCars("PASS", "BMW", 2019, L8CarState.EXL, 5);
        L8Cars carForPredicate2 = new L8PassCars("PASS", "MB", 2019, L8CarState.EXL, 5);

        usePredicate(classPredicate, carForPredicate1);
        usePredicate(classPredicate, carForPredicate2);
        System.out.println("***************************");

        usePredicate((car) -> car.getAge() > 2020, carForPredicate1);
        usePredicate((car) -> car.getAge() >= 2019, carForPredicate1);

        Person personForUO = new Person("Akki", true, 25, "DELL", 25000);
        MyUnaryOperator classUnaryOperator = new MyUnaryOperator();
        useUmaryOperator(classUnaryOperator, personForUO);

        // izmenili SALARY cherez Lamdu i class MyUnaryOperator
        int delta = 67;
        useUmaryOperator((p) -> {
            p.salary += delta;
            return p;
        }, personForUO);

        //Ispolzuja UO pomenjat nazvanie kompanii i uvelichit' SALARY v 2 raza
        useUmaryOperator((personForSUN) -> {
            personForSUN.salary = 2 * personForUO.salary;
            personForSUN.companyName = "SUN";
            return personForSUN;
        }, personForUO);

        L8Cars carForUnaryOp = new L8PassCars("PASSENGER", "FERARRI", 2019, L8CarState.EXL, 5);

        //Ispolzuja UO dlja Car, chtob6 pomenjat sostojanie mashin6
        activeUseofCar((c) -> {
            c.setCarState(L8CarState.REPAIR);
            c.setBrand("ZAPOROZHEC");
            ;
            return c;
        }, carForUnaryOp);

        // Ispolzuju BiFun Chtob6 v6schitat srednij vozrast klientov Strahovoj

        CitizenIns personForBiFun1 = new CitizenIns("Dima", 50, "WORKER", 25000);
        EmployeeIns personForBiFun2 = new EmployeeIns("Jana", 30, "MANAGER", 15000);

        getAvrgAgeOfInsClientsBiFun((cit, empl) -> {
            double result = 0;
            result = (cit.getAge() + empl.getAge()) / 2;
            return result;
        }, personForBiFun1, personForBiFun2);

        // Sokrashennaja versija zapisi
        getAvrgAgeOfInsClientsBiFun((cit, empl) -> new Double((cit.getAge() + empl.getAge()) / 2),
                personForBiFun1, personForBiFun2);

        // Ispolzuju BiConsumer Chtob6 zhenit'

        CitizenIns frank = new CitizenIns("Frank", 35, "Ivanov", "WORKER",25000);
        CitizenIns julia = new CitizenIns("Julia", 35, "Sidorova", "WORKER",25000);

        marriage((gr,br) -> br.setSecondName(gr.getSecondName()),frank, julia);

    }
}
