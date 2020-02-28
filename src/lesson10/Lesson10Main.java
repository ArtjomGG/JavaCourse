package lesson10;

public class Lesson10Main {
    public static void main(String[] args) {

        Lesson10 obj = new Lesson10(12, "STR", null);
        Lesson10.ProfessionalData proData = obj.new ProfessionalData(45, 1000, "KGB");
        Lesson10.innerStaticClass innerStatic = new Lesson10.innerStaticClass();

        Lesson10Interf anonymousInitObj = new Lesson10Interf() {
            @Override
            public void doSmt1() {
                System.out.println("Do smth 1 ");
            }

            @Override
            public void doSmt2() {
                System.out.println("Do smth 2 ");
            }
        };

        anonymousInitObj.doSmt1();
        anonymousInitObj.doSmt2();

        Lesson10AbstractClass myAbstr = new Lesson10AbstractClass() {
            @Override
            public void doAbsStuff1() {
                System.out.println("Do ABST 1 ");
            }

            @Override
            public void doAbsStuff2() {
                System.out.println("Do ABST 2 ");

            }
        };

        myAbstr.doAbsStuff1();
        myAbstr.doAbsStuff2();
        myAbstr.getMyInt();

    }
}
