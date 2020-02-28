package lesson10.algorithms;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AlgorithmObj {

    public static void main(String[] args) {

        // O(1)

        int[] arraySmall = AlgorithmUtils.genarateArray(3);
        int[] arrayBig = AlgorithmUtils.genarateArray(99);

        long timeStart = LocalDateTime.now().getNano();
        AlgorithmUtils.printLength(arraySmall);
        long timeFinish = LocalDateTime.now().getNano();
        long execTime = timeFinish - timeStart;
        System.out.println("Exec Time Small :" + execTime);

        timeStart = LocalDateTime.now().getNano();
        AlgorithmUtils.printLength(arrayBig);
        timeFinish = LocalDateTime.now().getNano();
        execTime = timeFinish - timeStart;
        System.out.println("Exec Time Big :" + execTime);

        //O(n)

        /*int[] arraySmall = AlgorithmUtils.genarateArray(3);
        int[] arrayBig = AlgorithmUtils.genarateArray(99);

        long timeStartMAX = LocalDateTime.now().getNano();
        AlgorithmUtils.printMax(arraySmall);
        long timeFinish = LocalDateTime.now().getNano();
        long execTime = timeFinish - timeStart;
        System.out.println("Exec Time SmallMAX :" + execTime);

        timeStart = LocalDateTime.now().getNano();
        AlgorithmUtils.printMax(arrayBig);
        timeFinish = LocalDateTime.now().getNano();
        execTime = timeFinish - timeStart;
        System.out.println("Exec Time BigMAX :" + execTime);
*/
        // Array chetko trebuet object6 CARS i nelzja dobavit' drugie object6 (naprimer POINTS)
        /*ArrayList <L8Cars> arrayList = new ArrayList<>();
        arrayList.add(new Point(1,2));*/

        AlgorithmUtils.genarateArrayList();

        List<String> arrayList = new ArrayList<>();
        arrayList.add("RED");
        arrayList.add("GREEN");
        arrayList.add("BLUE");
        arrayList.add("ORANGE");
        arrayList.add("RED");
        arrayList.add("WHITE");
        arrayList.add("BLACK");
        arrayList.add("ORANGE");
        arrayList.add("RED");
        arrayList.add("WHITE");
        arrayList.add("BLACK");

        System.out.println("ArreyList SIZE is " + arrayList.size());
        System.out.println("ArreyList is " + arrayList);
        System.out.println("Elent of ArreyList is " + arrayList.get(2));
        System.out.println("Index of " + arrayList.indexOf("BLACK") );
        System.out.println("**************************************");
        arrayList.set(0, "WHITE");
        System.out.println("ArreyList is " + arrayList);


        //AlgorithmUtils.printArrayList(arrayList);

        AlgorithmUtils.calcFactorial(8);

    }
}
