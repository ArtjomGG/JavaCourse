package lesson10.algorithms;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmUtils {

    public static int[] genarateArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            int element = (int) (Math.random() * 1000);
            array[i] = element;

        }
        return array;
    }

    // O(1)
    public static void printLength(int[] array) {
        System.out.println("Array size is : " + array.length);

    }

    // O(n)
    public static void printMax(int[] array) {
        int max = 0;
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        System.out.println("MAX is : " + max);
    }

    public static ArrayList<Integer> genarateArrayList() {
        int count = (int) (Math.random() * 10);
        ArrayList<Integer> arrayList = new ArrayList<>(count);
        /*for (int i = 0; i < arrayList.size(); i++) {
            int elemet = (int) (Math.random() * 10);
            count = elemet;
        }*/
        System.out.println("ArreyList is " + arrayList.size());
        return arrayList;
    }

    //return arrayList.size();

   /* public static void printArrayList(List<String> arrayList) {
        //List<String> arrayList = new ArrayList<>();
        for (String element : arrayList) {
            System.out.print(element + " ");
        }
    }*/

    /*public static void printArrayListElemByIndex(List<String> arrayList, Integer index) {
        for (String element : arrayList) {
            if (arrayList.indexOf(String)=index) {
                System.out.print(element + " ");
            }
        }
    }*/

    public static int calcFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(" Faktorial of " + n + " is " + result);
        return result;
    }

/*for (Integer element : arrayList ) {
            arrayList<> (count) = element;
        }*/
    //count = (int) (Math.random() * 10);

    /*public static void printList(List<Interger> list) {
        return;
    }*/

}
