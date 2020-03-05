package lesson8;

import java.time.LocalDate;

public class L8Truks extends L8Cars {

    private int carryingСapacity;

    private void secretMetod() {
        System.out.println("Tssss.....");
    }

    public L8Truks(String type, String brand, int age, L8CarState carState, int carryingСapacity) {
        super(type, brand, age, carState);
        this.carryingСapacity = carryingСapacity;
    }

    private L8Truks(String brand, LocalDate prodyceDate) {
        super(brand, prodyceDate);
    }

    public int getCarryingСapacity() {
        return carryingСapacity;
    }

    public void setCarryingСapacity(int carryingСapacity) {
        this.carryingСapacity = carryingСapacity;
    }


}





