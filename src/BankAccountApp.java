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

            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);

        }

    }

}
