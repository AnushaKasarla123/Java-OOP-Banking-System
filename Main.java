import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();

                    System.out.println("1. Savings");
                    System.out.println("2. Current");

                    int type = sc.nextInt();

                    Account account;

                    if (type == 1) {
                        account = new SavingsAccount(accNo, name);
                    } else {
                        account = new CurrentAccount(accNo, name);
                    }

                    bank.addAccount(account);

                    System.out.println("Account Created Successfully.");

                    break;

                case 2:

                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    Account depositAcc = bank.findAccount(accNo);

                    if (depositAcc != null) {

                        System.out.print("Enter Amount: ");

                        double amount = sc.nextDouble();

                        depositAcc.deposit(amount);

                    } else {

                        System.out.println("Account Not Found.");

                    }

                    break;

                case 3:

                    System.out.print("Enter Account Number: ");

                    accNo = sc.nextInt();

                    Account withdrawAcc = bank.findAccount(accNo);

                    if (withdrawAcc != null) {

                        System.out.print("Enter Amount: ");

                        double amount = sc.nextDouble();

                        withdrawAcc.withdraw(amount);

                    } else {

                        System.out.println("Account Not Found.");

                    }

                    break;

                case 4:

                    System.out.print("Enter Account Number: ");

                    accNo = sc.nextInt();

                    Account viewAcc = bank.findAccount(accNo);

                    if (viewAcc != null) {

                        viewAcc.displayBalance();

                    } else {

                        System.out.println("Account Not Found.");

                    }

                    break;

                case 5:

                    System.out.println("Thank You!");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}