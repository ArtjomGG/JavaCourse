package myClasses;

import lesson7.PersOfCmpnQ7;

public class Q7Finans extends PersOfCmpnQ7 {

    public Q7Finans(String name, int age, int salaryQ7, String department, String specials) {

        this.name = name;
        this.age = age;
        this.salaryQ7 = salaryQ7;
        this.department = department;
    }

    public int calcMaxSalary() {
        int maxSalary_Fnsts = 0;
        for (int i = 0; i < salaryQ7; i++) {
            if (salaryQ7 > maxSalary_Fnsts) {
                salaryQ7 = maxSalary_Fnsts;
            }
            System.out.println("Max selary of ADMINS: " + salaryQ7);
        }
        return salaryQ7;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalaryQ7() {
        return salaryQ7;
    }
    public void setSalaryQ7(int salaryQ7) {
        this.salaryQ7 = salaryQ7;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getSpecials() {
        return specials;
    }
    public void setSpecials(String specials) {
        this.specials = specials;
    }
}
