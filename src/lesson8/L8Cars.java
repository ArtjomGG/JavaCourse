package lesson8;

import java.time.LocalDate;

public abstract class L8Cars {

    private String type;
    private String brand;
    private int age;
    private L8CarState carState;
    private LocalDate prodyceDate;

    public L8Cars(String type, String brand, int age, L8CarState carState) {
        this.type = type;
        this.brand = brand;
        this.age = age;
        this.carState = carState;
    }

    public L8Cars(String brand, LocalDate prodyceDate) {
        this.brand = brand;
        this.prodyceDate = prodyceDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public L8CarState getCarState() {
        return carState;
    }

    public LocalDate getProdyceDate() {
        return prodyceDate;
    }

    public void setProdyceDate(LocalDate prodyceDate) {
        this.prodyceDate = prodyceDate;
    }

    @Override
    public String toString() {
        return "L8Cars{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", age=" + age +
                ", carState=" + carState +
                '}';
    }

    public void setCarState(L8CarState carState) {
        this.carState = carState;
    }
}
