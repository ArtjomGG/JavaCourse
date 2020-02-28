package lesson1;

public class Lesson1HW {
    /* 1. Создайте программу выводящую на экран результаты следующих вычислений:(int) ((double)7 / 3 )*10 ) % 31=?*/

    public static void value1() {
        double d = (7.0 / 3.0) * 10.0;
        /*int i = (int) d%31;*/
        int ii = (int) ((7.0 / 3.0) * 10) % 31;
        System.out.println("Value 1 s tochkoj = " + d);
        /*System.out.println ("Value 1 bez tochki = " + i);*/
        System.out.println("Value 1 nuzen 0, ili??? = " + ii);
    }

    /*2. Создайте программу, которая вычислит выражение 69/100+18*(69-13^2+69/3.14) и выведет результат на экран.
        Замените число 69 переменной  b соответствующего типа и поэкспериментируйте с различными значениями.*/
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

/*3.В переменных a и b хранятся два натуральных числа.
Создайте программу, выводящую на экран результат деления a на b с остатком. Пример вывода программы "17 / 8  = 2,  остаток 1";*/

    public static void value3() {
        int a = 17;
        int b = 8;
        int res1 = a / b;
        int res2 = a % b;
        System.out.println("17/8 = " + res1 + ", ostatok " + res2);
    }

    public static void ptini() {
        int i = (byte) +(char) -(int) +(long) -1;
        System.out.println(i);
    }

    public static void main(String[] args) {
        value1();
        value2();
        value2alter();
        value2alter2();
        value3();
        ptini();
    }
}

