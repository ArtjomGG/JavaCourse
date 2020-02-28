package lesson10;

public class Recursion {

    // sosadaem massiv ot 0 do N
    // scetaem do cisla kotoroe v parametre
    static int getSumX(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
            // sum+=currentCell **alternativa napisanija
        }

        return sum;
    }

    static int getSumRec (int n) { // Рекурсия. Недостаток что может переполнить высовов
        if (n==0) { // условия выхода из рекурсии ( дно нашего метода)
            return 0;
        }
        return n + getSumRec(n-1); //
    }

    static int getFiboNum (int n) { // najti chislo Fibonachi po porjadkavomu nomeru chisla

       /* if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }*/

        if (n==0||n==1) {
            return n;
        }
        return getFiboNum(n-1)+getFiboNum(n-2); // bez if (n==0) & (n==1) prob'et dno i sapolnit stek
    }

    public static void main(String[] args) {
        int sum = getSumX(66);
        int sumRec = getSumRec(66);
        int fiboNum = getFiboNum ( 10);

        System.out.println("Sum = " + sum);
        System.out.println("SumRec = " + sumRec);
        System.out.println("Fibonachi = " + fiboNum);
    }


}
