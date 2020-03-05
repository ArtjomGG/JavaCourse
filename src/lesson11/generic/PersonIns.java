package lesson11.generic;

import java.time.LocalDate;
import java.util.Objects;

public abstract class PersonIns implements Comparable<PersonIns> {

    private String name;
    private Integer age;
    private String secondName;
    private LocalDate birthday;
    private String crimeStatus;
    private Integer ageForExeption;

    private String randCrim() {
        String criminal = "criminal";
        String notCriminal = "not criminal";
        String areCrim;
        double randomOrigin = Math.random();
        int random = (int) (randomOrigin * 10 + 1);
        if (random == 3) {
            areCrim = criminal;
        } else if (random == 6) {
            areCrim = criminal;
        } else {
            areCrim = notCriminal;
        }
        return areCrim;
    }

    private void ageChek(String message) {
        if (ageForExeption < 18) {
            IllegalArgumentException exception = new IllegalArgumentException();
            System.out.println(message);
            throw exception;
        }
    }

    private void crimeChek(String message) {
        if (crimeStatus.equals("criminal")) {
            IllegalArgumentException exception = new IllegalArgumentException();
            System.out.println(message);
            throw exception;
        }
    }

    public PersonIns(String name, String crimeStatus, Integer ageForExeption) {
        this.name = name;
        this.crimeStatus = randCrim();
        this.ageForExeption = ageForExeption;
        crimeChek("Person are criminal!!!");
        ageChek("Too young!!!");

    }

    public PersonIns(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonIns(String name, Integer age, String secondName) {
        this.name = name;
        this.age = age;
        this.secondName = secondName;
    }

    public PersonIns(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getAgeForExeption() {
        return ageForExeption;
    }

    public void setAgeForExeption(Integer ageForExeption) {
        this.ageForExeption = ageForExeption;
    }

    public String getCrimeStatus() {
        return crimeStatus;
    }

    public void setCrimeStatus(String crimeStatus) {
        this.crimeStatus = crimeStatus;
    }

    @Override
    public int compareTo(PersonIns o) {
        return this.age - o.getAge();
    }

    @Override
    public String toString() {
        return "PersonIns{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", secondName='" + secondName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonIns)) return false;
        PersonIns that = (PersonIns) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
