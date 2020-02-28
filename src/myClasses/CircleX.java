package myClasses;

import lesson7.Shape;

import java.util.Scanner;

public class CircleX extends Shape { // class KRUGI razshirjaet class SHAPE

    public static double Pip = 3.14; // prinadlezhit k klassu i v6z6vaetsja s klassom


    public CircleX() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input radius : .... ");
        Integer radiusXConsole = scanner.nextInt();

        this.side = radiusXConsole;
        System.out.println("You input of radius: " + radiusXConsole);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(" bai bai ..."); // motod kotor6j budet v6zvan gthtl ntv rfr jbject budet peredan Garbege collecotu
    }

    @Override
    public int calcPerimetr() {
        int lengthC = (int) (2 * Math.PI * side); // zakastili "double" k "int"
        System.out.println("Length of C: " + lengthC);
        return lengthC; // zakastili "double" k "int"
    }

    public void printFromCircle() {
        System.out.println("Circle!!!");
    }

    public int getRadiusX() {
        return side;
    }

    public void setRadiusX(int radiusX) {
        this.side = radiusX;
    }

}
