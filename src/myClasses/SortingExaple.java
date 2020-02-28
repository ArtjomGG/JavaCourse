package myClasses;

public class SortingExaple {

    public static void main(String[] args) {

        int[] arrayToSort = {1, 2, 3, 10, 4, 21, 5, 6, 30};

        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    int current = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = current;
                }
            }
        }
        for (int i = 0; i < arrayToSort.length; i++) {
            //System.out.println(arrayToSort[i] + " ");
            System.out.println();
            System.out.print(arrayToSort[i]);

        }
    }
}
