package lesson10;

public class Lesson10 {

    private int myPropertyInt;
    private String myPropertyString;
    private ProfessionalData professionalData;

    public Lesson10(int myPropertyInt, String myPropertyString, ProfessionalData professionalData) {
        this.myPropertyInt = myPropertyInt;
        this.myPropertyString = myPropertyString;
        this.professionalData = professionalData;
    }

    public class ProfessionalData { // класс который надо создавать как объект
        public ProfessionalData(int salary, int taxes, String department) {
            this.salary = salary;
            this.taxes = taxes;
            this.department = department;
        }

        private int salary;
        private int taxes;
        private String department;
    }

    public static class innerStaticClass { // вложенный класс
    }

}
