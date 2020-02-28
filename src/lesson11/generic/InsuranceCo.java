package lesson11.generic;

import java.util.HashSet;
import java.util.Set;

public abstract class InsuranceCo<T extends PersonIns> {

    public void issuePolicy(T person_ins) {

        System.out.println("Request to Registry....");
        System.out.println("Commision agreemet....");

        registratePolicyLocally(person_ins); // konkretn6j metod kotor6j budet realixovan u childov

        System.out.println("Issue Policy....");
        System.out.println("Delivery Policy....");
    }

    protected abstract void registratePolicyLocally(T person_ins);

    public static <T> Set<T> getCommon(Set<T> setA, Set<T> setB) {
        Set<T> result = new HashSet<>();
        for (final T element : setA) {
            if (setB.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

}

