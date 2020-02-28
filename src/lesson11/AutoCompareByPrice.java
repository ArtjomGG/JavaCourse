package lesson11;

import java.util.Comparator;

// класс AutoCompareByPrice наследует интерфейс Comparator для сравнения по одному из параметров
// может содержать только один  @Override метод для сравнения

public class AutoCompareByPrice implements Comparator<AutoLesson11> {
    @Override
    public int compare(AutoLesson11 o1, AutoLesson11 o2) {
        return o1.getPrice() - o2.getPrice();
    }

}

