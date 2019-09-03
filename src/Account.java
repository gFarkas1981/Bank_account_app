public abstract class Account implements IRate {

    private static int index = 10000;
    String accountnumber;
    double rate;
    private RandomGenerator randomGenerator = new RandomGenerator();
    // List common properties for saving and checking accounts
    private String name;
    private String sSN;
    private double balance;

    // Constructor to set base properties and initialize the account
    Account(String name, String sSN, double initDeposit) {

        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        //Set account number
        index++;
        this.accountnumber = setAccountNumber();

    }

    private String setAccountNumber() {

        String lastTwoOfSSN = sSN.substring(sSN.length() - 2);

        int uniqueID = index;


        // Generating 3 digit random number
        String randomNumber = randomGenerator.random(3).toString();

        return lastTwoOfSSN + uniqueID + randomNumber;

    }

    // List common methods
    public void showInfo() {

        System.out.println(
                "Name: " + name + "\n" +
                        "Account number: " + accountnumber + "\n" +
                        "Balance: " + balance
        );

    }

}
