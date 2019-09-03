public class Savings extends Account {

    // List properties specific to the savings account
    private String safetyDepositBoxID;
    private String safetyDepositBoxKey;

    private RandomGenerator randomGenerator = new RandomGenerator();

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {

        super(name, sSN, initDeposit);

        accountnumber = "1" + accountnumber;

        setSafetyDepositBox();

    }

    private void setSafetyDepositBox() {

        // Generating 3 digit random number
        safetyDepositBoxID = randomGenerator.random(3).toString();

        randomGenerator = new RandomGenerator();

        // Generating 4 digit random number
        safetyDepositBoxKey = randomGenerator.random(4).toString();

    }

    // List any methods specific to the savings account
    public void showInfo() {

        System.out.println("Account type: Savings");

        super.showInfo();

        System.out.println(
                "Your savings account features\n" +
                        "Safety Deposit Box ID: " + safetyDepositBoxID + "\n" +
                        "Safety Deposit Box Key: " + safetyDepositBoxKey
        );

    }

}
