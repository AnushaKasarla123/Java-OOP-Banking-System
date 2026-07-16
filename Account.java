public abstract class Account {

    private int accountNumber;
    private String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        }
    }

    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : ₹" + balance);
    }
}