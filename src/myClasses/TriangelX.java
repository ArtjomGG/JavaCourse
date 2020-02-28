package myClasses;

import lesson7.Shape;

import java.util.Scanner;

public class TriangelX extends Shape {

    public TriangelX() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input positive number: .... ");
        Integer sideConsole = scanner.nextInt();

        this.side = sideConsole;
        System.out.println("You input: " + sideConsole);
    }

    @Override
    public int calcPerimetr() {
        int perimetrL = 3 * side;
        System.out.println("Perimetr of Tr : " + perimetrL);
        return perimetrL;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
