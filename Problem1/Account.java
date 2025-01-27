package Problem1;


public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // Constructor w/ id and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Constructor w/ id, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter for id
    public String getID(){
        return id;
    }
    
    // Getter for name
    public String getName(){
        return name;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }
    
    // Add amount to balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Subtract amount from balance if sufficient

    public int debit(int amount) {
        if (amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer amount to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Return account details as a string
    @Override
    public String toString() {
        return "Account[id =" + id + ", name=" + name + ", balance=" + balance +"]";
    }
}

