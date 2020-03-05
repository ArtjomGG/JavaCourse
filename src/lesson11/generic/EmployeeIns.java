package lesson11.generic;

public class EmployeeIns extends PersonIns {

    private int exposeSecretAgeByReflaction() {
        System.out.println("We have the object: ....");
        return password;
    }

    private String profession;
    private Integer salary;
    private int password = 999999999;

    public EmployeeIns(String name, Integer age, String profession, Integer salary) {
        super(name, age);
        this.profession = profession;
        this.salary = salary;
    }

    public EmployeeIns(String name, String crimeStatus, Integer ageForExeption) {
        super(name, crimeStatus, ageForExeption);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}
