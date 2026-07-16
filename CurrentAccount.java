public class CurrentAccount extends Account {

    public CurrentAccount(int accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}