package lesson11.generic;

public class EmployeeIns extends PersonIns {

    private String profession;
    private Integer salary;

    public EmployeeIns(String name, Integer age, String profession, Integer salary) {
        super(name, age);
        this.profession = profession;
        this.salary = salary;
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
