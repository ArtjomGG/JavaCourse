package lesson11;

import java.util.*;

public class Lesson11 {
// Найти число и вывести сколько раз оно поторялось
    // создаем метод внктри с отдельным LIST-oм в который складываем все чило заданные при вызове метода

    public static List<Integer> searchInArrayList(List<Integer> list, Integer serchCriteria) {
        List<Integer> result = new ArrayList<>();
        for (Integer item : list) {
            if (item.equals(serchCriteria)) {
                result.add(item);
            }
        }
        System.out.println(serchCriteria + " was found " + result.size() + " times ");
        return result;
    }
    // V6vesti na pechat' massiv v obratnom porjadke
    public static List<Integer> reverseArrayList(List<Integer> list) {

        List<Integer> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(4);
        testList.add(8);
        testList.add(5);
        testList.add(8);
        testList.add(5);
        testList.add(3);
        testList.add(4);
        testList.add(3);

        /*int serchCr = 4;
        List<Integer> searchResult = searchInArrayList(testList, serchCr);
        System.out.println(serchCr + " was found " + searchResult.size() + " times ");*/

        List<Integer> searchResult = searchInArrayList(testList, 4);
        System.out.println(searchResult);
        List<Integer> reverseResult = reverseArrayList(testList);
        System.out.println(reverseResult);
        Collections.reverse(testList);
        System.out.println(testList);
        //Collections.shuffle(testList);
        System.out.println(testList);

        int lookUp = Collections.binarySearch(testList, 3);
        System.out.println("BinariSearch " + lookUp);
        System.out.println("BinariSearch " + testList.get(lookUp));


        Set<Integer> testSet = new HashSet<>();
        System.out.println("Add 4 : " + testSet.add(4));
        System.out.println("Add 3 : " + testSet.add(3));
        System.out.println("Add 5 : " + testSet.add(5));
        System.out.println("Add 5 : " + testSet.add(3));
        System.out.println("Add 5 : " + testSet.add(5));
        System.out.println(testSet);

        Set<String> testSetString = new TreeSet<>(); // Sorteruetsja v NATURALNOM PORJADKE [  ,  1 ,  A ,  A2A ,  AAA ,  AAB ,  ABC ,  AC ,  ACC ]
        testSetString.add(" ABC ");
        testSetString.add(" ACC ");
        testSetString.add(" ACC "); // POVTOR6 NE DOBAVLJAET
        testSetString.add(" AAB "); // POVTOR6 NE DOBAVLJAET
        testSetString.add(" AAA ");
        testSetString.add(" AAA "); // POVTOR6 NE DOBAVLJAET
        testSetString.add(" 1 ");
        testSetString.add(" A ");
        testSetString.add(" AC ");
        testSetString.add(" AAB "); // POVTOR6 NE DOBAVLJAET
        testSetString.add("  ");
        testSetString.add(" A2A ");
        System.out.println(testSetString);
        System.out.println("*********************************************");

        AutoLesson11 auto_1 = new AutoLesson11(6000, "TOYOTA", 1500);
        AutoLesson11 auto_2 = new AutoLesson11(5600, "HONDA", 1480);
        AutoLesson11 auto_3 = new AutoLesson11(8000, "LEXUS", 1580);

        Set<AutoLesson11> autoSet = new TreeSet<>();
        autoSet.add(auto_1);
        autoSet.add(auto_2);
        autoSet.add(auto_3);
        System.out.println(autoSet);
        System.out.println("*********************************************");

        AutoCompareByPrice priceComparater = new AutoCompareByPrice();
        Set<AutoLesson11> autoSetWithComparater = new TreeSet<>();
        autoSetWithComparater.add(auto_1);
        autoSetWithComparater.add(auto_2);
        autoSetWithComparater.add(auto_3);
        System.out.println( autoSetWithComparater);
        System.out.println("*********************************************");

        Set<AutoLesson11> setWithAnonymComapater = new TreeSet<>(new Comparator<AutoLesson11>() {
            @Override
            public int compare(AutoLesson11 o1, AutoLesson11 o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        });
        setWithAnonymComapater.add(auto_1);
        setWithAnonymComapater.add(auto_2);
        setWithAnonymComapater.add(auto_3);
        System.out.println(setWithAnonymComapater);

    }

}

