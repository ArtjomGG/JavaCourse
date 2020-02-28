package myClasses;

//POJO class!

public class Triangel {

    public Triangel(int aStorona, int bStorona, int cStorona) { // CONSTRUKTOR

        chekTriangelPossibiliti(aStorona, bStorona, cStorona);
        chekForZeros(aStorona, bStorona, cStorona);

        this.aStorona = aStorona;
        this.bStorona = bStorona;
        this.cStorona = cStorona;

        // переменные задали при вызове метода в main-e
        if (aStorona + bStorona > cStorona && bStorona + cStorona > aStorona) {
            System.out.println("Vzmozhno");
        } else {
            System.out.println("Ne vzmozhno");
        }
    }

    private int aStorona;
    private int bStorona;
    private int cStorona;

    // stavim pered metodom "PRIVATE" chtob6 viden b6l tolko v classe TRIANGEL

    private void chekTriangelPossibiliti(int aStorona, int bStorona, int cStorona) {
        if (aStorona + bStorona > cStorona && bStorona + cStorona > aStorona)
            System.out.println("metod chekTriangelPossibiliti Vzmozhno");
        else {
            System.out.println("metod chekTriangelPossibiliti Ne vzmozhno");
        }
    }

    private void chekForZeros(int aStorona, int bStorona, int cStorona) {
        /*if (aStorona > 0 && bStorona > 0 && cStorona > 0) {
            System.out.println("metod Vzmozhno");
        } else {
            System.out.println("metod Ne vzmozhno");
        }*/

        chekForZerosforSetter(aStorona);
        chekForZerosforSetter(bStorona);
        chekForZerosforSetter(cStorona);
    }

    private void chekForZerosforSetter(int paramName) {
        if (paramName > 0) {
            System.out.println("metod chekForSetter Vzmozhno");
        } else {
            System.out.println("metod chekForSetterNe vzmozhno");
            throw new IllegalArgumentException();
        }
    }

    public double calculatePerimetr() {
        double perimetr = this.aStorona + this.bStorona + this.cStorona;
        return perimetr;
    }

    public double calculateSquare() {

        double hOfP = (calculatePerimetr()) / 2;
        double square = Math.sqrt((hOfP * (hOfP - aStorona) * (hOfP - bStorona) * (hOfP - cStorona)));
        return square;
    }

    public int getAStorona() {
        return this.aStorona;
    }

    public void setAStrona(int aStorona) {
        chekForZerosforSetter(aStorona);
        this.aStorona = aStorona;
    }

    public int getBStorona() {
        return this.bStorona;
    }

    public void setBstorona(int bStorona) {
        chekForZerosforSetter(bStorona);
        this.bStorona = bStorona;
    }

    public int getCStorona() {
        return this.cStorona;
    }

    public void setCstorona(int cStorona) {
        chekForZerosforSetter(cStorona);
        this.cStorona = cStorona;
    }

}
