public abstract class Account implements IRate {

    // List common properties for saving and checking accounts
    String name;
    String sSn;
    double balance;

    String accountnumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name) {

        System.out.println("Name: " + name);
        System.out.print("New account: --> ");


    }

    // List common methods

}
