package Problem1;


public class TestAccount {
    public static void main(String[] args) {
        // Create two Accounts
        Account acc1 = new Account("A001", "John Doe", 5000);
        Account acc2 = new Account("A002", "Jane Doe", 4000);

        //Display balance of both accounts
        System.out.println("Initial Balances");
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());

        // Transfer $1000 from account 1 to account 2
        acc1.transferTo(acc2, 1000);

        // Display Balance of both accounts again
        System.out.println("Balances After Transfer");
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());
    }
}
