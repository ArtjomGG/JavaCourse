package lesson18;

import java.util.stream.Stream;

public class Mark {

    @MyLog
    public void doSmth () {
        Stream.iterate(3, i->i+3).limit(10).forEach(i-> System.out.println(" i = " + i));
    }

    @MyLog
    public int getRandom1 () {
        System.out.println(" .getRandom () : ");
        return 2;
    }

    public int getRandom2 () {
        System.out.println(" .getRandom @ () : ");
        return 5;
    }

}
