package lesson7;

/*
------------Lesson 7:------------
 1. Read: Ekkel_RUS: 206-266
 2.  В комании работают:  программисты (возраст,  имя, ЗП, язык программирования),
администраторы (возраст, имя, ЗП, отдел) и
бухгалтеры (возраст, имя, ЗП и отдел).
Создайте конструктор с параметрами   для всех классов для всех параметров.
Реализуйте в классе Компания метод, определяющий имя сотрудника   с самой  большой ЗП.
Naidite samogo molodogo sotrudnika.
Produmaite dizain klassov s uchetom podhodjashei ierarhii i nasledovanija.
*/

//TODO: Sosdal class-6"Lesson7_HW", dalee "PersOfCompQ7", potom"...IT", "...Admn", "..Finans".
// Poshemu posle sozdanija v class-e PersOfCompQ7 protekted "name,  age,..."
// ne daval v6vodit' constructor s poljami i getter+setter vclassah dlja sotrudnikov?

import myClasses.Q7Admins;
import myClasses.Q7Finans;
import myClasses.Q7Programmers;

public class Lesson7_HW_Q7 {

    public static void main(String[] args) {

        PersOfCmpnQ7 persOfCmpnQ7_1 = new Q7Programmers("Frank ", 44, 6600, "IT-Dep", "PYTON");
        PersOfCmpnQ7 persOfCmpnQ7_2 = new Q7Programmers("Tomas ", 39, 4800, "IT-Dep", "C++");
        PersOfCmpnQ7 persOfCmpnQ7_3 = new Q7Admins("Leonardo ", 39, 4800, "Admins", null);
        PersOfCmpnQ7 persOfCmpnQ7_4 = new Q7Admins("Antonio ", 45, 4900, "Anmins", null);
        PersOfCmpnQ7 persOfCmpnQ7_5 = new Q7Finans("ALina ", 35, 6600, "Finansists", null);
        PersOfCmpnQ7 persOfCmpnQ7_6 = new Q7Finans("Julia ", 32, 2500, "Finansists", null);

        PersOfCmpnQ7[] people = {persOfCmpnQ7_1, persOfCmpnQ7_2, persOfCmpnQ7_3, persOfCmpnQ7_4, persOfCmpnQ7_5, persOfCmpnQ7_6};

        //TODO: Kaka b^stro zapolnjat' massiv personami?

              /*int personMaxSalary = 0;
        for (int i = 0; i < people.length; i++) {
            PersOfCmpnQ7 persons = people[i];
            int currentPerSalary = persons.salaryQ7;
            if (currentPerSalary > personMaxSalary) {
                personMaxSalary = currentPerSalary;
            }*/

        PersOfCmpnQ7 propleZero = people[0];
        for (int i = 0; i < people.length; i++) {
            //PersOfCmpnQ7 persons = people[i];
            if (people[i].salaryQ7 > propleZero.salaryQ7) {
                propleZero = people[i];
            }
        }
        System.out.println("Highly paid in company is : " + propleZero.name + " and salary is : " + propleZero.salaryQ7) ;

        for (int i = 0; i < people.length; i++) {
            //PersOfCmpnQ7 persons = people[i];
            if (people[i].age < propleZero.age) {
                propleZero = people[i];
            }
        }
        System.out.println("Youngest шт company is : " + propleZero.name + " and age is : " + propleZero.age);
    }
}

