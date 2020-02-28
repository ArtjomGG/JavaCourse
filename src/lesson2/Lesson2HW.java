package lesson2;

public class Lesson2HW {

    public static void rabotaVintervale() {

   /*
     1. Создать программу проверяющую находится ли число  в интервале -50 …20;
     (poprobovat' zadat' cjilo randomno ot -100 do 100)
    2. Создать программу проверяющую переменную b  в случае если переменная равна 6, 5, 8, 9 выводить "False " иначе выводить "True".
    3. Обьединить все условия v odin metod*/

        int random = 8;
        System.out.println("Random " + random);
        if (random >= -50 && random <= 20) {
            System.out.println("V intervale 1 " + random);
        } else {
            System.out.println("Ne v intervale " + random);
        }
        if (random == 6 || random == 5 || random == 8 || random == 9) {
            System.out.println("FALSE " + random);
        }

        /*zadat' chislo randomno v intervale ot -100 i 100'*/

        double randomOrigin = Math.random();
        int randomRand = (int) ((randomOrigin * 200)) - 100;
        System.out.println("Random " + randomRand);
        if (randomRand >= -50 && randomRand <= 20) {
            System.out.println("V intervale 1 RAND " + randomRand);
        } else {
            System.out.println("Ne v intervale RAND " + randomRand);
        }
        if (randomRand == 6 || randomRand == 5 || randomRand == 8 || randomRand == 9) {
            System.out.println("FALSE RAND " + randomRand);
        } else {
            System.out.println("TRUE RAND " + randomRand);
        }
    }

    /* int y = random%2 == 0 ? 5 : 6; // ternarn6j operator [boolExpr] ? val 1 : val 2;*/

    /*4. Создайте программу, которая вычислит выражение 69/100+18*(69-13^2+69/3.14) и выведет результат на экран.
    Замените число 69 переменной  b соответствующего типа и поэкспериментируйте с различными значениями.
*/
    public static void value2() {
        double val = 69.0 / 100.0 + (18.00 * (69.00 - (13.00 * 13.00) + (69.00 / 3.14)));
        System.out.println("Value 2 = " + val);
    }

    public static void value2alter() {
        double d = 69.00;
        double val = d / 100.0 + (18.00 * (d - (13.00 * 13.00) + (d / 3.14)));
        System.out.println("Value 2 alter = " + val);
    }

    public static void value2alter2() {
        double d = 9.00;
        double val = d / 100.0 + (18.00 * (d - (13.00 * 13.00) + (d / 3.14)));
        System.out.println("Value 2 alter2 = " + val);
    }

    //5. В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
    //6. В переменной n хранится трехзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n;

    public static void summaN2() {
        int n = 69;
        int n1 = 69 % 10;
        int n2 = (n-n1)/10;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("Result N2 " + (n1+n2) + " = " + n1 + " + " + n2);
    }

    public static void summaN3() {
        int n = 769;
        int n1 = n% 10;
        int n2 = (n%100-n1)/10;
        int n3 = (n-n2)/100;
        int nResult = n1+n2+n3;
        System.out.println(" n1 " + n1 + " n2 " + n2 + " n3 " + n3 );
        System.out.println("Result N3 " + nResult);
    }
/*7. В три переменные a, b и c записаны три вещественных числа(parametry metoda).
      Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
      либо сообщать, что корней нет. (https://www.mathsisfun.com/algebra/quadratic-equation.html posmotret Summary)*/

    public static void quadraticEquation () { // ax²+bx+c=0, x2 − 2x − 3 = 0, x2 + 12x + 36 = 0, 5x2 + 3x + 7 = 0;
        double a = 5.0;
        double b = 3.0;
        double c = 7.0;
        double dD = b*b-(4*a*c);
        double x1 = (-b+Math.sqrt(dD))/2*a;
        double x2 = (-b-Math.sqrt(dD))/2*a;
        double x3 = -(b/2*a);

        System.out.println("ax²+bx+c=0 " + a + "x2+" + b + "x+" + c + " = 0");
        System.out.println("Diskreminant " + dD);

        if ( dD < 0) {
            System.out.println("Kornej net");
        }
        if (dD > 0) {
            System.out.println("Dva kornja " + "x1 = " + x1 + " and x2 " + x2);
        }
        if (dD == 0) {
            System.out.println("odin koren " + "x = " + x3);
        }
    }
/*8. Есть три отрезка, различной длины, данные хранятся в переменных а, b и c. Проверить возможно ли из этих
отрезков создать треугольник. (symma dvuh storon treugolnika menshe tretjei storony)*/

    static boolean isTriangelPossible(int a, int b, int c) { // переменные задали при вызове метода в main-e
        if (a + b > c && b + c > a) {
            System.out.println("Vzmozhno");
            return true;
        } else {
            System.out.println("Ne vzmozhno");
            return false;
        }
    }
    public static void main(String[] args) {
        rabotaVintervale();
        value2();
        value2alter();
        value2alter2();
        summaN2();
        summaN3();
        quadraticEquation ();
        isTriangelPossible(2, 2,3);
    }
}

