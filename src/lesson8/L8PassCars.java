package lesson8;

import java.time.LocalDate;

public class L8PassCars extends L8Cars {

    private void secretMetodForLesson117() {
        System.out.println("Tsssss.....");
    };

    private int passengers;

    public L8PassCars(String type, String brand, int age, L8CarState carState, int passengers) {
        super(type, brand, age, carState);
        this.passengers = passengers;
    }

    public L8PassCars(String brand, LocalDate prodyceDate) {
        super(brand, prodyceDate);
    }

    //Легкового: ПассажироМестаКоэфПассажиромест - возрастАвтомобиляКоэфВозраста+техничСостояние*КоэфТехнСостояния


    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
