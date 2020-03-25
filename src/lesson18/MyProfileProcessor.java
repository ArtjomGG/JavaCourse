package lesson18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;

public class MyProfileProcessor {

    public void executeWithProfile (Object object, String methodName) {
        Class<?> klass = object.getClass();
        Method[] methods = klass.getMethods();

        Method method1 = Arrays.asList(methods).stream()
                .filter(method -> method.getName().equals(methodName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No Such Metod in object" + methodName));
        try {
            long timeBefore = System.currentTimeMillis();
            method1.invoke(object);
            long timeAfter = System.currentTimeMillis();
            long executionTime = timeAfter - timeBefore;
            System.out.println("\n Execution time of " + methodName + ": " + executionTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
