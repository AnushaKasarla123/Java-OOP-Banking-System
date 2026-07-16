public class SavingsAccount extends Account {

    private final double MIN_BALANCE = 500;

    public SavingsAccount(int accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
    }

    @Override
    public void withdraw(double amount) {

        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Minimum balance should be ₹500.");
        }
    }
}