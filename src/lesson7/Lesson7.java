package lesson7;

import myClasses.CircleX;
import myClasses.SquareX;
import myClasses.TriangelX;

public class Lesson7 {

    public static void main(String[] args) {

        /*SquareX square1 = new SquareX();
        square1.callPerimetrSQ();
        CircleX circle1 = new CircleX();
        circle1.circleLength();
        TriangelX tr1 = new TriangelX();
        tr1.perimetrTr();*/

        Shape squareX = new SquareX();
        Shape circleX = new CircleX();
        Shape triangleX = new TriangelX();

        // Object[] basket = {square1, circle1, tr1}; // Naiti figuru s sam6m bolshim PERIMETROM

        Shape[] basket = {squareX, circleX, triangleX};
        int maxPerOfShapes = 0;
        for (int i = 0; i < basket.length; i++) {
            Shape shape = basket[i];
            int currentPer = shape.calcPerimetr();
            if (currentPer > maxPerOfShapes) {
                maxPerOfShapes = currentPer;
            }

            /*Object shape = basket[i];
            if (shape instanceof SquareX) {
                SquareX square = (SquareX) shape; // prikastili kvadrat k classu shape(figur6)
                int currentPer = square.callPerimetrSQ();
                if (currentPer > maxPerOfShapes) {
                    maxPerOfShapes = currentPer;
                }
            }
            if (shape instanceof CircleX) {
                CircleX circle = (CircleX) shape;
                int currentPer = circle.circleLength();
                if (currentPer > maxPerOfShapes) {
                    maxPerOfShapes = currentPer;
                }
            }
            if (shape instanceof TriangelX) {
                TriangelX triangel = (TriangelX) shape;
                int currentPer = triangel.perimetrTr();
                if (currentPer > maxPerOfShapes) {
                    maxPerOfShapes = currentPer;
                }*/
        }
        System.out.println("Max per of SHAPES is : " + maxPerOfShapes);
        System.out.println(CircleX.Pip);
    }
}

