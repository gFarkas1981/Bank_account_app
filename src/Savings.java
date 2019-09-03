public class Savings extends Account {

    // List properties specific to the savings account
    private String safetyDepositBoxID;
    private String safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {

        super(name, sSN, initDeposit);

        accountnumber = "1" + accountnumber;

        setSafetyDepositBox();

    }

    @Override
    public void setRate() {

        rate = getBaseRate() - .25;

    }

    private void setSafetyDepositBox() {

        // Generating 3 digit random number
        RandomGenerator randomGenerator = new RandomGenerator();
        safetyDepositBoxID = randomGenerator.random(3).toString();



        // Generating 4 digit random number
        randomGenerator = new RandomGenerator();
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
