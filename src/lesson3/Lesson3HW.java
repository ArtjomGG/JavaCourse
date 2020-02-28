package lesson3;

import java.util.Arrays;

public class Lesson3HW {

/*  ------------L3: Homework:------------
1. Naijti Max i Min i pomenjat mestami
2. Naiti nim i max v dvumernom massive, pomenjat ih mestami i vyvesti na pechat resultirujushij massiv
3. Naiti summu elementov v dvuhmernom massive*/

    static int zamenaMinNaMax(int[] array) { // Najti MIN i MAX
        int min = array[0], max = array[0]; // Podsmotrel u Sergeja
        int indexOfMin = 0, indexOfMax = 0; // Podsmotrel u Sergeja
        int i = 0; //TODO: Pochemu M6 ustanovili "i=0", za metotom "WHILE", a v "for" prishlos' delat' otdelno "k"?

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();

        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
            i++;
        }
        array[indexOfMax] = min;
        array[indexOfMin] = max;

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();
        System.out.println("Minn: " + min + " max " + max);
        return min;
    }

    static int zamenaMinNaMaxVDvuhMernom(int[][] group) {
        int min = group[0][0], max = group[0][0];
        int sum = 0;
        int iMax = 0, jMax = 0, iMin = 0, jMin = 0;

        for (int i = 0; i < group.length; i++) {
            for (int j = 0; j < group[i].length; j++) {
                if (group[iMin][jMin] > group[i][j]) {
                    min = group[i][j];
                    iMin = i;
                    jMin = j;

                }
                if (group[iMax][jMax] < group[i][j]) {
                    max = group[i][j];
                    iMax = i;
                    jMax = j;
                }
                sum = sum + group[i][j];
                System.out.print(group[i][j] + "\t ");
            }
            System.out.println();
        }
        System.out.println("Summa :" + sum + " Min: " + min + " Max : " + max + " ");
        System.out.println("MIN for Change : " + group[iMin][jMin] + " MAX for Change :  " + group[iMax][jMax]);

        group[iMin][jMin] = max;
        group[iMax][jMax] = min;

        for (int i = 0; i < group.length; i++) {
            for (int j = 0; j < group[i].length; j++) {
                System.out.print(group[i][j] + "\t ");
            }
            System.out.println();
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {30, 40, 122, 70, 50, 3, 88, 98};

        System.out.println(Arrays.toString(array));
        System.out.println();

        int[][] group = {
                {1, 10, 30},
                {12, 8, 5},
                {6, 7, 99}
        };

        System.out.println(Arrays.deepToString(group));
        System.out.println();

        zamenaMinNaMax(array);
        zamenaMinNaMaxVDvuhMernom(group);
    }
}
