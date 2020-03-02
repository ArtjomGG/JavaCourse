package utils;

import lesson17.MyException;
import lesson17.MyException;

public class ExeptionsUtils {

    // NAdo skazat' chto metod6 proverjaem6e
// Esli metod chekedExeption(proverjaem6e) to nado ih definirovat' i obrabatovat'
    public static void throwExperemet (String message) throws Throwable { // Sodershit v sebe - Exeption, RubTimeExp.., Error,
        Throwable throwable= new Throwable(message);
        throw throwable;
    }

    public static void errorExperimet (String message){
        Error error = new Error(message);
        throw error;
    }
    // Esli metod chekedExeption(proverjaem6e) to nado ih definirovat' i obrabatovat'
    public static void exeptionExperimet (String message) throws Exception {
        Exception exception= new Exception(message);
        throw exception;
    }

    public static void myExeptionExperimet () throws MyException {
        MyException exception= new MyException();
        throw exception;
    }

    public static void runtimeExeptionExperimet (String message){
        RuntimeException runtimeException= new RuntimeException(message);
        throw runtimeException;
    }


}
