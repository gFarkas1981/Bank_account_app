public class BankAccountApp {

    public static void main(String[] args) {

        Checking chkacc1 = new Checking("John Doe", "453535365", 1500);

        Savings savacc1 = new Savings("Rich Lowe", "467384658", 2500);

        chkacc1.showInfo();

        System.out.println("************************");

        savacc1.showInfo();


        // Read a CSV File then create new accounts based on that data

    }

}
