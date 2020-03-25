package lesson19;

public class MyThread extends Thread {

    //1 sposob: unosledovatsja ot klassa THREAD

    public MyThread(Runnable target, String name) {
        super(target);
        setName(name);
    }
}
