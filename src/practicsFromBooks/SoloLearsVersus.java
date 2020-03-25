package practicsFromBooks;

public class SoloLearsVersus {

    public static void versus1() {
        int arr[] = {1, 2, 3, 4, 5};
        int x;
        int b[] = new int[5];

        for (x = 0; x < 5; x++) {
            b[x] = arr[4 - x];
        }
        for (x = 0; x < 5; x++) {
            System.out.print(b[x]);

        }
    }

    public static void versus2() {
        int a = 5;
        switch (a) {
            case 5:
                a += 2;
                break;
            case 7:
                a += 2;
            case 9:
                a += 2;
            default:
                a += 1;
        }
        System.out.println();
        System.out.println(a);
    }

    public static void main(String[] args) {
        versus1();
        versus2();
    }
}
