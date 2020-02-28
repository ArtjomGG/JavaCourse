package lesson9.lesson9Singelton;

public class SingeltonMain {

    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
        Singelton singelton2 = Singelton.getInstance();
        Singelton singelton3 = Singelton.getInstance();

        String str = "RRR";
        String str1 = new String("RRR");
        String str2 = new String("RRR");
        System.out.println(str == str1); // sravnivaet i v6vodi "true" ili "false"

        String[] split = str.split("");

    }
}
