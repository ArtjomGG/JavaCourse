package lesson4;

import myClasses.Person;

public class Lesson4 {

    static void printAvrgAge(Person[] xMen) { /* v6chislit srednij vozraast: sloshit vse vozrosta ( sdelat' v cikle)
        potom nado prossumirovat' kompashku i rasdelit cikl*/
        int totalAge = 0;
        int totalSalary = 0;
        for (int i = 0; i < xMen.length; i++) {
            totalAge += xMen[i].age;
            totalSalary += xMen[i].salary;
        }
        double averageAge = totalAge / xMen.length;
        double averageSalary = totalSalary / xMen.length;

        System.out.println("Average age:" + averageAge);
        System.out.println("Average salary:" + averageSalary + "\n");
    }

    static void printAverageSalaryMaxMin(Person[] team) { //  Задание: Est massiv myClasses.Person. Vyvesty ZP samogo molodogo i samogo starshego sotrudnika;
        Person oldest = team[0];
        Person youngest = team[0];

        for (int i = 0; i < team.length; i++) {
            if (team[i].age > oldest.age) {
                oldest = team[i];
            }
            if (team[i].age < youngest.age) {
                youngest = team[i];

    /*int maxAge = team [0].age;
    int minAge = team[0].age;
    long salaryOfOldest= team[0].salary;
    long salareOfYoungest = team[0].salary;
    String nameOldest = team[0].name;
    String nameYoungest = team[0].name;

    for (int i=0; i<team.length; i++) {
        if (team[i].age > maxAge) {
            maxAge = team[i].age;
            salaryOfOldest = team[i].salary;
            nameOldest = team[i].name;
        }
        if (team[i].age < minAge) {
            minAge = team[i].age;
            salareOfYoungest = team[i].salary;
            nameYoungest = team[i].name;*//*
        }
    }
        System.out.println("Name " + nameOldest + " Max Age in Team is " + maxAge + " and Salary is " + salaryOfOldest );
        System.out.println("Name " + nameYoungest + " Min Age in Team is " + minAge + " and Salary is " + salareOfYoungest );*/

            }
        }
        System.out.println("Oldest " + oldest.name + " with age " + oldest.age + " and salary " + oldest.salary);
        System.out.println("Youngest " + youngest.name + " with age " + youngest.age + " and salary " + youngest.salary);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Ravshan", true, 18, "RogaiKop6ta", 500000);

        p1.salary = 100;

        p1.bacemeOneYeareOlder();
        System.out.println(p1);

        Person p2 = new Person("ilshad", true, 55, "Lapidad", 580);
        Person p3 = new Person("Robert", true, 85, "Dell", 100_000);

        p1.sayHallo();
        p2.sayHallo();
        p3.sayHallo();

        p1.sayHalloTo(p2);

        Person[] dreamTeam = {p1, p2, p3}; // Sosdali massiv

        printAverageSalaryMaxMin(dreamTeam);

        Person jack = new Person();
        jack.name = "Jack";
        jack.gender = true;
        jack.age = 23;
        jack.companyName = "Facebook";
        jack.salary = 150_000;

        Person joe = new Person();
        joe.name = "Joe";
        joe.gender = true;
        joe.age = 48;
        joe.companyName = "Google";
        joe.salary = 280_000;

        Person julia = new Person();
        julia.name = "Julia";
        julia.gender = false;
        julia.age = 28;
        julia.companyName = "Microsoft";
        julia.salary = 350_000;

       /* joe = jack;
        julia = joe; Pjarjali vseh krome Jack*/

        System.out.println("Jack ->" + jack);
        System.out.println("Joe ->" + joe);
        System.out.println("Julia ->" + julia);

        Person[] people = {joe, julia, jack}; // Massiv ljudej
        Person[] people1 = {joe, julia};
        Person[] people2 = {jack};
        System.out.println(people); // v6vodit ss6lku na massiv ( memory hash)
        // Raspechatot po shtuchno

        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            System.out.println(p.name);
            System.out.println(people[i]);
        }

        printAvrgAge(people);
        printAvrgAge(people1);
        printAvrgAge(people2);

        Person nik = new Person();
        Person ivan = new Person("Ivan");
        Person dummy = null; // potjarjat objekt
        //nik = null; nik obnulilsja

        System.gc(); // сборшик мусора
        System.out.println(nik.companyName);
        System.out.println(ivan.companyName);

// srednjaa sarplat v komande
        Person[] googleTeam = new Person[5]; // sozdali komandu spomoshju cicla
        long baseSalary = 2000;
        for (int i = 0; i < googleTeam.length; i++) {
            long personalSalary = baseSalary + i;
            googleTeam[i] = new Person(personalSalary);
        }

        printAvrgAge(googleTeam);
    }
}
