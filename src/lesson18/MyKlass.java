package lesson18;

import java.util.stream.Stream;

public class MyKlass {

    @MyProfile
    public void do1(){
        Stream.iterate(1, integer -> integer+1)
                .limit(10_000)
                .forEach(i-> System.out.print("iteration"));
    }

    public void do2 () {
        for (int j = 0; j < 10_000; j++) {
            System.out.print("Iteration");
        }
    }

    @MyProfile
    public void do3 () {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
