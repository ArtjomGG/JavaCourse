package Lesson18;

import lesson11.generic.EmployeeIns;
import lesson8.L8CarState;
import lesson8.L8Cars;
import lesson8.L8PassCars;
import lesson8.L8Truks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Lesson18Refl {
    public static void main(String[] args) {

        Object obj = new Object();
        System.out.println(" .getName() : " + obj.getClass().getName());

        L8Cars car = new L8PassCars("PASS", "BENTLEY", 2015, L8CarState.EXL, 4);
        Class<?> carClass = car.getClass(); // carClass objekt klassa CLASS , "?" znachit ljuboj generik
        System.out.println(" .getName() : " + carClass.getName());


        // Klass Constructor ivljaetsja
        Constructor<?>[] passCarconstructors = carClass.getConstructors();
        System.out.println(" getConstructors() : " + passCarconstructors.length);
        System.out.println(" Constructors info : " + passCarconstructors);

        Method[] carClassMethods = carClass.getMethods();
        System.out.println(".getMethods() : " + carClassMethods.length);
        System.out.println("All metod names : ");
        Arrays.asList(carClassMethods).forEach(method -> System.out.println(method.getName()));
        System.out.println();

        System.out.println("======================================================================");

        Method[] carClassDeclaredMethods = carClass.getDeclaredMethods();
        System.out.println(" getDeclaredMethods() : " + carClassDeclaredMethods.length);
        System.out.println("All declared methods ");
        Arrays.asList(carClassDeclaredMethods).forEach(method -> System.out.println(method.getName()));
        System.out.println();

        System.out.println("======================================================================");

        Field[] carClassFields = carClass.getFields();
        System.out.println(" .getFields() : " + carClassFields.length);
        System.out.println("All Fields : ");
        Arrays.asList(carClassFields).forEach(field -> System.out.println(field.getName()));
        System.out.println();

        System.out.println("======================================================================");

        Field[] carClassDeclaredFields = carClass.getDeclaredFields();
        System.out.println(".getDeclaredFields() : " + carClassDeclaredFields.length);
        System.out.println("All Fields : ");
        Arrays.asList(carClassDeclaredFields).forEach(field -> System.out.println(field.getName()));
        System.out.println();

        System.out.println("======================================================================");

        Class<?> truckClass = L8Truks.class;

        Constructor<?>[] truckConstr = truckClass.getConstructors();
        System.out.println(" truckClass.getConstructors() : " + truckConstr.length);
        System.out.println();

        System.out.println("======================================================================");

        Constructor<?>[] truckDeclaredlConstr = truckClass.getDeclaredConstructors();
        System.out.println(".getDeclaredConstructors() : " + truckDeclaredlConstr.length);
        System.out.println("All Declaredl Constr : ");
        Arrays.asList(truckDeclaredlConstr).forEach(constructor -> System.out.println(constructor.getName()));
        System.out.println();

        System.out.println("======================================================================");

        Constructor<?>[] truckDeclaredlConstr2 = L8Truks.class.getDeclaredConstructors();
        System.out.println(".getDeclaredConstructors() : " + truckDeclaredlConstr.length);
        System.out.println("All Declaredl Constr : ");
        Arrays.asList(truckDeclaredlConstr).forEach(constructor -> System.out.println(constructor.getName()));
        System.out.println();

        System.out.println("======================================================================");

        System.out.println(" Dobratsja do secretnogo metoda i najti porol' v Persons > Employee ");

        Object secretObject = new EmployeeIns("Globa", 66, "Astrolog", 50000);
        Class<?> secretObjectClass = secretObject.getClass();
        Method[] secretObjectMethods = secretObjectClass.getDeclaredMethods();

        Method secretMethod = Arrays.asList(secretObjectMethods).stream()
                .filter(method -> method.getName().toLowerCase().contains("secret")).findAny()
                .orElseThrow(() -> new RuntimeException("No Secret Methods "));

        try {// invokeResult = secretMethod.invoke(secretObject) trebuet otrabotat/ na oshibki try/cath
            secretMethod.setAccessible(true); // dostat' metod v prineditelnom porjadke
            Object invokeResult = secretMethod.invoke(secretObject);
            System.out.println(invokeResult.getClass().getName());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        System.out.println(" Processor Example : " );

        Mark markObj = new Mark();
        MyLogProcessor.process(markObj);


    }
}
