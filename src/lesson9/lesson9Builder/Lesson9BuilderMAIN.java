package lesson9.lesson9Builder;

public class Lesson9BuilderMAIN {
    public static void main(String[] args) {

        Body body = new Body();
        Engine engine = new Engine();
        Missile missile = new Missile();

        Builder builder = new Builder();
        builder.addBody(body).addEngine(engine);
        System.out.println("Take some time...");

        builder.addMissile(missile);
        Vessel newVessel = builder.build();
    }
}
