package lesson8;

import java.time.LocalDate;

public abstract class L8Cars {

    private String type;
    private String brand;
    private int age;
    private L8CarState carState;
    private LocalDate prodyceDate;

    private void brandChek (String message) {
        if (brand.equals("BMW")) {
            IllegalArgumentException exception = new  IllegalArgumentException();
            throw exception;
        }
        if (brand.equals("TOYOTA")) {
            IllegalArgumentException exception = new  IllegalArgumentException();
            System.out.println(message);
            throw exception;
        }
    }

    private void ageChek (String message) {
        if (age < 1990) {
            IllegalArgumentException exception = new  IllegalArgumentException();
            System.out.println(message);
            throw exception;
        }
    }

    private void stateChek (String message) {
        if (carState == L8CarState.XLAM) {
            IllegalArgumentException exception = new IllegalArgumentException ();
            System.out.println(message);
            throw exception;
        }
    }

    public L8Cars(String type, String brand, int age, L8CarState carState) {
        this.type = type;
        this.brand = brand;
        this.age = age;
        this.carState = carState;
        stateChek("Wrong STATE!!!");
        ageChek("Wrong AGE!!!");
        brandChek("Wrong Brand!!!");
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
        brandChek("Wrong Brand!!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        this.age = age;

        ageChek("Wrong AGE!!!");
    }

    public L8CarState getCarState() {
        return carState;
    }

    public void setCarState(L8CarState carState) {
        this.carState = carState;
        stateChek("Wrong STATE!!!");
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

}
