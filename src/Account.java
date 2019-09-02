public abstract class Account implements IRate {

    // List common properties for saving and checking accounts
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountnumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {

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
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));

        // if we have only two digit
        if (randomNumber < 100) randomNumber = Integer.valueOf("0" + randomNumber);

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
