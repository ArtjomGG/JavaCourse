package lesson5;

import myClasses.Person;

public class Lesson5 {

    public static void main(String[] args) {
        System.out.println(Person.MIN_AGE);

        Person petr = new Person("Petr", true, 65, "Dell", 99_000);
        Person petrOther = new Person("Petr", true, 60, "Dell", 99_000);
        //petrOther = petr;

        boolean resultLinks = petr == petrOther; // sravnenie po ss6lke
        boolean resultEquals = petr.equals(petrOther); // sravnenie po sodrsjimomu objektov

        System.out.println(resultLinks);
        System.out.println("Link comparison: " + resultLinks);
        System.out.println("Eguals coparation: " + resultEquals);
        System.out.println(petr == petrOther);
        System.out.println("Petr " + petr);
        System.out.println("PetrOther " + petrOther);
        System.out.println("Petr HashCode " + petr.hashCode());
        System.out.println("PetrOther " + petrOther.hashCode());
        System.out.println(petr.getClass().getName());
        System.out.println("person Object Sates: " + petr);
        System.out.println("person Object Sates: " + petr.toString());

        /* Final!!! pristavka "final" ne daet vozmozhnost modificirovat' peremennuju, delaja ejo konstantoj (postojannoj)

        final int f= 3;
        f=f+7;
        f +=4;
        f *=2;
        System.out.println("f = " + f);*/

        /*final Person p33 = new Person();
        final Person p44 = new Person();
        p33 = p44;*/

    }
}
