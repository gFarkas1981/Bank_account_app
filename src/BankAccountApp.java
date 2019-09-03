import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        String file = "NewBankAccounts.csv";

//        Checking chkacc1 = new Checking("John Doe", "453535365", 1500);
//
//        Savings savacc1 = new Savings("Rich Lowe", "467384658", 2500);
//
//        chkacc1.showInfo();
//
//        System.out.println("************************");
//
//        savacc1.showInfo();
//
//        System.out.println("************************");
//        System.out.println("************************");
//
//        savacc1.compound();


        // Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = CSV.read(file);

        for (String[] accountHolder : newAccountHolders) {

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if (accountType.equals("Savings")) {

                System.out.println("Open a savings account");

            } else if (accountType.equals("Checking")) {

                System.out.println("Open a checking account");

            } else {

                System.out.println("Error reading account type");

            }

        }

    }

}
