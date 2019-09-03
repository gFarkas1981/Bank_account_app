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
    public Account(String name, String sSN, double initDeposit) {

        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        //Set account number
        index++;
        this.accountnumber = setAccountNumber();

        setRate();

    }

    public abstract void setRate();

    private String setAccountNumber() {

        String lastTwoOfSSN = sSN.substring(sSN.length() - 2);

        int uniqueID = index;


        // Generating 3 digit random number
        String randomNumber = randomGenerator.random(3).toString();

        return lastTwoOfSSN + uniqueID + randomNumber;

    }

    // List common methods - transactions
    public void deposit(double amount) {

        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();

    }

    public void withdraw(double amount) {

        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();

    }

    public void transfer(String toWhere, double amount) {

        System.out.println("Transferring $" + amount + " to " + toWhere);
        balance -= amount;
        printBalance();

    }

    public void printBalance() {

        System.out.println("Your balance is now: $" + balance);

    }

    public void showInfo() {

        System.out.println(
                "Name: " + name + "\n" +
                        "Account number: " + accountnumber + "\n" +
                        "Balance: " + balance + "\n" +
                        "Rate: " + this.rate + "%"
        );

    }

}
