package lesson11.generic;

public class PrivateInsCo extends InsuranceCo<EmployeeIns> {

    @Override
    protected void registratePolicyLocally(EmployeeIns person_ins) {
        System.out.println("Registrate in Private_InsCOMP...");
    }
}
