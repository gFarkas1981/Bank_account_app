public class Savings extends Account {

    // List properties specific to the savings account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {

        super(name, sSN, initDeposit);

        System.out.println("New Savings account");

    }

    // List any methods specific to the savings account

}
