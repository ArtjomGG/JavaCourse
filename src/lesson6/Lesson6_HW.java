package lesson6;

import myClasses.TriangelByCoord;

public class Lesson6_HW {

    public static void main(String[] args) {

        TriangelByCoord triangel1 = new TriangelByCoord(1.0, 1.0, 3, 5, 4, 3);
        TriangelByCoord triangel2 = new TriangelByCoord(-1.0, -1.0, 3, 5, 4, 3);

        double findAB = triangel2.findSideAB();
        double findAC = triangel2.findSideAC();
        double findBC = triangel2.findSideBC();

        double sguareByCoord = triangel2.squareByCoord();
        double perimetrByCoord = triangel2.perimetrByCoord();

        System.out.println( "Side AB is : " + findAB);
        System.out.println("Side AC is : " + findAC);
        System.out.println("Side BC is : " + findBC);
        System.out.println("Perimetr is : " + perimetrByCoord);
        System.out.println("Square is : " + sguareByCoord);

    }
}
