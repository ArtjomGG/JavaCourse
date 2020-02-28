package myClasses;

import java.util.Objects;

public class Person {

    public static final int MIN_AGE = 18; // Postojanna staticheskaja v classe

    public String name;
    public boolean gender;
    public int age;
    public String companyName;
    public long salary;

    public Person(String name, boolean gender, int age, String companyName, long salary) { //ALT+INS>Generade
        if (age < MIN_AGE) {
            System.out.println("Impossible!!! ");
        }

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.companyName = companyName;
        this.salary = salary;
    }

    public void sayHallo() {
        System.out.println("Hello!");
        System.out.println("hello from " + this.name + "!!!");
    }

    public void bacemeOneYeareOlder() {
        this.age++;
    }

    public void sayHalloTo(Person toPerson) {
        System.out.println(this.name + " says Hello to " + toPerson.name + ")))");
    }

    public Person() {
        System.out.println("Constructor 1.... ");
        this.companyName = "FacebookMMM";
    }

    public Person(String name) {
        System.out.println("Constructor 2... ");
        this.companyName = "GoogleMMM";
        this.name = name;
    }

    public Person(long salary) { // randomn6j vozrost [18,65] po zarplate
        System.out.println("Constructor 3... ");
        this.salary = salary;
        int randomAge = (int) (Math.random() * 47 + 18);
        this.age = randomAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return gender == person.gender &&
                age == person.age &&
                salary == person.salary &&
                Objects.equals(name, person.name) &&
                Objects.equals(companyName, person.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, companyName, salary);
    }
   @Override
    public String toString() {
        return "myClasses.Person{" +
                "gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
