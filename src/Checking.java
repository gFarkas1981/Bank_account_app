public class Checking extends Account {

    private RandomGenerator randomGenerator = new RandomGenerator();

    // List properties specific to the checking account
    private String debitCardNumber;
    private String debitCardPIN;


    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {

        super(name, sSN, initDeposit);

        accountnumber = "2" + accountnumber;

        setDebitCard();

    }

    @Override
    public void setRate() {

        rate = getBaseRate() * 0.15;
    }

    private void setDebitCard() {

        // Generating 3 digit random number
        debitCardPIN = randomGenerator.random(3).toString();

        randomGenerator = new RandomGenerator();

        // Generating 12 digit random number
        debitCardNumber = randomGenerator.random(12).toString();

    }

    // List any methods specific to the checking account
    public void showInfo() {

        super.showInfo();

        System.out.println(
                "Your Checking Account Features\n" +
                        "Debit Card Number: " + debitCardNumber + "\n" +
                        "Debit Card Pin: " + debitCardPIN
        );

    }
}
