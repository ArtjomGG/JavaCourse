package myClasses;

public class Men { //PlayOldJavalObject - esli net konstruktora no class po umolchaniju konstruktor

    public static final Integer MAN = 1;
    public static final Integer WOMAN = 2;

    private String firstName;
    private String lastName;
    private int age; // primitivn6j tip
    private Integer experience; // class obrtki objektn6j tip. Chtob6 voiti ctrl+Mouse
    private Integer gender; // class obrtki objektn6j tip. Chtob6 voiti ctrl+Mouse

    // chtob6 dann6e private b6li vidn6 nado sosdat. "getter" i "setter"

    public String getFirstName() { // GETTER chtob6 schitat znachenie
        return this.firstName;
    }

    public void setFirstName(String firstName) { // SETTER chtob6 ustanovit
        this.firstName = firstName;
    }

    public String getLastName() { // GETTER chtob6 schitat znachenie
        return this.lastName;
    }

    public void setLastName(String lastName) { // SETTER chtob6 ustanovit
        this.lastName = lastName;
    }

    public int getAge() { // GETTER chtob6 schitat znachenie
        return this.age;
    }

    public void setAge(int age) { // SETTER chtob6 ustanovit
        this.age = age;
    }

    public Integer getExperience() { // GETTER chtob6 schitat znachenie
        return this.experience;
    }

    public void setExperience(Integer experience) { // SETTER chtob6 ustanovit
        this.experience = experience;
    }


    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /*public void setGender(Boolean gender) {
        this.gender = gender;
    }
    public Boolean isGender () {
        return this.gender;
    }*/


}


