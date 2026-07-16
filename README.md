# Java OOP Banking System

##  Project Overview

The **Java OOP Banking System** is a console-based application developed using **Core Java** to demonstrate the four fundamental Object-Oriented Programming (OOP) concepts:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

The application allows users to create bank accounts, deposit money, withdraw money, and check account balances through a menu-driven console interface.

---

## 🚀 Features

* Create a new bank account
* Support for multiple account types

  * Savings Account
  * Current Account
* Deposit money
* Withdraw money
* View account balance
* Menu-driven console application
* Object-Oriented design

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections (`ArrayList`)
* Scanner Class
* Console Application

---

##  Project Structure

```text
Java-OOP-Banking-System/
│── Main.java
│── Bank.java
│── Account.java
│── SavingsAccount.java
│── CurrentAccount.java
│── Customer.java
│── README.md
```

---

## 🏗️ OOP Concepts Demonstrated

### 1. Encapsulation

* Data members are declared as `private` or `protected`.
* Access to account information is provided through methods.

### 2. Abstraction

* `Account` is implemented as an abstract class.
* Common functionality is defined in the parent class while specific behavior is left to child classes.

### 3. Inheritance

* `SavingsAccount` and `CurrentAccount` extend the `Account` class.
* Common functionality is reused through inheritance.

### 4. Polymorphism

* The `withdraw()` method is overridden by each account type.
* The appropriate implementation is selected at runtime.

---

##  How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

##  Sample Menu

```text
===== BANK MENU =====

1. Create Account
2. Deposit
3. Withdraw
4. View Balance
5. Exit
```

---

## Sample Output

```text
===== BANK MENU =====

1. Create Account
2. Deposit
3. Withdraw
4. View Balance
5. Exit

Enter Choice: 1

Enter Account Number: 101
Enter Holder Name: Anusha

1. Savings
2. Current

Account Created Successfully.

Enter Choice: 2
Enter Account Number: 101
Enter Amount: 5000

Amount Deposited Successfully.

Enter Choice: 4

Account Number : 101
Account Holder : Anusha
Balance : ₹5000.0
```

---

## Future Enhancements

* Transaction history
* Money transfer between accounts
* Interest calculation for savings accounts
* Account deletion
* File-based data storage
* Database integration using MySQL
* Graphical User Interface (JavaFX or Swing)

---

## Author

**Anusha Kasarla**

* B.Tech – Computer Science & Engineering
* Passionate about Java, Spring Boot, and Software Development

---

## License

This project is created for learning and educational purposes.
