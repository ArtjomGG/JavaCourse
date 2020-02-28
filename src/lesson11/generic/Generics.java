package lesson11.generic;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Generics {

    /*------------Lesson 11:------------
    Read: Ekkel: 342-361
    1.Dodelat Insurance company (dobavit fields v classy People i naslednikov)
    1a Implement comparable for Citizen i Employee (poprobovat raznie varianty).
    Sozdat Tree Set Citizen i Employee, vypolnit s nimi sledujushie deistvija:
    HashSet:
    1.Write a Java program to compare two hash set.
    2.Write a Java program to compare two sets and retain elements which are same on both sets
    Tree Set:
    1. Write a Java program to iterate through all elements in a tree set
    2. Write a Java program to add all the elements of a specified tree set to another tree set.
    3. Write a Java program to get the first and last elements in a tree set.
    4. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
*/

    public static void main(String[] args) {

        PersonIns person_ins1 = new EmployeeIns("Vova", 48, "BUILDER", 15000);
        PersonIns person_ins2 = new EmployeeIns("Petja", 43, "INSENER", 24000);
        PersonIns person_ins3 = new EmployeeIns("Fedja", 48, "MANEGER", 21600);
        PersonIns person_ins4 = new CitizenIns("Andrei", 66, "PENS", 5880);
        PersonIns person_ins5 = new CitizenIns("Aleks", 46, "WORKER", 15000);
        PersonIns person_ins6 = new CitizenIns("Sergei", 26, "STUDENT", 8800);

        Set<PersonIns> personsList1 = new HashSet<>();
        personsList1.add(person_ins1);
        personsList1.add(person_ins2);
        personsList1.add(person_ins3);
        System.out.println(personsList1);
        System.out.println("*********************************************");

        Set<PersonIns> personsList2 = new HashSet<>();
        personsList2.add(person_ins4);
        personsList2.add(person_ins5);
        personsList2.add(person_ins6);
        System.out.println(personsList2);
        System.out.println("*********************************************");

        personsList1.retainAll(personsList2);
        System.out.println("HashSet content:");
        System.out.println(personsList1);

        System.out.println("*********************************************");

        // 1.Write a Java program to compare two hash set.

        System.out.println("HashSet content:");
        System.out.println(personsList1);

        System.out.println("*********************************************");

        CompareByProff proffComparater = new CompareByProff();
        Set<PersonIns> personListProff = new TreeSet<>();
        personListProff.add(person_ins1);
        personListProff.add(person_ins2);
        personListProff.add(person_ins3);
        personListProff.add(person_ins4);
        personListProff.add(person_ins5);
        personListProff.add(person_ins6);
        System.out.println(personListProff);
        System.out.println("*********************************************");

        CompByAge ageComparater = new CompByAge(); // TODO: Zachem vpisali esli on ne ispolzutzja, gorit bledn6m
        Set<PersonIns> personListAge = new TreeSet<>();
        personListAge.add(person_ins1);
        personListAge.add(person_ins2);
        personListAge.add(person_ins3);
        personListAge.add(person_ins4);
        personListAge.add(person_ins5);
        personListAge.add(person_ins6);
        System.out.println(personListAge);
        System.out.println("*********************************************");


        Set<PersonIns> personsLisTree = new TreeSet<>();

    }
}


