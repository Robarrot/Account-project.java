
class Account {

    private final double accID;
    private final String name;
    private double balance;

    public Account(double accountID, String accountName, double amount) {
        accID = accountID;
        name = accountName;
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getID() {
        return accID;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }

    void print() {
        System.out.println("\nAccount ID= " + accID);
        System.out.println("Name= " + name);
        System.out.println("Balance= " + balance);
    }

    public boolean transfer(Account account, double amount) {
        if (!withdraw(amount)) {
            return false;
        } else {
            account.deposit(amount);
            return true;
        }
    }

    public static void main(String[] args) {
        Account dad = new Account(accountID:123.0, accountName:"RobaKing", amount:2500.0);
        Account mum = new Account(accountID:100.0, accountName:"MercyKing", amount:3000.0);
        dad.deposit(1200);
        System.out.println("Dad's balance is " + dad.getBalance());
    }
}
