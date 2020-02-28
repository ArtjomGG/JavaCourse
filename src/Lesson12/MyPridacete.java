package Lesson12;

import lesson8.L8Cars;

import java.util.function.Predicate;

public class MyPridacete implements Predicate <L8Cars> {
    @Override
    public boolean test(L8Cars l8_cars) {
        return l8_cars.getBrand().equals("BMW");
    }
}
