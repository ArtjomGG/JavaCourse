package lesson11.generic;

import java.time.LocalDate;

public class CitizenIns extends PersonIns {

    private String typeOfIncome;
    private Integer earnings;


    public CitizenIns(String name, Integer age, String typeOfIncome, Integer earnings) {
        super(name, age);
        this.typeOfIncome = typeOfIncome;
        this.earnings = earnings;
    }

    public CitizenIns(String name, Integer age, String secondName, String typeOfIncome, Integer earnings) {
        super(name, age, secondName);
        this.typeOfIncome = typeOfIncome;
        this.earnings = earnings;
    }

    public CitizenIns(String name, LocalDate birthday) {
        super(name, birthday);
    }

    public String getTypeOfIncome() {
        return typeOfIncome;
    }

    public void setTypeOfIncome(String typeOfIncome) {
        this.typeOfIncome = typeOfIncome;
    }

    public Integer getEarnings() {
        return earnings;
    }

    public void setEarnings(Integer earnings) {
        this.earnings = earnings;
    }

}
