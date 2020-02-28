package lesson2;

public class Lesson2 {

    public static void printMyMessage(int i, double d) {
        System.out.println("Int -> + i");
        System.out.println("Double -> + d");
    }

    public static int getSum(int a, int b) {
        System.out.println("a+b=" + a + b);
        return a + b;
    }

    public static void getClosestTo100(double m, int n) {
        double mDelta = Math.abs(100 - m);
        double nDelta = Math.abs(100 - n);
        if (mDelta == nDelta) {
            System.out.println("Egvl");
        } else if (mDelta > nDelta) {
            System.out.println("n is closest");
        } else {
            System.out.println("m is closest");
        }
    }

    public static boolean isEven(int a) {
        int rest = a % 2;
        boolean result = rest == 0;
        if (result) {
            System.out.println("a=" + a + " and Even");
        } else {
            System.out.println("a=" + a + " and Odd");
        }
        return result;
    }


    public static void CheckRandomInerval() {
        double randomOrigin = Math.random();
        int random = (int) (randomOrigin * 150 + 5);
        if (random <= 25) {
            System.out.println("Mimo " + random);
        } else if (random > 100) {
            System.out.println("Ne popal " + random);
        } else {
            System.out.println("Popal " + random);
        }
    }

    public static void randomChek() {
        double randomOrigin = Math.random();
        int random = (int) (randomOrigin * 150 + 5);

        if (random > 25 & random <= 100) {
            System.out.println("Est " + random);
        } else {
            System.out.println("Ne est " + random);
        }
    }

    public static void randomChekAKTIV(int a, int b) {
        double randomOrigin = Math.random();
        int random = (int) (randomOrigin * 150 + 5);

        if (random > a & random <= b) {
            System.out.println("DA " + random);
        } else {
            System.out.println("NET " + random);
        }
    }

    //public static void randomChekAKTIVinterval(int from, int to) {
    //int start = to - from;//150
    //int end = from;//5
    //return (int) (Math.random()*start + end);

    //if (random > a & random <= b) {
    //System.out.println("DA " + random);
    //} else {
    //System.out.println("NET " + random);
    //}
    //}

    public static void main(String[] args) {
        getClosestTo100(90, 100);
        isEven(3);
        isEven(100500);
        CheckRandomInerval();
        randomChek();
        randomChekAKTIV(1, 4);

        System.out.println((int) (Math.random() * 3) + 1);

        int[] array = {1, 2, 4, 5};

        System.out.println("Dlina massiva = " + array.length + "\n");
        System.out.println("Znachenie 3-tej jachejki v massive = " + array[3] + "\n");

        for (int i = 0; i < 3; i += i + 1) {
            System.out.println("V LINIJU " + array[i] + "  ");
        }
        /*boolean[] arreyB = true, false, true;*/
    }
}

