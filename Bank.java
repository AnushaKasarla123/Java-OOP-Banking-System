import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }
}