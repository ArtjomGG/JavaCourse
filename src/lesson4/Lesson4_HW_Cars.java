package lesson4;

import myClasses.Cars;

public class Lesson4_HW_Cars {

    public static int getMaxPrice(Cars[] cars) {  //Var 2 Cherez metod; Напишите фрагмент кода в классе Main который найдет самый дорогой автомобиль.
        int maxPrice = cars[0].price;
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].price > maxPrice) {
                maxPrice = cars[i].price;
            }
        }
        System.out.println("Sam6j dorogoj avto, chers metod: " + maxPrice);
        return maxPrice;
    }

    public static void sortAndPrintArrayOfCa (Cars[] vwcars) {

        for (int i = 0; i < vwcars.length; i++) {
            for (int j = i + 1; j < vwcars.length; j++) {
                if (vwcars[i].price > vwcars[j].price) {
                    Cars current = vwcars[i]; // присоить и сравнивать машины целиком
                    vwcars[i] = vwcars[j];
                    vwcars[j] = current;
                }
            }
        }
        for (int i = 0; i < vwcars.length; i++) {
            //System.out.println(arrayToSort[i] + " ");
            System.out.println();
            System.out.print(vwcars[i]);
        }
    }

    public static void main(String[] args) { // ? Kak b6stree zapolnjan dann6e mashin6?

        Cars micra = new Cars();
        micra.brand = "NISSAN";
        micra.model = "MICRA";
        micra.weight = 780;
        micra.price = 14_750;
        micra.color = "WHITE";

        Cars leaf = new Cars();
        leaf.brand = "NISSAN";
        leaf.model = "LEAF";
        leaf.price = 35_790;
        leaf.weight = 1_520;
        leaf.color = "BLUE";

        Cars juke = new Cars();
        juke.brand = "NISSAN";
        juke.model = "JUKE";
        juke.price = 16_300;
        juke.weight = 1_252;
        juke.color = "ORANGE";

        Cars qashqai = new Cars();
        qashqai.brand = "NISSAN";
        qashqai.model = "QASHQAI";
        qashqai.price = 18_900;
        qashqai.weight = 1_530;
        qashqai.color = "RED";

        Cars x_trail = new Cars();
        x_trail.brand = "NISSAN";
        x_trail.model = "X-TRAIL";
        x_trail.price = 30_800;
        x_trail.weight = 1_580;
        x_trail.color = "BLACK";

        Cars bora = new Cars("VW", "BORA", 21890, 1535, "GREEN");
        Cars jetta = new Cars("VW", "JETTA", 23890, 1530, "SILVER");
        Cars passat = new Cars("VW", "PASSAT", 35890, 1721, "RED");
        Cars tiquan = new Cars("VW", "PASSAT", 43890, 1880, "NAVI");
        Cars touareg = new Cars("VW", "TOUAREG", 63890, 2180, "BLACK");
        Cars touaregOther = new Cars("VW", "TOUAREG", 63890, 2180, "BLACK");

        boolean resultLinks = touareg == touaregOther; // sravnenie po ss6lke
        boolean resultEquals = touareg.equals(touaregOther); // sravnenie po sodrsjimomu objektov

        //Напишите фрагмент кода в классе Main который найдет самый дорогой автомобиль.
        Cars[] carsPrices_NISSAN = {micra, leaf, juke, qashqai, x_trail}; //rabonaet nolko s nissan massivom
        Cars[] carsPrices_VW = {bora, jetta, passat, tiquan, touareg}; //rabonaet nolko s vw massivom

        int maxPrice = carsPrices_VW[0].price;
        for (int i = 1; i < carsPrices_VW.length; i++) {
            if (carsPrices_VW[i].price > maxPrice) {
                maxPrice = carsPrices_VW[i].price;
            }
        }
        System.out.println("Sam6j dorogoj avto: " + maxPrice);

        System.out.println("Link comparison: " + resultLinks);
        System.out.println("Eguals coparation: " + resultEquals);

        getMaxPrice(carsPrices_VW);
        sortAndPrintArrayOfCa(carsPrices_VW);
    }

}

