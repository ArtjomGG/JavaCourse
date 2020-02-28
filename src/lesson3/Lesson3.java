package lesson3;

public class Lesson3 {
    static boolean isTriangelPossible(int a, int b, int c) {
        if (a + b > c && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    static int sum() { // Najti summu chisel v massive
        int[] array = {17, 13, 30, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int currentCell = array[i];
            sum = sum + currentCell;
            // sum+=currentCell **alternativa napisanija
        }
        System.out.println("Sum = " + sum);
        return sum;
    }

    static int getMax() {//Hajti max v massive
        int[] array = {167, 2324, 3234, 2344};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max = " + max);
        return max;
    }

    static long whileSumTrain() { // Najti obshij maasu sostava poezda
        long[] train = {34, 45, 70};
        long sum = 0;
        int i = 0;
        while (i < train.length) {
            sum = sum + train[i];
            i++;
        }
        System.out.println("Obshaja massa:" + sum);
        return sum;
    }

    static long whileMin() { // Najti sam6j legkij vagon v poezde
        long[] train = {30, 40, 70, 20};
        long min = train[0];
        int i = 1;
        while (i < train.length) {
            if (train[i] < min) {
                min = train[i];
            }
            i++;
        }
        System.out.println("Sam6j legkij:" + min);
        return min;
    }

    public static void main(String[] args) {
        sum();
        getMax();
        whileSumTrain();
        whileMin();

        String[][] group = {
                {"N1", "N2", "N3"},
                {"I1", "I2", "I3"},
                {"K1", "K2", "K3"}
        };
        for (int i = 0; i < group.length; i++) {
            String[] row = group[i];
            for (int j = 0; j < row.length; j++) {
                String name = group[i][j];
                String nameR = row[j];
                //String name = group [i] [j];
                System.out.println("[" + i + ", " + j + "] = " + name + " ");
                System.out.println();
                System.out.print("[" + i + ", " + j + "] = "+ nameR +" ");
            }
        }

    }
    // Naijti Max min i pomenjat mestami
}

