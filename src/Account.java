public abstract class Account implements IRate {

    // List common properties for saving and checking accounts
    String name;
    String sSN;
    double balance;

    String accountnumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {

        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        System.out.println("Name: " + name + " SSN: " + sSN + " Balance: " + balance);
        System.out.print("New account: --> ");


    }

    // List common methods

}
