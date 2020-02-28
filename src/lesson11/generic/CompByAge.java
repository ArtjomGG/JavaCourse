package lesson11.generic;

import java.util.Comparator;

public class CompByAge implements Comparator<PersonIns> {
    @Override
    public int compare(PersonIns o1, PersonIns o2) {
        return o1.getAge() - o2.getAge();
    }

}

