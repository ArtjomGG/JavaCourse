package lesson8;

public enum L8CarState { // staticheskij class dlja konstant
    EXL(5),
    GOOD(4),
    AVRG(3),
    REPAIR(2),
    XLAM(1);

    L8CarState(int rate) {
        this.rate = rate;
    }

    private int rate;

    public int getRate() {
        return rate;
    }
}
