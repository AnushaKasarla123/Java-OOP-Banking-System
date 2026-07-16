public class Customer {

    private int customerId;
    private String customerName;
    private Account account;

    public Customer(int customerId, String customerName, Account account) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String getCustomerName() {
        return customerName;
    }
}