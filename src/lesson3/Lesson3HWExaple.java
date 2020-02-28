package lesson3;

public class Lesson3HWExaple {

    public static void minMaxChange(int[] array) {
        int min = array[0], max = array[0];
        int indexOfMin = 0, indexOfMax = 0;

        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
            //int currentCell = array[i];
            if (min > array[i]) {
                min = array[i];
                indexOfMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexOfMax = i;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + "Min [" + min + "," + max + "] Max");
        System.out.println("\n");

        /*int swap = min;
        min = max;
        max = swap;*/

        array[indexOfMax]=min;
        array[indexOfMin]=max;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "Max [" + min + "," + max + "] Min");
    }

    public static void main(String[] args) {
        int[] arrayNumber = {1, 6, 3, 4};
        minMaxChange(arrayNumber);
    }

}

