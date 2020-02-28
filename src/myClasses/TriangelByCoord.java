package myClasses;

public class TriangelByCoord {

    public double xA;
    public double yA;
    public double xB;
    public double yB;
    public double xC;
    public double yC;

    public TriangelByCoord(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
        this.xC = xC;
        this.yC = yC;

        // metod na opredelenie odnoj prjamoj

    }

    public double findSideAB() {
        double sideAB = Math.sqrt((Math.pow((this.xB - this.xA),2.0)) + (Math.pow((this.yB - this.yA),2.0)));
        return sideAB;
    }

    public double findSideAC() {
        double sideAC = Math.sqrt(((xC - xA) * (xC - xA)) + ((yC - yA) * (yC - yA)));
        return sideAC;
    }

    public double findSideBC() {
        double sideBC = Math.sqrt(((xC - xB) * (xC - xB)) + ((yC - yB) * (yC - yB)));
        return sideBC;
    }

    public double perimetrByCoord() {
        double perimetrCoord = findSideAB() + findSideAC() + findSideBC();
        return perimetrCoord;
    }

    public double squareByCoord() {
        double squareCoord =  Math.abs((((xB - xA) * (yC - yA) - (xC - xA) * (yB - yA)) / 2));
        return squareCoord;
    }

    public void chekForOneLine () {

    }


    public double getxA() {
        return this.xA;
    }

    public double getyA() {
        return this.yA;
    }

    public double getxB() {
        return this.xB;
    }

    public double getyB() {
        return this.yB;
    }

    public double getxC() {
        return this.xC;
    }

    public double getyC() {
        return this.yC;
    }

    public void setxA(double xA) {
        this.xA = xA;
    }

    public void setyA(double yA) {
        this.yA = yA;
    }

    public void setxB(double xB) {
        this.xB = xB;
    }

    public void setyB(double yB) {
        this.yB = yB;
    }

    public void setxC(double xC) {
        this.xC = xC;
    }

    public void setyC(double yC) {
        this.yC = yC;
    }

    @Override
    public String toString() {
        return "TriangelByCoord{" +
                "xA=" + xA +
                ", yA=" + yA +
                ", xB=" + xB +
                ", yB=" + yB +
                ", xC=" + xC +
                ", yC=" + yC +
                '}';
    }
}
