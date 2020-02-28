package lesson8;

public class L8Truks extends L8Cars {

    private int carryingСapacity;

    public L8Truks(String type, String brand, int age, L8CarState carState, int carryingСapacity) {
        super(type, brand, age, carState);
        this.carryingСapacity = carryingСapacity;
    }

    public int getCarryingСapacity() {
        return carryingСapacity;
    }

    public void setCarryingСapacity(int carryingСapacity) {
        this.carryingСapacity = carryingСapacity;
    }


}





