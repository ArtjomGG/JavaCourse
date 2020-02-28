package practicsFromBooks;

//import java.applet.Applet;

public class Kids { //extends Applet {
    int boredFactor = 3; // сколько раз пока не сдаться
    String message = " ";
    String messageQuit = " ";

    public void myTurn(Kids WhozNext) {
        if (boredFactor-- <= 0) {
            System.out.println(messageQuit);
        } else {
            System.out.println(message);
            WhozNext.myTurn(this);
        }
    }

    /*public void init() {
        Kids Bobby, Kenny;
        Bobby = new Kids();
        Bobby.message = "Kenny, you did that!!! ";
        Bobby.boredFactor = 4;
        Bobby.messageQuit = "Fine! ";
        Kenny = new Kids();
        Kenny.message = "Bobby, you did that!!! ";
        Kenny.messageQuit = "Fine! ";
        Kenny.myTurn(Bobby);
    }*/

    public static void main(String[] args) {
        Kids Bobby, Kenny;
        Bobby = new Kids();
        Bobby.message = "Kenny, you did that!!! ";
        Bobby.boredFactor = 1;
        Bobby.messageQuit = "Fine! (Bobby) ";
        Kenny = new Kids();
        Kenny.message = "Bobby, you did that!!! ";
        //Kenny.boredFactor = 2;
        Kenny.messageQuit = "Fine! (Kenny) ";
        Kenny.myTurn(Bobby);
    }

}

