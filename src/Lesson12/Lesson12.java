package Lesson12;

import lesson11.generic.CitizenIns;
import lesson11.generic.EmployeeIns;
import lesson11.generic.PersonIns;
import lesson8.L8CarState;
import lesson8.L8Cars;
import lesson8.L8PassCars;
import lesson8.L8Truks;

import java.util.HashMap;
import java.util.Map;

public class Lesson12 {

    public static void main(String[] args) {

        Map<String, PersonIns> people = new HashMap<>(20);
        PersonIns p1 = new CitizenIns("Jack", 45, "WORKER", 8000);
        PersonIns p2 = new CitizenIns("John", 40, "WORKER", 6000);
        PersonIns p3 = new CitizenIns("Julian", 45, "WORKER", 9000);
        PersonIns p4 = new EmployeeIns("Alfonso", 45, "INSENER", 24000);

        people.put(p1.getName(), p1);
        people.put(p2.getName(), p2);
        people.put(p3.getName(), p3);
        System.out.println(people);
        System.out.println("*********************************************");

        people.put(p1.getName(), p2);
        people.put(p2.getName(), p3);
        System.out.println(people);
        System.out.println("*********************************************");

        people.put(p2.getName(), p4);
        people.put(p2.getName(), p3);
        System.out.println(people);
        System.out.println("*********************************************");

        System.out.println(people.get("Jack").getAge());

        L8Cars carHashMap1 = new L8Truks("TRUCK", "VOLVO", 1999, L8CarState.AVRG, 5000);
        L8Cars carHashMap2 = new L8Truks("TRUCK", "VOLVO", 2012, L8CarState.EXL, 5000);
        L8Cars carHashMap3 = new L8Truks("TRUCK", "SCANIA", 1980, L8CarState.REPAIR, 5000);
        L8Cars carHashMap4 = new L8PassCars("PASS", "VW", 2018, L8CarState.REPAIR, 7);
        L8Cars carHashMap5 = new L8PassCars("PASS", "MB", 2020, L8CarState.EXL, 6);
        L8Cars carHashMap6 = new L8PassCars("PASS", "NISSAN", 2012, L8CarState.AVRG, 6);

        String bKEY1 = carHashMap1.getBrand() + carHashMap1.getAge(); // Sosdaetja KLUCH, na sluchaj esli k nemu nado obrashat'jsa
        Map<String, L8Cars> carsHashMap = new HashMap<>();

        carsHashMap.put(carHashMap1.getBrand() + carHashMap1.getAge(), carHashMap1);
        carsHashMap.put(carHashMap2.getBrand() + carHashMap2.getAge(), carHashMap2);
        carsHashMap.put(carHashMap3.getBrand() + carHashMap3.getAge(), carHashMap3);
        carsHashMap.put(carHashMap4.getBrand() + carHashMap4.getAge(), carHashMap4);
        carsHashMap.put(carHashMap5.getBrand() + carHashMap5.getAge(), carHashMap5);
        carsHashMap.put(carHashMap6.getBrand() + carHashMap6.getAge(), carHashMap6);
        System.out.println("Total CARS is : " + carsHashMap.size());
        System.out.println("*********************************************");

        Map<String, L8Cars> carsHashMapNew = new HashMap<>();
        // carsHashMapNew = carsHashMap; // Prisvaevaetsja ss6lka, No ne sam objekt
        carsHashMap.putAll(carsHashMap);
        System.out.println("NEW CARS is : " + carsHashMap.size());
        System.out.println("*********************************************");

        L8Cars lookUpCar = carsHashMap.get("MB2020");
        System.out.println(" Look up " + lookUpCar); // Nado v classe  L8Cars zadefinirovat' toString!!!

    }


}
