package lesson11.generic;

import java.util.Comparator;


public class CompareByProff implements Comparator<EmployeeIns> {

    @Override
    public int compare(EmployeeIns o1, EmployeeIns o2) {
        return o1.getProfession().compareTo(o2.getProfession());
    }
}
