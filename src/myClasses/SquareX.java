package myClasses;


import lesson7.Shape;

import java.util.Scanner;

public class SquareX extends Shape {

    public SquareX() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input side for Sq: .... ");
        Integer sideConsole = scanner.nextInt();

        this.side = sideConsole;
        System.out.println("You input: " +  sideConsole);
    }
@Override
    public int calcPerimetr() {
        int perimetrSQ = 4*side;;
        System.out.println("Perimetr SQ: " +  perimetrSQ);
        return perimetrSQ;
    }

    public void printFromSquare () {
        System.out.println("Square!!!");
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
