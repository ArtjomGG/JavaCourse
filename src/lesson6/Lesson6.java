package lesson6;

import myClasses.Men;
import myClasses.Triangel;

public class Lesson6 {
    public static void main(String[] args) {

Men m = new Men();

        m.setGender(Men.MAN); /// TODO: Utochnit po polu cheloveka
        m.setFirstName("Ivan");
        m.setLastName("Dubkov");
        m.setAge(36);
        m.setExperience(15);


        //System.out.println("F_name: " + m.firstName);
        //System.out.println("L_name: " + m.lastName);
        //System.out.println("Age: " + m.age);
        //System.out.println("Exp: " + m.experience);

System.out.println("Gender : " + m.getGender());
        System.out.println("F_name: " + m.getFirstName());
        System.out.println("L_name: " + m.getLastName());
        System.out.println("Age: " + m.getAge());
        System.out.println("Exp: " + m.getExperience());


Triangel triangel = new Triangel(4, 5, 6);
        double perimetr = triangel.calculatePerimetr();
        double square = triangel.calculateSquare();
        System.out.println("Perimetr is: " + perimetr);
        System.out.println("Square is: " + square);


System.out.println("A = " + triangel.getAStorona());
        triangel.setAStrona(8);
        System.out.println("A 8?= " + triangel.getAStorona());
        System.out.println("Perimetr is with A=8: " + perimetr); //TODO: Pochemu ne pomenjal AStoronu na 8??


        }

    }

