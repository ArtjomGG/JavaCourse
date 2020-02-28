package lesson11.generic;

public class GoverInsCo extends InsuranceCo<CitizenIns> {
    @Override
    protected void registratePolicyLocally(CitizenIns person_ins) {
        System.out.println("Registrate in Gov InsComp...");
    }
}
