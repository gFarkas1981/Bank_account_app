public class Savings extends Account {

    // List properties specific to the savings account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {

        super(name, sSN, initDeposit);

        accountnumber = "1" + accountnumber;

    }

    // List any methods specific to the savings account
    public void showInfo() {

        super.showInfo();
        System.out.println("Account type: Savings");

    }

}
