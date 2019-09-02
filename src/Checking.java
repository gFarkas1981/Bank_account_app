public class Checking extends Account {

    // List properties specific to the checking account
    int debitCardNumber;
    int debitCardPIN;


    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {

        super(name, sSN, initDeposit);

        System.out.println("New checking account");

    }

    // List any methods specific to the checking account

}
