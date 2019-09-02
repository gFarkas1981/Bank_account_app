public class Checking extends Account {

    // List properties specific to the checking account
    int debitCardNumber;
    int debitCardPIN;


    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {

        super(name, sSN, initDeposit);

        accountnumber = "2" + accountnumber;

        System.out.println("Account number: " + this.accountnumber);

        System.out.println("New checking account");

    }

    // List any methods specific to the checking account

}
