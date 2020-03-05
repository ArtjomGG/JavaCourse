package lesson17;

import lesson11.generic.CitizenIns;
import lesson11.generic.EmployeeIns;
import lesson11.generic.PersonIns;
import lesson8.L8CarState;
import lesson8.L8Cars;
import lesson8.L8PassCars;
import lesson9.lesson9Proto.Cloneable;
import utils.ExeptionsUtils;

import java.io.*;

public class Lesson17Exeptions {

    public static void main(String[] args) { //throws Throwable // perv6j variant{

        System.out.println("Hello from lesson 17...");

        //RuntimeException myExeption = new RuntimeException(); // esli prosto sosdali, to nichego ne proizojdet
        //throw myExeption; // pri vbrose ne delaet kompiljacij

       /* //Error myError = new Error();
        if (1 == 1) { // pri sosdanii uslovija( "CONDOTION"), mozhno obojti kompeljator
            //throw myExeption;
            throw myError; // v6vodit stackTrace
        }
*/

        //ExeptionsUtils.throwExperemet("MyThrowable");

        /*try {
            ExeptionsUtils.throwExperemet("My Throwable TryCath!!!");
        } catch (Throwable thr) {
            thr.printStackTrace();
            System.out.println("Detail message: " + thr.getMessage());
            throw new RuntimeException(thr);
        }*/


        //ExeptionsUtils.runtimeExeptionExperimet("My RUNTIME !!!");

        /*try {
            ExeptionsUtils.runtimeExeptionExperimet("My RUNTIME TryCath!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }*/



    /*    int i = 1;

        try {
            if (i == 1) {
                ExeptionsUtils.exeptionExperimet("From Exception");
            } else {
                ExeptionsUtils.myExeptionExperimet();
            }
        }*/
        // Otlov iscljuchenij nachinaetsja ot sam6h specificheskih k obs'him

     /*   catch (MyException myE) {
            myE.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable thr) {
            thr.printStackTrace();
        } finally { // Block FINNALY v6polnjaetsja vsegda
            System.out.println("Hello from Finnaly");
        }*/

        /*try {
            BufferedReader reader = new BufferedReader(new FileReader("c://t.txt"));
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert e-mail");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert e-mail");
            e.printStackTrace();
        } finally {
            reader.close();
        }*/

        // Delaem ss6lku, chtob6 b6lo vidna vsem, dalee

        /*BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("c://t.txt"));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert e-mail");

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("send alert e-mail ...");

            }*/

        try (
                Closeable myResors = () -> System.out.println("Hello from  Closeable");
                BufferedReader reader = new BufferedReader(new FileReader("c://t.txt"))
        ) {
            String line = reader.readLine();
            System.out.println("Logic after File is READ");
            System.out.println(myResors);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert e-mail");

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert e-mail ...");

        }

        System.out.println("Hello from lesson ...17...");

        //L8Cars carForExeption = new L8PassCars("Pass", "BMW", 1980, L8CarState.XLAM, 5);
        PersonIns ivan = new EmployeeIns("Ivan"," ", 17);

        //System.out.println(carForExeption);
        System.out.println(ivan);
    }
}

